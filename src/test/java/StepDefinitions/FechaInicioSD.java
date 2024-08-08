package StepDefinitions;

import Task.FechaInicioTask;
import io.cucumber.java.en.And;

public class FechaInicioSD {
    @And("Ingresamos fecha inicio {}")
    public void Ingreso_checkin(String mes_entrada,String dia_entrada) throws InterruptedException {
        FechaInicioTask test = new FechaInicioTask();
        test.FechaInicio(mes_entrada,dia_entrada);
    }
}
