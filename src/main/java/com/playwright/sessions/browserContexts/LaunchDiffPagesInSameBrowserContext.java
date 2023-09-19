package com.playwright.sessions.browserContexts;

import com.microsoft.playwright.*;

public class LaunchDiffPagesInSameBrowserContext {
    public static void main(String[] args) {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        BrowserContext browserContext1 = browser.newContext();
        Page page1 = browserContext1.newPage();
        page1.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println(page1.title());


        BrowserContext browserContext2 = browser.newContext();
        Page page2 = browserContext2.newPage();
        page2.navigate("https://automationexercise.com/");
        page2.click("//a[normalize-space()='Signup / Login']");
        System.out.println(page2.title());

        BrowserContext browserContext3 = browser.newContext();
        Page page3 = browserContext3.newPage();
        page3.navigate("https://www.google.co.in/");
        System.out.println(page3.title());

        browserContext1.close();
        page1.close();

        browserContext2.close();
        page2.close();

        browserContext3.close();
        page3.close();

        playwright.close();
    }
}
