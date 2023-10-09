package com.playwright.sessions.frameHandling;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FrameHandling {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
        Page page = browser.newPage();
        page.navigate("http://www.londonfreelance.org/courses/frames/index.html");

        //By page.frameLocator
        String header = page.frameLocator("frame[name='main']").locator("h2").textContent();
        System.out.println(header);

        //By page.frame
        System.out.println(page.frame("main").locator("h2").textContent());


    }
}
