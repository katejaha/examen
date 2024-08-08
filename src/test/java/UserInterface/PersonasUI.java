package UserInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Util.Config.driver;

public class PersonasUI {
    public WebElement cant_personas = driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[3]/div/button/span[2]/svg/path"));

    public WebElement cant_ninos= driver.findElement(By.xpath("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[2]/div/div[2]/button[2]"));
}

