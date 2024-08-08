package Util;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

import static Util.Config.driver;
public class AccionIdioma {
    public void idioma_config(String idioma) throws InterruptedException, IOException {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
        Thread.sleep(1_000);
        actions.sendKeys(Keys.ENTER).build().perform();//press enter
        Thread.sleep(5_000);
        System.out.println("You change the lenguage: "+idioma);
    }
}
