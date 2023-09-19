package com.playwright.sessions.browserInvocation;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightBasics_ChromeApp {
    /**
     * Open Google Chrome Browser under chromium engine
     */

    public static void main(String[] args) {

        Playwright playwright = Playwright.create();
        BrowserType.LaunchOptions launchOptions = new BrowserType.LaunchOptions();
        //set channel is used to define browser name
        launchOptions.setChannel("chrome");
        launchOptions.setHeadless(false);
        Browser browser = playwright.chromium().launch(launchOptions);
        Page page = browser.newPage();
        System.out.println("Launching Google Chrome under Chromium engine");
        page.navigate("https://www.amazon.com");
        String title = page.title();
        String url = page.url();
        System.out.println("Page title is : " + title);
        System.out.println("Page URL is : " + url);
        browser.close();

        playwright.close();

    }
}
