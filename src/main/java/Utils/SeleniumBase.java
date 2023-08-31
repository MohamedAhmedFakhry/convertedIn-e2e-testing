package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumBase {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public SeleniumBase() {
    }

    public WebDriver seleniumConfig() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        driver.manage().window().maximize();
        return driver;
    }

    //get value environment
    public void Environment(){
        Config.Environment environment = new Config.Environment();
        // Set all three values at once using the setter method
        environment.setEnvironmentValues("https://app-stg.converted.in/login", "https://app.converted.in/login", "https://app-dev.converted.in/login");
        // Get and print one value using the getter method
        String value = environment.getValue(0);
        driver.get(value);
    }

}


