package definitions.shopping;


import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import net.serenitybdd.annotations.Steps;
import steps.products.SelectProductStep;
import steps.shopping.ShoppingCarStep;

public class ShoppingDef {

    @Steps(shared = true)
    SelectProductStep selectProductStep;

    @Steps(shared = true)
    ShoppingCarStep shoppingCarStep;

    @And("agregamos productos al carrito de compras")
    public void userAddProducts() throws InterruptedException {
        selectProductStep.addProducts();
    }

    @And("dar click en el icono del carrito")
    public void userListProductsCar() throws InterruptedException {
        selectProductStep.clickListProductCar();
    }
    @And("visualizar los productos agregados en el carrito de compras")
    public void userViewListProductsCar() throws InterruptedException {
        selectProductStep.clickViewListProductCar();
    }

    @And("dar click en el boton checkout")
    public void userCheckoutProducts() throws InterruptedException {
        selectProductStep.clickCheckOut();
    }

    @When("completa el registro de la compra")
    public void userCompleteOrder() throws InterruptedException {
        shoppingCarStep.clickGuestChekout();
        shoppingCarStep.clickContinue();
        shoppingCarStep.setFirstName("Pepito");
        shoppingCarStep.setLastName("Juarez");
        shoppingCarStep.setEmail("pepito@gmail.com");
        shoppingCarStep.setPhone("099999999");
        shoppingCarStep.setAddres("Av. De los Andes");
        shoppingCarStep.setCity("Cuenca");
        shoppingCarStep.selectCountry();
        shoppingCarStep.selectRegionState();
        shoppingCarStep.clickContinueShoppingR();
        shoppingCarStep.setCommentDelivery("Fragil");
        shoppingCarStep.clickDelivery();
        shoppingCarStep.clickTerm();
        shoppingCarStep.clickPayment();
        shoppingCarStep.clickConfirmOrder();
        //shoppingCarStep.exitBroswer();
    }
}
