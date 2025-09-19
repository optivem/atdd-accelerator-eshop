package com.optivem.eshop.system_test;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmokeTest {
    @Test
    void shouldOpenGoogleAndCheckTitle() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch();
            Page page = browser.newPage();
            Response response = page.navigate("https://www.google.com");
            assertEquals(200, response.status());
            browser.close();
        }
    }
}
