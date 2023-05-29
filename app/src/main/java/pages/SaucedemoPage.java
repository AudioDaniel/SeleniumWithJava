package pages;

import elements.SaucedemoElements;
import org.openqa.selenium.support.ui.Wait;
import scripts.Commons;

public class SaucedemoPage {

    // Locators
    //--------------------
    private static String inputEmail =  SaucedemoElements.inputEmail;
    private static String inputPassword = SaucedemoElements.inputPassword;
    private static String loginButton = SaucedemoElements.loginButton;
    private static String loginMessage =  SaucedemoElements.loginMessage;

    public static void clickLoginButton(){
        Commons.click(Commons.findElementByXpath(loginButton));
    }

    public static void enterEmail(String email) {
        Commons.writeText(inputEmail,email);
    }

    public static void enterPassword(String password) {
        Commons.writeText(inputPassword,password);
    }

    public static void testStep() {
        Commons.highlightElement(Commons.findElementByXpath(SaucedemoElements.inputEmail));
        Commons.highlightElement(Commons.findElementByXpath(SaucedemoElements.inputPassword));

    }
}
