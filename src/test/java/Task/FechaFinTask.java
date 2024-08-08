package Task;

import UserInterface.FechaFinUI;
import UserInterface.FechaInicioUI;

public class FechaFinTask {
    public void FechaFin (String checkout) throws InterruptedException {
        FechaFinUI seleccionar = new FechaFinUI();
        Thread.sleep(10_000);seleccionar.fecha_checkout.sendKeys(checkout);

        seleccionar.fecha_checkout.click();
    }
}
