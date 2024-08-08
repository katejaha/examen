package StepDefinitions;

import Task.ConfigPageTask;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class ConfigPage {
 /*   @Before
    public void setup() {
        ConfigPageTask tst = new ConfigPageTask();
        tst.Browser();
    }*/
 @Before
 public void setup() {
     ConfigPageTask  tst = new ConfigPageTask();
     tst.Browser();
 }
   /* @After
    public void tearDown(){
        ConfigPageTask test =new ConfigPageTask();
        test.tear();
    }*/

    @And("Ingresamos la url de la {}")
    public void Pagina_examen(String pagina){
        ConfigPageTask test = new ConfigPageTask();
        test.Page(pagina);
    }

}

