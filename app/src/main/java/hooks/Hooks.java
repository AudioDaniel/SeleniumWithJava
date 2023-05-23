package hooks;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.BasePage;
import utils.BrowserUtils;

import static pages.BasePage.driver;

public class Hooks {
    @Before
    public static void setUp() {
        String windowSize = System.getProperty("windowSize");
        if (windowSize != null){
            BrowserUtils.setWindowSize(driver,windowSize);
            System.out.println("\n Window size: " + windowSize);
        } else {
            BrowserUtils.maximizeWindow(driver);
            System.out.println("\n Window size: fullscreen");
        }
    }
    @After
    public void afterScenario(){
        driver.manage().deleteAllCookies();
    }

    @AfterStep
    public void screenshot(Scenario scenario) {
        boolean fullSteps = Boolean.parseBoolean(System.getProperty("fullSteps"));
        if (scenario.isFailed() | fullSteps) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "image");
            System.out.println("Screenshot taken -----------------");
        }
    }
    // TEST TEST BORRAR aa TODO


    @AfterAll
    public static void tearDown() {
        BasePage.closeBrowser();
    }
}
