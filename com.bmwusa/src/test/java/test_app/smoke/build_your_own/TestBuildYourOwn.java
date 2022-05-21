package test_app.smoke.build_your_own;

import app.pom.BuildYourOwn;
import app.pom.DesignPage;
import app.pom.DesignStudio;
import app.pom.Homepage;
import base_test.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBuildYourOwn extends BaseTest {

    @Test
    public void testBuildRandomCustomVehicle() {
        Homepage homepage = new Homepage();
        homepage.navigateToBuildYourOwnPage();

        BuildYourOwn byo = new BuildYourOwn();
        byo.selectARandomModelSeries();

        DesignPage design = new DesignPage();
        design.selectRandomDesignButton();

        DesignStudio studio = new DesignStudio();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(studio.colorButton));

        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        String expectedURL = excel.readStringList("bmwBuildYourOwn").get(0).toLowerCase();
        System.out.println(expectedURL);

        Assert.assertTrue(actualURL.contains(expectedURL));
    }

}