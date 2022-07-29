package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculatorPage extends BasePage {
    private By iframe1 = By.xpath("//iframe[contains(@name,'goog_')]");
    private By instancesField = By.xpath("//md-input-container/child::input[@ng-model='listingCtrl.computeServer.quantity']");
    private By machineSeries = By.xpath("//md-select[@name='series']/parent::md-input-container");
    private By machineModel = By.xpath("//md-option[@value='n1']");
    private By typeOfMachine = By.xpath("//label[text()='Machine type']/parent::md-input-container");
    private By typeCompute = By.xpath("//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']");
    private By addGpuCheckBox = By.xpath("//md-checkbox[@aria-label='Add GPUs']");
    private By numberOfGpus = By.xpath("//md-select[@placeholder='Number of GPUs']");
    private By numberOfGpuModels = By.cssSelector("md-option[value='1'][class='ng-scope md-ink-ripple'][ng-disabled]");
    private By gpuType = By.xpath("//md-select[@placeholder='GPU type']");
    private By gpuTypeModel = By.xpath("//md-option[@value='NVIDIA_TESLA_V100']");
    private By localSSD = By.xpath("//md-select[@placeholder='Local SSD']");
    private By localSSDModel = By.xpath("//md-option[@ng-repeat='item in listingCtrl.dynamicSsd.computeServer'][@value='2']/div[@class='md-text ng-binding']");
    private By dataCentreLoc = By.xpath("//md-select[@placeholder='Datacenter location']");
    private By dataCentreLocFrankfurt = By.xpath("//md-option[@id='select_option_222']/div[@class='md-text ng-binding']");
    private By committedUsage = By.xpath("//md-select[@placeholder='Committed usage']");
    private By committedUsageOneYear = By.cssSelector("div[class='md-select-menu-container md-active md-clickable'] md-option[value='1'][class='md-ink-ripple']");
    private By addEstimate = By.xpath("//button[@aria-label='Add to Estimate']");

    //For checking
    private By informationInVmClassIsRegular = By.xpath("//div[contains (text(),'VM class: regular')]");
    private By informationInInstanceTypeIncludeN1Standard8 = By.xpath("//div[contains (text(),'Instance type: n1-standard-8')]");
    private By regionIsFrankfurt = By.xpath("//div[contains (text(),'Region: Frankfurt')]");
    private By localSsdSpace2x375Gib = By.xpath("//div[contains (text(),'Total available local SSD space 2x375 GiB')]");
    private By commitmentTermOneYear = By.xpath("//div[contains (text(),'Commitment term: 1 Year')]");


    public CalculatorPage(WebDriver driver) {
        super(driver);
    }

    public void fillNumberOfInstancesField(String keyValueNumberOfInstances) throws InterruptedException {

        WebElement firstFrame = driver.findElement(iframe1);
        firstFrame.click();
        driver.switchTo().frame(firstFrame);
        driver.switchTo().frame("myFrame");
        Thread.sleep(5000);

        driver.findElement(instancesField).sendKeys(keyValueNumberOfInstances);
        Thread.sleep(5000);
    }

    public void selectSeriesOfMachines() throws InterruptedException {
        driver.findElement(machineSeries).click();
        Thread.sleep(2000);
        driver.findElement(machineModel).click();

    }

    public void selectMachineType() throws InterruptedException {
        driver.findElement(typeOfMachine).click();
        Thread.sleep(2000);
        driver.findElement(typeCompute).click();
    }

    public void selectAddGpusCheckBox() throws InterruptedException {
        driver.findElement(addGpuCheckBox).click();
        Thread.sleep(2000);

    }

    public void selectGpuType() throws InterruptedException {
        driver.findElement(gpuType).click();
        driver.findElement(gpuTypeModel).click();
        Thread.sleep(2000);
    }

    public void selectNumberOfGPUs() throws InterruptedException {
        driver.findElement(numberOfGpus).click();
        Thread.sleep(2000);
        driver.findElement(numberOfGpuModels).click();
        Thread.sleep(5000);
    }


    public void selectLocalSSD() throws InterruptedException {
        //driver.findElement(By.cssSelector("md-option[value='2'][ng-repeat*='supportedSsd']")).click();
        driver.findElement(localSSD).click();
        Thread.sleep(5000);
        driver.findElement(localSSDModel).click();
        Thread.sleep(2000);
    }

    public void selectDataCentreLocation() throws InterruptedException {
        driver.findElement(dataCentreLoc).click();
        Thread.sleep(5000);
        driver.findElement(dataCentreLocFrankfurt).click();
        Thread.sleep(5000);
    }

    public void selectCommittedUsage() throws InterruptedException {
        driver.findElement(committedUsage).click();
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//md-option[@id='select_option_151']/div[@class='md-text']")).click();
        driver.findElement(committedUsageOneYear).click();
        Thread.sleep(2000);
    }

    public void clickAddToEstimateButton() {
        driver.findElement(addEstimate).click();
    }


    //Checking functions for Testing

    public void checkInformationInVmClassIsRegular() {
        driver.findElement(informationInVmClassIsRegular);
    }

    public void checkInformationInInstanceTypeIncludeN1Standard8() {
        driver.findElement(informationInInstanceTypeIncludeN1Standard8);
    }

    public void checkRegionIsFrankfurt() {
        driver.findElement(regionIsFrankfurt);
    }

    public void checkLocalSsdSpace2x375Gib() {
        driver.findElement(localSsdSpace2x375Gib);
    }

    public void checkCommitmentTermOneYear() {
        driver.findElement(commitmentTermOneYear);
    }

}
