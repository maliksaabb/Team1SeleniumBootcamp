package test_app.Support;

import base_test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.HomePage;

public class testExpediaSupport extends BaseTest {

    @Test
    public void testFlightsTopicInSupport(){
        HomePage homePage = new HomePage();
        homePage.clickExpediaSupportLink.click();
        homePage.browseFlightsTopic.click();

        String actualLocation = homePage.reviewItinerary.getText();
        String expectedLocation = excel.readStringList("ExpediaSheet").get(1);
        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }

    @Test
    public void testHotelsTopic(){
        HomePage homePage = new HomePage();
        homePage.clickExpediaSupportLink.click();
        homePage.browseHotelsTopics.click();

        String actualLocation = homePage.HotelsDropDown.getText();
        String expectedLocation = excel.readStringList("ExpediaSheet").get(2);
        Assert.assertTrue(actualLocation.contains(expectedLocation));


    }

    @Test
    public void testBundleAndDeals(){
        HomePage homePage = new HomePage();
        homePage.clickExpediaSupportLink.click();
        homePage.BundleAndDealsButton.click();

        String actualLocation = homePage.BundleAndDealsDropDown.getText();
        String expectedLocation = excel.readStringList("ExpediaSheet").get(3);
        Assert.assertTrue(actualLocation.contains(expectedLocation));

    }

    @Test
    public void testCarsSupportTopics(){
        HomePage homePage = new HomePage();
        homePage.clickExpediaSupportLink.click();
        homePage.browseCarsTopic.click();

        String actualLocation = homePage.carsTopicDropDown.getText();
        String expectedLocation = excel.readStringList("ExpediaSheet").get(4);
        Assert.assertTrue(actualLocation.contains(expectedLocation));

    }

    @Test
    public void  testExpediaReward(){
        HomePage homePage = new HomePage();
        homePage.clickExpediaSupportLink.click();
        homePage.expediaRewards.click();

        String ExpectedText = "Earn & Redeem";
        Assert.assertEquals(ExpectedText,"Earn & Redeem");
    }
}
