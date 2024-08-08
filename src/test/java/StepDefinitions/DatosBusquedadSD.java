package StepDefinitions;

import Task.DatosBusquedadTask;
import io.cucumber.java.en.And;

public class DatosBusquedadSD {
    @And("Ingresamos lugar {}")
    public void Busquedad_Lugar (String datos) throws InterruptedException{
        DatosBusquedadTask test = new DatosBusquedadTask();
        test.config_lugar(datos);
        }
}
