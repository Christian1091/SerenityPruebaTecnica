package steps.shopping;

import net.serenitybdd.annotations.Step;
import pages.shopping.ShoppingCarPage;

public class ShoppingCarStep extends ShoppingCarPage {

    @Step("Click GuestChekout")
    public void clickGuestChekout() throws InterruptedException {
        Thread.sleep(2000);
        rbtnGuestChekout.click();
    }

    @Step("Click continuar")
    public void clickContinue() throws InterruptedException {
        Thread.sleep(2000);
        btnContinue.click();
    }

    @Step("Ingresar el nombre")
    public void setFirstName(String firstName) throws InterruptedException {
        Thread.sleep(2000);
        txtFirstName.sendKeys(firstName);
    }

    @Step("Ingresar el apellido")
    public void setLastName(String lastName) {
        txtLastName.sendKeys(lastName);
    }

    @Step("Ingresar el coreo")
    public void setEmail(String email) {
        txtEmail.sendKeys(email);
    }

    @Step("Ingresar el telefono")
    public void setPhone(String phone) {
        txtPhone.sendKeys(phone);
    }

    @Step("Ingresar la direccion")
    public void setAddres(String address) {
        txtAddress.sendKeys(address);
    }

    @Step("Ingresar la ciudad")
    public void setCity(String city) {
        txtCity.sendKeys(city);
    }

    @Step("Ingresar el codigo postal")
    public void txtPostCode(String postCode) {
        txtPostCode.sendKeys(postCode);
    }

    @Step("Ingresar el pais")
    public void selectCountry()
    {
        selectCountry.selectByVisibleText("Ecuador");
    }

    @Step("Ingresar la region")
    public void selectRegionState() {
        selectRegionState.selectByVisibleText("Azuay");
    }

    @Step("Click continuar")
    public void clickContinueShoppingR() throws InterruptedException {
        Thread.sleep(2000);
        btnContinueShoppingR.click();
    }

    @Step("Ingresar comentario delivery")
    public void setCommentDelivery(String commentDelivery) {
        txtCommentDelivery.sendKeys(commentDelivery);
    }

    @Step("Click continuar")
    public void clickDelivery() throws InterruptedException {
        Thread.sleep(2000);
        btnDelivery.click();
    }

    @Step("Click terminos y condiciones")
    public void clickTerm() throws InterruptedException {
        Thread.sleep(2000);
        chckTemrConditions.click();
    }

    @Step("Click continuar")
    public void clickPayment() throws InterruptedException {
        Thread.sleep(2000);
        btnPayment.click();
    }

    @Step("Click confirmar orden")
    public void clickConfirmOrder() throws InterruptedException {
        Thread.sleep(2000);
        btnConfirmOrder.click();
        Thread.sleep(5000);
    }

//    @Step("Cerramos el broswer")
//    public void exitBroswer() throws InterruptedException {
//        Thread.sleep(2000);
//        getDriver().quit();
//    }
}
