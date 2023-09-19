package com.playwright.sessions.ElementsLocators;

import com.microsoft.playwright.*;

public class SingleElementLocatorConcept {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        //Locators(preference given to name visible on screen)
        BrowserContext browserContext = browser.newContext();
        Page page = browserContext.newPage();
        page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //Single Element
        Locator userName = page.locator("text = OrangeHRM, Inc");
        userName.hover();
        userName.click();
        System.out.println("OrangeHRM, Inc Link Clicked!");

        browserContext.close();
        browser.close();
        playwright.close();
    }
}
