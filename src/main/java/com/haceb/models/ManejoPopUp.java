package com.haceb.models;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class ManejoPopUp {


    public static String ventanaActual = null;
    public static String emergente = null;

    public static void obtenerVentanaActual(WebDriver driver){
        ventanaActual = driver.getWindowHandle();
    }

    public static void cambiarVentanaEmergente(WebDriver driver){
        Set<String> ventanas = driver.getWindowHandles();
        for(String ventana:ventanas){
            if(!ventana.equalsIgnoreCase(ventanaActual)){
                emergente=ventana;
            }
        }
        driver.switchTo().window(emergente);
    }

    public static void ventanaPrincipal(WebDriver driver){
        driver.switchTo().window(ventanaActual);
    }

}
