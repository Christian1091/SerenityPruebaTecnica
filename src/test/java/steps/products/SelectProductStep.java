package steps.products;

import net.serenitybdd.annotations.Step;
import pages.home.SelectProductPages;

public class SelectProductStep extends SelectProductPages {

    /*Iteración con los productos*/
    @Step("Agregar productos al carrito de compras")
    public void addProducts() throws InterruptedException {

        btnProductMacBook.click();
        Thread.sleep(2000);
        btnProductIphone.click();
        Thread.sleep(2000);
    }

    @Step("Click en el boton del carro de compras")
    public void clickListProductCar() throws InterruptedException {
        Thread.sleep(2000);
        btnListCar.click();
        Thread.sleep(2000);
    }

    @Step("Click en el boton de visualizar compras")
    public void clickViewListProductCar() throws InterruptedException {
        Thread.sleep(2000);
        btnViewCar.click();
        Thread.sleep(2000);
    }

    @Step("Click en el boton de chekout")
    public void clickCheckOut() throws InterruptedException {
        Thread.sleep(2000);
        btnCheckout.click();
        Thread.sleep(2000);
    }
}
