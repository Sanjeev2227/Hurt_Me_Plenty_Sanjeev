package org.example;

import org.testng.annotations.Test;

public class CalculatorPageTests extends BaseTests {

    @Test
    public void CalculatorPageTest() throws InterruptedException {
        openPage.openGoogleCloudPage();
        openPage.clickOnSearch();
        openPage.googleSearch("Google Cloud Platform Pricing Calculator");

        searchPage.searchAndGoToGoogleCloudPlatformPricingCalculatorPage();

        calculatorPage.fillNumberOfInstancesField("4");
        calculatorPage.selectSeriesOfMachines();
        calculatorPage.selectMachineType();
        calculatorPage.selectAddGpusCheckBox();
        calculatorPage.selectGpuType();
        calculatorPage.selectNumberOfGPUs();
        calculatorPage.selectLocalSSD();
        calculatorPage.selectDataCentreLocation();
        calculatorPage.selectCommittedUsage();
        calculatorPage.clickAddToEstimateButton();

    }

//    @Test
//    public void checkInformationInVmClassString(){
//        calculatorPage.checkInformationInVmClassIsRegular();
//    }

    @Test
    public void checkInformationInInstanceTypeString(){
        calculatorPage.checkInformationInInstanceTypeIncludeN1Standard8();
    }
//
//    @Test
//    public void checkRegion(){
//        calculatorPage.checkRegionIsFrankfurt();
//    }
//
//    @Test
//    public void checkLocalSsd(){
//        calculatorPage.checkLocalSsdSpace2x375Gib();
//    }
//
//    @Test
//    public void checkCommitmentTerm(){
//        calculatorPage.checkCommitmentTermOneYear();
//    }
}
