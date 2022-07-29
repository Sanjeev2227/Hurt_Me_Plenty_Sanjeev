package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.CalculatorPage;
import org.example.pages.OpenPage;
import org.example.pages.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertTrue;

public class BaseTests {
    private static WebDriver driver;

    protected static OpenPage openPage;
    protected static SearchPage searchPage;
    protected static CalculatorPage calculatorPage;


    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        openPage = new OpenPage(driver);
        searchPage = new SearchPage(driver);
        calculatorPage = new CalculatorPage(driver);
    }
   @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}
