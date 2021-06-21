import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page_objects.PaginaTesterGlobal;

import static org.hamcrest.MatcherAssert.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class VerificaTesterGlobal {
    WebDriver driver;

        @BeforeAll
        public void setup(){
            driver = new ChromeDriver();
        }

        @AfterAll
        public void tearDown(){
            driver.quit();
        }

        @Test
        @DisplayName("Quando acessar pagina principal, Então devo encontrar o titulo correto")
        public void verificaPaginaPrincipal(){
            String tituloEsperado = "TESTER GLOBAL";
            String tituloEncontrado = "";
            PaginaTesterGlobal ptg = new PaginaTesterGlobal(driver);
            tituloEncontrado = ptg.pegaTitulo();
            assertThat(tituloEncontrado, Matchers.containsString(tituloEsperado));
        }
}
