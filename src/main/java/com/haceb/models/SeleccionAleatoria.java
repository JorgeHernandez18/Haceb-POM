package com.haceb.models;

import com.haceb.utils.EscrituraExcel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class SeleccionAleatoria {

    public static String prueba;
    public static WebElement seleccion(WebDriver wd, By xpath){
        List<WebElement> coleccion = wd.findElements(xpath);
        Random r = new Random();
        int eleccion = r.nextInt(coleccion.size());
        prueba = coleccion.get(eleccion).getText();
        return coleccion.get(eleccion);
    }

    public static void escrituraExcel(){
        EscrituraExcel.escrituraExcel(
                "src/test/resources/data/Data.xlsx",
                prueba,1,7);
    }
}
