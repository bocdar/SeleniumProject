import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
//import io.github.bonigarcia.wdm.WebDriverManager;

class SampleTest {
    @Test
    void openGoogle() {
        // WebDriverManager ile ChromeDriver'ı otomatik indir ve ayarla
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "C:/Program Files/ChromeDriver/chrome.exe");
        WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-infobars"); // Bilgi çubuklarını devre dışı bırak
        options.addArguments("--disable-notifications"); // Bildirimleri devre dışı bırak
        options.addArguments("--start-maximized"); // Tarayıcıyı tam ekran başlat

        // ChromeDriver'ı başlat
        //WebDriver driver = new ChromeDriver();

        // Google'ı aç
        driver.get("https://www.google.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));

        // Tarayıcıyı kapat (isteğe bağlı)
        //driver.quit();
    }
}
