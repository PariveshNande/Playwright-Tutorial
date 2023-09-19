package com.playwright.sessions.selectors;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TextSelectors {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://www.orangehrm.com/30-day-free-trial");
        page.locator("text=Accept Cookies").click();
        page.locator("text=Contact Sales").first().click();
        browser.close();
        playwright.close();
    }
}
