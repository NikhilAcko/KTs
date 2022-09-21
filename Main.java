import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/nikhil.kabba/IdeaProjects/SeleniumFirstUseCase/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.imdb.com");
        driver.findElement(By.id("suggestion-search")).sendKeys("Spider Man");
        driver.findElement(By.id("suggestion-search-button")).click();
        driver.quit();
    }
}
