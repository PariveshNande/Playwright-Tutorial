package com.playwright.sessions.handleShadowDOM;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ShadowDOMElements {
    public static void main(String[] args) {

        /**
         * Page -> DOM -> Shadow DOM -> Elements
         */

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");


        page.close();
        playwright.close();
    }
}
