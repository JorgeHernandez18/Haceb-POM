package com.haceb.stepDefinitions;

import com.haceb.steps.*;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class RegistroStepDefinition {

    @Steps
    HomeStep home;

    @Steps
    RegistroStep registro;

    @Steps
    RegistroAdicionalStep registroAdicional;

    @Steps
    PerfilStep perfil;

    @Steps
    ListaProductosStep lista;

    @Steps
    DetalleProductoStep detalle;

    @Dado("que el usuario abre la pagina de Haceb")
    public void que_el_usuario_abre_la_pagina_de_haceb() {
        home.abrirNavegador();
    }
    @Cuando("de click en registrarse e ingresar a Haceb")
    public void de_click_en_registrarse_e_ingresar_a_haceb() {
        home.elUsuarioClickeaRegistrarte();
        home.elUsuarioClickeaIngresar();
    }
    @Cuando("diligencie el formulario de registro y de click en registrarme")
    public void diligencie_el_formulario_de_registro_y_de_click_en_registrarme() {
        registro.elUsuarioDiligenciaElFormularioDeRegistro();
    }
    @Cuando("diligencie el formulario de mas detalles y de click en enviar")
    public void diligencie_el_formulario_de_mas_detalles_y_de_click_en_enviar() {
        registroAdicional.elUsuarioDiligenciaElFormularioDeRegistroAdicional();
    }
    @Entonces("podra visualizar su perfil")
    public void podra_visualizar_su_perfil() {
        perfil.elUsuarioVisualizaSuPerfil();
    }

    @Cuando("seleccione una categoria de productos")
    public void seleccione_una_categoria_de_productos() {
        perfil.elUsuarioSeleccionaUnaCategoria();
    }
    @Cuando("seleccione una subcategoria aleatoriamente")
    public void seleccione_una_subcategoria_aleatoriamente() {
        perfil.elUsuarioSeleccionaUnaSubCategoriaAleatoriamente();
    }
    @Cuando("agregue un producto al carrito")
    public void agregue_un_producto_al_carrito() {
        lista.elUsuarioSeleccionaUnProductoAleatoriamente();
        detalle.elUsuarioAñadeElProductoAlCarrito();
    }
    @Entonces("el usuario podra ver el nombre del producto en el carrito")
    public void el_usuario_podra_ver_el_nombre_del_producto_en_el_carrito() {
        detalle.elUsuarioVeElProductoEnElCarrito();
    }
}
