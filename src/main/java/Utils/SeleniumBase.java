package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.SignInPage;

import java.time.Duration;

public class SeleniumBase {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public SeleniumBase() {
    }

    public WebDriver SeleniumConfig() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        driver.manage().window().maximize();
        return driver;
    }

    //get value environment
    public void Environment() {
        SignInPage signInPage = new SignInPage();
        SeleniumActions seleniumActions = new SeleniumActions();
        Config.Environment environment = new Config.Environment();
        MailLocators locators = new MailLocators();
        // Set all three values at once using the setter method
        environment.setEnvironmentValues("https://app-stg.converted.in/login", "https://app.converted.in/login", "https://app-dev.converted.in/login");
        // Get and print one value using the getter method
        String value = environment.getValue(0);
        driver.get(value);
        seleniumActions.waitUntil(SeleniumActions.Waits.VISIBILITY_OF_ELEMENT, locators.loginEmail);
        if (value.equals("https://app-stg.converted.in/login")) {
            signInPage.loginPage("mckenzie.lincoln@yahoo.com", "password");
        } else if (value.equals("https://app.converted.in/login")) {
            signInPage.loginPage("m.abed@converted.in", "12345678");

        }


        // Use the WebDriver to navigate to the URL

    }


}


