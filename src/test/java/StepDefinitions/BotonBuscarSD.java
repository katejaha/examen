package StepDefinitions;

import Task.BotonBuscarTask;
import io.cucumber.java.en.And;

public class BotonBuscarSD {
    @And("Seleccionamos Buscar")
    public void Buscar () throws InterruptedException{
        BotonBuscarTask test = new BotonBuscarTask();
        test.buscartest();
}}
