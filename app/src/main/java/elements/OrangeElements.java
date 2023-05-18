package elements;

public class OrangeElements
{
    // ABSTRACT

    public static final String GENERIC_LINK = "https://opensource-demo.orangehrmlive.com/web/index.php/%s/";

    public static final String GENERIC_BURGERBUTTON = "//i[@class=\"oxd-icon bi-list oxd-topbar-header-hamburger\"]";

    // ADMIN PAGE
    public static final String ADMIN_PAGE_ADD_BUTTON = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']";

    public static final String ADMIN_PAGE_ROLE_BUTTON = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]";
    public static final String ADMIN_PAGE_ROLE_OPTION = "(//span[@data-v-13cf171c])[1]";
    public static final String ADMIN_PAGE_SAVE_BUTTON = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']";
    public static final String ADMIN_PAGE_STATUS_BUTTON = "(//i[contains(@class,'oxd-icon bi-caret-down-fill oxd-select-text--arrow')])[2]";

    public static final String ADMIN_PAGE_STATUS_OPTION = "//div[@role=\"option\"][2]";
    public static final String ADMIN_PAGE_NAME_INPUT = "//input[@placeholder=\"Type for hints...\"]";
    public static final String ADMIN_PAGE_USER_INPUT = "//div[@class='oxd-input-group oxd-input-field-bottom-space'][contains(.,'Username')]//input";
    public static final String ADMIN_PAGE_PASSWORD_INPUT = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'][contains(.,'Password')]//input)[1]";
    public static final String ADMIN_PAGE_CONFIRM_PASSWORD_INPUT = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'][contains(.,'Password')]//input)[2]";


    // LOGIN PAGE
    public static final String LOGIN_PAGE_USER_FIELD = "//input[@name='username']";
    public static final String LOGIN_PAGE_PASSWORD_FIELD = "//input[@name='password']";

    public static final String LOGIN_PAGE_LOGIN_BUTTON = "//button[@type='submit']";

    public static final String LOGIN_PAGE_PROFILE_BUTTON = "//span[text()='My Info']";

    public static final String LOGIN_PAGE_NAME_BADGE = "//span[@class=\"oxd-userdropdown-tab\"]";

    public static final String LOGIN_PAGE_GENERIC_SECTION = "//span[text()='%s']";



    // PROFILE PAGE

    public static final String PROFILE_PAGE_NATIONALITY_DROPDOWN = "(//div[@class=\"oxd-select-text oxd-select-text--active\"])[1]";
    public static final String PROFILE_PAGE_NATIONALITY_GENERIC = "//span[text()='%s']";

    // RECRUITMENT PAGE

    public static final String RECRUITMENT_PAGE_FIRSTNAME_FIELD = "//input[contains(@name,'firstName')]";
    public static final String RECRUITMENT_PAGE_MIDDLENAME_FIELD = "//input[contains(@name,'middleName')]";
    public static final String RECRUITMENT_PAGE_LASTNAME_FIELD = "//input[contains(@placeholder,'Last Name')]";

    public static final String RECRUITMENT_PAGE_MAIL_FIELD = "(//input[@placeholder='Type here'])[1]";

    // PIM PAGE

    public static final String PIM_PAGE_SAVE_BUTTON = "//button[@type='submit']";

}
