import { chromium } from 'playwright';

describe('Google homepage', () => {
  it('should return status 200', async () => {
    const browser = await chromium.launch();
    const page = await browser.newPage();
    const response = await page.goto('https://www.google.com');
    expect(response?.status()).toBe(200);
    await browser.close();
  });
});