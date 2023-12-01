package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import org.testng.Assert;
public class HomeService {

    public static void verificarPagInicio() {
        MobileActionManager.waitVisibility(HomeConstants.PAG_INICIO_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.PAG_INICIO_LOCATOR), HomeConstants.ERROR_VISUALIZAR_INICIO_MENSAJE);
    }
    public static void clickAgregarTiempo(){
        MobileActionManager.click(HomeConstants.BOTON_AGREGAR_TIEMPO_LOCATOR);

    }
    public static void agregarHorasMinutos(String horas, String minutos){
        MobileActionManager.setInput(HomeConstants.AGREGAR_HORAS_LOCATOR, horas,true,true);
        MobileActionManager.setInput(HomeConstants.AGREGAR_MINUTOS_LOCATOR, minutos, true,true);


    }
    public static void clickFecha(){
        MobileActionManager.click(HomeConstants.BOTON_FECHA_LOCATOR);
    }
    public static void clickGuardarHoras(){
        MobileActionManager.click(HomeConstants.BOTON_GUARDAR_TIEMPO_LOCATOR);
    }
    public static void clickGuardarFecha(){
        MobileActionManager.click(HomeConstants.BOTON_GUARDAR_FECHA_LOCATOR);
        MobileActionManager.click(HomeConstants.BOTON_GUARDAR_TIEMPO_LOCATOR);
    }
    public static void descartarHoras(){
        MobileActionManager.click(HomeConstants.BOTON_ATRAS_LOCATOR);
        MobileActionManager.click(HomeConstants.BOTON_CONFIRMAR_DESCARTAR_TIEMPO_LOCATOR);
    }
    public static void accederConfiguraciones(){
        MobileActionManager.click(HomeConstants.BOTON_MENU_LOCATOR);
        MobileActionManager.click(HomeConstants.BOTON_AJUSTES_LOCATOR);
    }

    public static void habilitarModoOscuro(){
        MobileActionManager.click(HomeConstants.BOTON_MODO_OSCURO_LOCATOR);
    }
    public static void cerrarSesion(){
        MobileActionManager.click(HomeConstants.BOTON_MENU_LOCATOR);
        MobileActionManager.click(HomeConstants.BOTON_CERRAR_SESION_LOCATOR);
        MobileActionManager.click(HomeConstants.BOTON_CONFIRMAR_CERRAR_SESION_LOCATOR);
    }
    public static void agregarFecha(){
        MobileActionManager.waitPresence(HomeConstants.BOTON_SIGUIENTE_MES_LOCATOR);
        MobileActionManager.click(HomeConstants.BOTON_SIGUIENTE_MES_LOCATOR);
        MobileActionManager.click(HomeConstants.BOTON_DIA_SELECIONADO_LOCATOR);

    }
}
