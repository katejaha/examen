package UserInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Util.Config.driver;

public class FechaFinUI {

    public WebElement fecha_checkout= driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div/button[2]/span"));
}

