package Task;

import UserInterface.FechaInicioUI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.Objects;

import static Util.Config.driver;

public class FechaInicioTask {
    public void FechaInicio (String mes_entrada,String dia_entrada) throws InterruptedException {
        FechaInicioUI seleccionar = new FechaInicioUI();
        seleccionar.checkin.click();
        Thread.sleep(10_000);
        switch (mes_entrada) {
            case "Agosto" -> {
                seleccionar.opcion_mes1.click();
                Thread.sleep(10_000);
            }}
            switch (dia_entrada) {
                case "14" -> {
                    seleccionar.opcion_dia1.click();
                    Thread.sleep(10_000);
                }


}}}
