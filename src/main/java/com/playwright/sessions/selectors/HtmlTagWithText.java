package com.playwright.sessions.selectors;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HtmlTagWithText {

    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
        //String headerText = page.locator("h2:has-text('New Customer')").textContent();
        //or
        String divWithClassText = page.locator("div.card-body h2:has-text('New Customer')").textContent();
        //System.out.println(headerText);
        System.out.println(divWithClassText);

        browser.close();
        playwright.close();
    }
}
