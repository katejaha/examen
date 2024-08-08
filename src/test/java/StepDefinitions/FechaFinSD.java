package StepDefinitions;

import Task.FechaFinTask;
import Task.FechaInicioTask;
import io.cucumber.java.en.And;

public class FechaFinSD {
    @And("Ingresamos fecha fin {}")
    public void Ingreso_checkout(String checkout) throws InterruptedException {
        FechaFinTask test = new FechaFinTask();
        test.FechaFin(checkout);
    }
}
