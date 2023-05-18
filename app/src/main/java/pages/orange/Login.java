package pages.orange;

import elements.OrangeElements;
import org.junit.Assert;
import scripts.Commons;

public class Login {

    public static void navigateToLogin() {
        Commons.navigateTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public static void enterCredentials() {
        Commons.writeText(OrangeElements.LOGIN_PAGE_USER_FIELD,"Admin");
        Commons.writeText(OrangeElements.LOGIN_PAGE_PASSWORD_FIELD,"admin123");

    }

    public static void clickLoginButton() {
        Commons.click(Commons.findElementByXpath(OrangeElements.LOGIN_PAGE_LOGIN_BUTTON));
    }

    public static void clickProfileButton() {
        Commons.click(Commons.findElementByXpath(OrangeElements.LOGIN_PAGE_PROFILE_BUTTON));
    }

    public static void verifyBadge() {
        Assert.assertTrue("Element: " + OrangeElements.LOGIN_PAGE_NAME_BADGE + "not displayed",
                (Commons.isVisible(Commons.findElementByXpath(OrangeElements.LOGIN_PAGE_NAME_BADGE))));
        ;
    }

    public static void clickOnButton(String arg0) {
        String xpath = String.format(OrangeElements.LOGIN_PAGE_GENERIC_SECTION,arg0);
        Commons.click(xpath);
    }

    public static boolean verifyUrl(String genericRegex, String subDomain) {
                return Commons.verifyUrl(genericRegex,subDomain);
    }

    public static void clickBurgerButton() {
        if (Commons.isVisible(OrangeElements.GENERIC_BURGERBUTTON)) {
            Commons.click(OrangeElements.GENERIC_BURGERBUTTON);
        }
    }
}
