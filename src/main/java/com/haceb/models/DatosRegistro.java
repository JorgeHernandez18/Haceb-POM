package com.haceb.models;
/*
 * @(#) Credenciales.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */


import com.haceb.utils.Excel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class DatosRegistro {
    private static ArrayList<Map<String, String>> data= new ArrayList<>();

    public static ArrayList<Map<String, String>> data(){

        try {
            data = Excel.leerDatosDeHojaDeExcel("src/test/resources/data/Data.xlsx", "datos");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }
}
