package pages.home;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SelectProductPages extends PageObject {

    /*Mapeo mi locators*/
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div[3]/button[1]")
    protected WebElementFacade btnProductMacBook;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div/div[3]/button[1]")
    protected WebElementFacade btnProductIphone;

    @FindBy(xpath = "/html/body/header/div/div/div[3]/div/button")
    protected WebElementFacade btnListCar;

    @FindBy(xpath = "/html/body/header/div/div/div[3]/div/ul/li[2]/div/p/a[1]")
    protected WebElementFacade btnViewCar;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div[3]/div[2]/a")
    protected WebElementFacade btnCheckout;
}
