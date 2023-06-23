package elements;

public class SaucedemoElements {

    //Locators
    public static String inputEmail =  "//input[@id='user-name']";
    public static String inputPassword = "//input[@id='password']";
    public static String loginButton = "//input[@id='login-button']";
    public static String loginMessage =  "//h3[@data-test='error']";
    public static String addCartGenericXpath = "//div[@class='inventory_item_label'][contains(.,'%s')]/following-sibling::div/button";
}
