package Task;

import Util.Config;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.Objects;

public class ConfigPageTask extends Config {


    public void Browser(){
        System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/src/main/java/drivers/msedgedriver.exe");
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver(edgeOptions);//edgeOptions
        driver.manage().window().maximize();
    }

   // public void tear(){
   //     driver.quit();
  //  }

    public void Page (String pagina) {
        if(Objects.equals(pagina, "Booking")){
            driver.get(Booking);
            System.out.println("URL de la pagina:"+pagina);

        }
    }
}
