package com.haceb.steps;

import com.haceb.models.SeleccionAleatoria;
import com.haceb.page.PerfilPage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class PerfilStep {

    @Page
    PerfilPage perfilPage;

    @Step("El usuario visualiza su perfil")
    public void elUsuarioVisualizaSuPerfil(){
        WaitUntil.the(perfilPage.getTxtNombre(), isEnabled()).forNoMoreThan(20).seconds();
        Assert.assertTrue(
            perfilPage.getDriver().findElement(perfilPage.getTxtNombre()).isDisplayed()
        );
    }

    @Step("El usuario selecciona una categoria de productos")
    public void elUsuarioSeleccionaUnaCategoria(){
        perfilPage.getDriver().findElement(perfilPage.getLnkCategoria()).click();
        JavascriptExecutor js = (JavascriptExecutor) perfilPage.getDriver();
        String script = "var evObj = document.createEvent('MouseEvents');" +
                "evObj.initEvent('mouseover', true, false);" +
                "arguments[0].dispatchEvent(evObj);";
        js.executeScript(script, perfilPage.getDriver().findElement(perfilPage.getLnkElectroCocina()));
    }

    @Step("El usuario selecciona una subcategoria aleatoriamente")
    public void elUsuarioSeleccionaUnaSubCategoriaAleatoriamente(){
        SeleccionAleatoria.seleccion(perfilPage.getDriver(), perfilPage.getLnkSubcategoria()).click();
    }
}
