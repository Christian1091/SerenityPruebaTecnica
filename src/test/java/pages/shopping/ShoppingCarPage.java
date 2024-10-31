package pages.shopping;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ShoppingCarPage extends PageObject {

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[1]/div[2]/div/div/div[1]/div[2]/label/input")
    protected WebElementFacade rbtnGuestChekout;

    @FindBy(id = "button-account")
    protected WebElementFacade btnContinue;

    @FindBy(id = "input-payment-firstname")
    protected WebElementFacade txtFirstName;

    @FindBy(id = "input-payment-lastname")
    protected WebElementFacade txtLastName;

    @FindBy(id = "input-payment-email")
    protected WebElementFacade txtEmail;

    @FindBy(id = "input-payment-telephone")
    protected WebElementFacade txtPhone;

    @FindBy(id = "input-payment-address-1")
    protected WebElementFacade txtAddress;

    @FindBy(id = "input-payment-city")
    protected WebElementFacade txtCity;

    @FindBy(id = "input-payment-postcode")
    protected WebElementFacade txtPostCode;

    @FindBy(id = "input-payment-country")
    protected WebElementFacade selectCountry;

    @FindBy(id = "input-payment-zone")
    protected WebElementFacade selectRegionState;

    @FindBy(id="button-guest")
    protected WebElementFacade btnContinueShoppingR;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[4]/div[2]/div/p[4]/textarea")
    protected WebElementFacade txtCommentDelivery;

    @FindBy(id="button-shipping-method")
    protected WebElementFacade btnDelivery;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[5]/div[2]/div/div[3]/div/input[1]")
    protected WebElementFacade chckTemrConditions;

    @FindBy(id="button-payment-method")
    protected WebElementFacade btnPayment;

    @FindBy(id="button-confirm")
    protected WebElementFacade btnConfirmOrder;
}
