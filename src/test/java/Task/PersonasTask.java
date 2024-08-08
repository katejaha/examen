package Task;
import UserInterface.PersonasUI;

public class PersonasTask {
    public void CantPersonas () throws InterruptedException {
        PersonasUI seleccionar = new PersonasUI();
        seleccionar.cant_personas.click();
        Thread.sleep(10_000);
        seleccionar.cant_ninos.click();
        seleccionar.cant_ninos.click();
        seleccionar.cant_ninos.click();
        seleccionar.cant_ninos.click();
        seleccionar.cant_ninos.click();
}}
