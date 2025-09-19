using Microsoft.Playwright;

namespace Optivem.EShop.SystemTest
{
    public class SmokeTest
    {
        [Fact]
        public async Task ShouldOpenLocalhostAndCheckStatus200()
        {
            using var playwright = await Playwright.CreateAsync();
            await using var browser = await playwright.Chromium.LaunchAsync();
            var page = await browser.NewPageAsync();
            var response = await page.GotoAsync("http://localhost:8080");
            Assert.Equal(200, response.Status);
            await browser.CloseAsync();
        }
    }
}