package definitions.product;

import io.cucumber.java.en.Given;

import net.serenitybdd.annotations.Steps;
import steps.products.SelectProductStep;
import utilities.website.WebSite;

public class ProductDef {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    SelectProductStep productStep;

    @Given("el usuario navega al sitio web")
    public void userNavigateTo() {
        url.navigateTo("https://opencart.abstracta.us/");
    }
}
