package UserInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Util.Config.driver;

public class BotonBuscarUI {
    public WebElement btn_buscar = driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[4]/button"));

}
