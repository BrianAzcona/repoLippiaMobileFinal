package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.services.HomeService;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.en.And;

public class HomeSteps extends PageSteps {

    @Then("Se verifica que se haya logueado correctamente")
    public void paginaInicioVisible() {
        HomeService.verificarPagInicio();
    }

    @And("Hace click en {string}")
    public void haceClickEn(String btn) {
        switch (btn){
            case "+": HomeService.clickAgregarTiempo();
            break;
            case "fecha": HomeService.clickFecha();
            break;
        }
    }

    @And("Se agregan las horas {string} y minutos {string}")
    public void seAgreganLasHorasYMinutos(String horas, String minutos) {
        HomeService.agregarHorasMinutos(horas, minutos);
    }


    @io.cucumber.java.en.Then("Se verifica que vuelve a la pagina de inicio")
    public void seVerificaQueVuelveALaPaginaDeInicio() {
        HomeService.verificarPagInicio();
    }

    @And("Se guardan las horas y minutos")
    public void seGuardanLasHorasYMinutos() {
        HomeService.clickGuardarHoras();
    }

    @And("Se guarda la fecha deseada")
    public void seGuardaLaFechaDeseada() {
        HomeService.clickGuardarFecha();
    }

    @And("Se descartan los cambios de las horas y minutos")
    public void seDescartanLosCambiosDeLasHorasYMinutos() {
        HomeService.descartarHoras();
    }

    @And("Se dirije a configuraciones")
    public void seDirijeAConfiguraciones() {
        HomeService.accederConfiguraciones();
    }

    @And("Habilita el modo oscuro")
    public void habilitaElModoOscuro() {
        HomeService.habilitarModoOscuro();
    }

    @And("el usuario cierra la sesion")
    public void elUsuarioCierraLaSesion() {
        HomeService.cerrarSesion();
    }

    @And("Se agrega una fecha")
    public void seAgregaLaFechaDeseadaCon() {
        HomeService.agregarFecha();
    }
}
