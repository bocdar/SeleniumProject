
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SampleTest {
    @Test
    void openGoogle() {
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/ChromeDriver/chrome.exe");
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.google.com");
            System.out.println("Title: " + driver.getTitle());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                driver.quit();
            } catch (Exception e) {
                System.out.println("Error while closing the driver: " + e.getMessage());
            }
        }
    }
}
