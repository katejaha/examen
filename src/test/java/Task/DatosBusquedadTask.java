package Task;

import UserInterface.DatosBusquedadUI;

public class DatosBusquedadTask {
    public void config_lugar(String datos) throws InterruptedException {
        DatosBusquedadUI seleccionar = new DatosBusquedadUI();
        seleccionar.config_lugar.click();
        seleccionar.config_lugar.click();
        Thread.sleep(2_000);
        seleccionar.config_lugar.sendKeys(datos);

    }
}
