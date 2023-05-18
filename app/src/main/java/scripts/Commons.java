package scripts;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Commons extends BasePage {
    public Commons(WebDriver driver) {
        super(driver);
    }

    // TEXT INPUT

    public static void writeText(String xpath, String text) {
        try {
            WebElement element = findElementByXpath(xpath);
            element.clear();
            element.sendKeys(text);
        } catch (Exception e) {
            Assert.fail("Failed to write text: " + text + " to element with xpath: " + xpath);
        }
    }

    // FIND ELEMENT ----------------------------
    public static WebElement findElementByXpath(String xpath) {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        } catch (Exception e) {
            Assert.fail("Failed to find element: " + xpath);
        }
        return null;
    }

    /* TODO Borrar???
    public static void wait(Long time) {
        try {
            return wait.until(ExpectedConditions.);
        } catch (Exception e) {
            Assert.fail("Failed to find element: " + xpath);
        }
    }
     */


    public static WebElement findElementByCss(String locator) {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
        } catch (Exception e) {
            Assert.fail("Failed to find element: " + locator);
        }
        return null;
    }

    public static WebElement findElementByText(String elementType, String text) {
        WebElement element;
        switch (elementType) {
            case "header3":
                elementType = "h3";
                break;
        }
        try {
            return element = findElementByXpath("//" + elementType + "[contains(.,'" + text + "')]");
        } catch (Exception e) {
            Assert.fail("Failed to find element type " + elementType + " with text: " + text);
            return null;
        }
    }

    // WAIT FOR ELEMENT ----------------------------

    public static void waitForElementByXpath(String xpath) {
        try {

        } catch (Exception e) {
            Assert.fail("Await to find element failed: " + xpath);
        }
    }

    // CLICK ELEMENT ----------------------------
    public static void click(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            Assert.fail("Failed to click on element: " + element);
        }
    }


    public static void click(String xpath) {
        WebElement element = Commons.findElementByXpath(xpath);
        try {
            element.click();
        } catch (Exception e) {
            Assert.fail("Failed to click on element: " + element);
        }
    }

    // NAVIGATE  ----------------------------
    public static void navigateTo(String url) {
        driver.get(url);
    }

    // VERIFY ----------------------------
    public static boolean verifyElementHasAttribute(WebElement elementVerified, String attributeName,
                                                    String attributeValue) {
        try {
            return elementVerified.getAttribute(attributeName).equals(attributeValue);
        } catch (Exception ignored) {
            return false;
        }
    }

    public static boolean verifyElementHasCssAttribute(WebElement elementVerified, String attributeName,
                                                    String attributeValue) {
        try {
            return wait.until(ExpectedConditions.attributeContains(elementVerified,attributeName,attributeValue));
            //return elementVerified.getCssValue(attributeName).equals(attributeValue);
        } catch (Exception ignored) {
            return false;
        }
    }

    public static boolean isVisible(WebElement elementVerified){
        try {
            elementVerified.isDisplayed();
            return true;
        } catch (AssertionError e) {
            return false;
        }
    }
    public static boolean isVisible(String xpath){
        try {
            WebElement elementVerified = Commons.findElementByXpath(xpath);
            elementVerified.isDisplayed();
            return true;
        } catch (AssertionError e) {
            return false;
        }
    }

    // DELAY/WAIT
    public static void sleep(long mseconds){
        try {
            Thread.sleep(mseconds);
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }


    // Alert

    public static String switchToAlert(){
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        return alertMessage;
    }

    ///////////////////////////////////////////
    // ....PROPERTY METHODS...................//
    ///////////////////////////////////////////
    public static Properties getProperties(String propertiesFilename) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(new File(propertiesFilename)));
        } catch (FileNotFoundException exception) {
            Assert.fail("File not found:" + propertiesFilename + "\n" + exception.getMessage());
        } catch (IOException exception) {
            Assert.fail("Exception while reading:" + propertiesFilename + "\n" + exception.getMessage());
        }
        return properties;
    }

    public static boolean verifyUrl(String stringRegex, String subDomain) {
        String currentUrl = driver.getCurrentUrl();
        switch (subDomain){
            case "My Info":
                subDomain = "pim";
        }
        String subDomainlower = subDomain.toLowerCase();
        System.out.println(currentUrl);
        System.out.println((stringRegex + subDomain + "/" + ".*"));
        return (
        currentUrl.matches(stringRegex + subDomainlower + "/" + ".*"));
    }
}
