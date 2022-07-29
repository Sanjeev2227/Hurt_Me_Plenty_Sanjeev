package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {
    private By searchGooglePricingCalculatorPage = By.xpath("//b[text()='Google Cloud Pricing Calculator']");

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void searchAndGoToGoogleCloudPlatformPricingCalculatorPage() throws InterruptedException {
        driver.findElement(searchGooglePricingCalculatorPage).click();
        Thread.sleep(5000);
    }

}
