import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

public class GoogleTest {
    
    @Test
    public void testGoogleHomePage() {
        System.setProperty("webdriver.chrome.driver", "C:/Tools/chromedriver.exe"); // or wherever it's located
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Title: " + driver.getTitle());
        driver.quit();
    }
}
