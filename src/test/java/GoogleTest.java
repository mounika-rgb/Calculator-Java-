import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

    public static void main(String[] args) {
        // Path to ChromeDriver binary
        System.setProperty("webdriver.chrome.driver", "C:/Tools/chromedriver.exe"); // adjust path if needed

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();
    }
}