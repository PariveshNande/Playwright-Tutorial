package com.playwright.sessions.selectors;

import com.microsoft.playwright.*;

public class TextSelectors {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://www.orangehrm.com/30-day-free-trial");
        page.locator("text=Accept Cookies").click();


        //page.locator("text=Privacy Policy").first().click();

        Locator links = page.locator("text=Privacy Policy");
        for (int i = 0; i < links.count(); i++) {
            String textLinks = links.nth(i).textContent();
            if (textLinks.equals("Service Privacy Policy")) {
                links.nth(i).click();
                break;
            }
        }
        browser.close();
        playwright.close();
    }
}
