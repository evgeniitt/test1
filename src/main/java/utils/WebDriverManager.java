package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class WebDriverManager {

    private static WebDriver driver = null;

    private static void init() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://pp86.hostco.ru/");
    }

    public static WebDriver getWd() {
        if (driver == null) {
            init();
        }
        return driver;
    }

    public static void close() {
        driver.quit();
        driver = null;
    }

}
