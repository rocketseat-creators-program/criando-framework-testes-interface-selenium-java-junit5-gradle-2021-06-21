package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaTesterGlobal {

    String baseUrl = "https://viniciuspessoni.com/";
    By tituloPrincipal = By.cssSelector(".et_pb_text_inner");
    WebDriver driver;

    public PaginaTesterGlobal(WebDriver driver){
        this.driver = driver;
        driver.get(baseUrl);
    }

    public String pegaTitulo() {
        return driver.findElement(By.cssSelector(".et_pb_text_inner")).getText();
    }
}
