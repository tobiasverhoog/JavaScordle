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

        FirefoxProfile profile = new FirefoxProfile(new File("C:\\Users\\9416890\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\zkbfdfcw.Whatsapp User"));
        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(profile);

        WebDriver driver = new FirefoxDriver(options);

        String baseUrl = "http://web.whatsapp.com";

        driver.get(baseUrl);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement wordleGroup =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[title='Wordle']")));

        wordleGroup.click();

        List<WebElement> messages = driver.findElements(By.cssSelector(".focusable-list-item"));

        createPlayers();

        for (WebElement element : messages) {
            System.out.println("Bericht: " + element.getText());
            if (!element.findElements(By.cssSelector("div[data-pre-plain-text]")).isEmpty()) {
                String player;
                player = getPlayerName(element.findElement(By.cssSelector("div[data-pre-plain-text]")).getAttribute("data-pre-plain-text"));
                System.out.println("naam: " + player);
                update
            }
            System.out.println("Score: ");
            System.out.println("Wordle dag: ");
            System.out.println("++++++++++++++++++");
            System.out.println();
        }

    }

    static String getPlayerName(String dataString) {
        if (dataString.contains("Maarten")) {
            return "Maarten";
        } else if (dataString.contains("Jesse")) {
            return "Jesse";
        } else if (dataString.contains("Fokko")) {
            return "Fokko";
        } else if (dataString.contains("Sjoerd")) {
            return "Sjoerd";
        } else if (dataString.contains("Tobias")) {
            return "Tobias";
        } else {
            return "Onbekende speler";
        }
    }

    static void createPlayers() {
        Player maarten = new Player("Maarten");
        Player jesse = new Player("Jesse");
        Player fokko = new Player("Fokko");
        Player sjoerd = new Player("Sjoerd");
        Player tobias = new Player("Tobias");
    }
}
