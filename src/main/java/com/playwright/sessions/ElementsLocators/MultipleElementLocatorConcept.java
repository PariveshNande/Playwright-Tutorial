package com.playwright.sessions.ElementsLocators;

import com.microsoft.playwright.*;

import java.util.List;

public class MultipleElementLocatorConcept {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        //Locators(preference given to name visible on screen)
        BrowserContext browserContext = browser.newContext();
        Page page = browserContext.newPage();
        page.navigate("https://www.orangehrm.com/30-day-free-trial");

        Locator countryOptions = page.locator("select#Form_getForm_Country option");
        System.out.println(countryOptions.count());

        //print each country from Locators
        System.out.println("using basic for loop");
        for (int i = 0; i < countryOptions.count(); i++) {
            String countryNames = countryOptions.nth(i).textContent();
            System.out.println(countryNames);
        }
        //using List
        List<String> countryList = countryOptions.allTextContents();


        System.out.println("using advance for loop");
        for (String s : countryList) {
            System.out.println(s);
        }

        //Using for Each
        System.out.println("using for Each (lamda expression)");
        countryList.forEach(e -> {
            System.out.println(e);
        });

        //using stream api
        System.out.println("using stream api");
        countryList.stream().forEach(e -> {
            System.out.println(e);
        });


        browserContext.close();
        browser.close();
        playwright.close();
    }
}
