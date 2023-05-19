package pages.orange;

import elements.OrangeElements;
import scripts.Commons;

public class Admin {
    public static void selectUserRole() {
        Commons.click(OrangeElements.ADMIN_PAGE_ROLE_BUTTON);
        Commons.click(OrangeElements.ADMIN_PAGE_ROLE_OPTION);
    }

    public static void writeEmployeeName(String name) {
        Commons.writeText(OrangeElements.ADMIN_PAGE_NAME_INPUT,name);
    }

    public static void selectEnabled() {
        Commons.click(OrangeElements.ADMIN_PAGE_STATUS_BUTTON);
        Commons.click(OrangeElements.ADMIN_PAGE_STATUS_OPTION);
    }

    public static void writeUserName(String username) {
        Commons.writeText(OrangeElements.ADMIN_PAGE_USER_INPUT,username);
    }

    public static void writePassword(String password) {
        Commons.writeText(OrangeElements.ADMIN_PAGE_PASSWORD_INPUT,password);
        Commons.writeText(OrangeElements.ADMIN_PAGE_CONFIRM_PASSWORD_INPUT,password);
    }

    public static void clickSaveButton() {
        Commons.click(OrangeElements.ADMIN_PAGE_SAVE_BUTTON);
    }

    public static void addNewEmployee() {
        Commons.click(OrangeElements.ADMIN_PAGE_ADD_BUTTON);
    }
}
