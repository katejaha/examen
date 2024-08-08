package StepDefinitions;

import Task.PersonasTask;
import io.cucumber.java.en.And;

import java.io.IOException;

public class PersonasSD {
    @And("seleccionamos personas ")
    public void Personas () throws InterruptedException, IOException {
        PersonasTask test= new PersonasTask();
        test.CantPersonas();
    }
}
