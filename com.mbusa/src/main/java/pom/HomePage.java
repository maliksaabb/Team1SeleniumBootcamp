package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class HomePage extends SystemBar {

    @FindBy (xpath = "//button[@role='menuitem'][normalize-space()='Vehicles']")
    public WebElement vehiclesTab;

    @FindBy (xpath = "//button[normalize-space()='Shopping']")
    public WebElement shoppingTab;

    @FindBy (xpath = "//button[normalize-space()='Inventory']")
    public WebElement inventoryTab;

    @FindBy (xpath = "//a[normalize-space()='Explore the EQS']")
    public WebElement exploreEQS;

    @FindBy (xpath = "//a[@class='button button_primary']")
    public WebElement buildYourOwn;

    @FindBy (xpath = "//a[@class='button button_secondary']")
    public WebElement viewInventory;

    @FindBy (xpath = "//h1[@class='dealer-selector__title']")
    public WebElement findNewInventoryText;


    public void clickVehiclesTab(){clickOnElement(vehiclesTab);}

    public void clickShoppingTab(){clickOnElement(shoppingTab);}

    public void clickInventoryTab(){clickOnElement(inventoryTab);}




    public HomePage()
    {
        PageFactory.initElements(driver, this);
    }
}
