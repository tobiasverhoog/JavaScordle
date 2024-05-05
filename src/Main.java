import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");

        FirefoxProfile profile = new FirefoxProfile(new File("C:\\Users\\tverh\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\os9p1syc.WhatsappWeb"));
        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(profile);

        WebDriver driver = new FirefoxDriver(options);

        String baseUrl = "http://web.whatsapp.com";

        driver.get(baseUrl);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement wordleGroup =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[title='Wordle']")));

        wordleGroup.click();

        List<WebElement> messages = driver.findElements(By.cssSelector("#main span.selectable-text"));

        for (WebElement element : messages) {
            System.out.println("Bericht: " + element.getText());
            System.out.println("naam: ");
            System.out.println("Score: ");
        }
    }
}
