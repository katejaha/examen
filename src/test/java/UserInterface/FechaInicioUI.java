package UserInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Util.Config.driver;


public class FechaInicioUI {
   public WebElement checkin = driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div/button[1]/span"));
   public WebElement opcion_mes1 = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[2]/div/div/div/div/div[1]/div[1]/select/option[3]"));
   public WebElement opcion_dia1 = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[2]/div/div/div/div/div[1]/div[2]/select/option[9]"));
}
