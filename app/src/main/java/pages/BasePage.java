package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BasePage {
    //protected static WebDriver driver;
    public static WebDriver driver;
    protected static WebDriverWait wait;


    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static void closeBrowser() {
        driver.quit();
    }

    private static Boolean headlessMode = Boolean.parseBoolean(System.getProperty("headlessMode"));
    // -------------------------------------------------
    public static void chromeDriver() {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--ignore-certificate-errors");
        //options.addArguments("--start-maximized");
        options.addArguments("--force-dark-mode");
        if (headlessMode) {
            options.addArguments("--headless");
            System.out.println("\n Driver mode: Headless");
        }

        System.out.println("\n WebDriver: ChromeDriver");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public static void firefoxDriver() {
        FirefoxOptions options = new FirefoxOptions();
        //options.addArguments("--remote-allow-origins=*");
        //options.addArguments("--start-maximized");
        //options.addArguments("--force-dark-mode");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--ignore-certificate-errors");
        if (headlessMode) {
            options.addArguments("--headless");
            System.out.println("\n Driver mode: Headless");
        }

        System.out.println("\n WebDriver: FirefoxDriver");
        driver = new FirefoxDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    static {
        switch (System.getProperty("webDriver")){
            case "chrome":
                chromeDriver();
                break;
            case "firefox":
                firefoxDriver();
                break;
            default: chromeDriver();
        }
    }
}
