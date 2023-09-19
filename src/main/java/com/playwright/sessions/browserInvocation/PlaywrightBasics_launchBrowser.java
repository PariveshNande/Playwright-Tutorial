package com.playwright.sessions.browserInvocation;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightBasics_launchBrowser {

    private static String pageTitle;
    private static String url;
    private static Page page;

    public static void main(String[] args) {

        Playwright playwright = Playwright.create();

        /**
         * chromium
         */
        Browser chromium = playwright.chromium().launch();
        page = chromium.newPage();
        page.navigate("https://www.amazon.com");
        pageTitle = page.title();
        System.out.println("page title is : " + pageTitle);
        url = page.url();
        System.out.println("Page URL is : " + url);
        System.out.println("Tested in Chromium Engine");
        //Close browser
        chromium.close();

        /**
         * firefox
         */
        Browser firefox = playwright.firefox().launch();
        page = firefox.newPage();
        page.navigate("https://www.amazon.com");
        pageTitle = page.title();
        System.out.println("page title is : " + pageTitle);
        url = page.url();
        System.out.println("Page URL is : " + url);
        System.out.println("Tested in webkit Engine");
        //Close browser
        firefox.close();

        /**
         * Webkit
         */
        Browser webkit = playwright.webkit().launch();
        page = webkit.newPage();
        page.navigate("https://www.amazon.com");
        pageTitle = page.title();
        System.out.println("page title is : " + pageTitle);
        url = page.url();
        System.out.println("Page URL is : " + url);
        System.out.println("Tested in gecko Engine");
        //Close browser
        webkit.close();

        //Close playwright server
        playwright.close();
    }
}
