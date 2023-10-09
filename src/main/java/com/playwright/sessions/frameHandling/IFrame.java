package com.playwright.sessions.frameHandling;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class IFrame {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");

        //click on img 1st to activate form
        page.locator("img[title='Vehicle-Registration-Forms-and-Examples']").click();

        //access to form which is present inside iframe
        page.frameLocator("//iframe[contains(@id, 'frame-one748593425')]")
                .locator("#RESULT_TextField-1").fill("Yamaha FZ 15");

        page.close();
        playwright.close();

    }
}
