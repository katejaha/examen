package Task;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static Util.Config.driver;

public class BotonBuscarTask {
    public void buscartest()throws InterruptedException{


    Actions actions =new Actions (driver);
        actions.sendKeys(Keys.ENTER).build().perform();
            Thread.sleep(40_000);
}}
