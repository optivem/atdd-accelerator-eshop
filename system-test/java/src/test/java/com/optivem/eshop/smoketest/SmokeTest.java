package com.optivem.eshop.smoketest;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmokeTest {
    @Test
    void shouldOpenLocalhostAndCheckStatus200() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch();
            Page page = browser.newPage();
            Response response = page.navigate("http://localhost:8080");
            assertEquals(200, response.status());
            browser.close();
        }
    }
}
