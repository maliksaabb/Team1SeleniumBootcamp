package Purchases.pom;

import Purchases.shared.SystemBar;
import org.openqa.selenium.support.PageFactory;

public class Menu extends SystemBar {

    public Menu(){
        PageFactory.initElements(driver, this);
    }
}