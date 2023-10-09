package com.playwright.sessions.selectingVisibleElements;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class SelectingVisibleElements {

    Playwright playwright = Playwright.create();
    Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
    Page page = browser.newPage();
        page.navigate("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");



        page.close();
        playwright.close();

}
