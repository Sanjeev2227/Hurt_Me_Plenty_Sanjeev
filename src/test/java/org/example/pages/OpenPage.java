package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenPage extends BasePage{
    private By devSiteSearch = By.className("devsite-search-form");
    private By googleSearch = By.xpath("//input[@class='devsite-search-field devsite-search-query']");
    public OpenPage(WebDriver driver){
        super(driver);
    }

    public void openGoogleCloudPage(){

        driver.get("https://cloud.google.com/");
    }

    public void clickOnSearch(){
        driver.findElement(devSiteSearch).click();
    }

    public void googleSearch(String keyForGoogleCloud) throws InterruptedException {

        WebElement textForGoogleSearch = driver.findElement(googleSearch);
        textForGoogleSearch.click();
        textForGoogleSearch.sendKeys(keyForGoogleCloud);
        textForGoogleSearch.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

    }

}
