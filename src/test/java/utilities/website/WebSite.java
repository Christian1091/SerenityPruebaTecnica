package utilities.website;


import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class WebSite {

    /* Clase que se comparte para que sea utilizada en lo métodos o funciones creadas posteriormente*/
    @Steps(shared = true)
    PageObject pageObject;

    @Step("Navegar al sitio web")
    public void navigateTo(String url) {
        pageObject.setDefaultBaseUrl(url);
        pageObject.open();
    }
}
