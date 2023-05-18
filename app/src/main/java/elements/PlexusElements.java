package elements;

public class PlexusElements {

    // Locators -------------
    public static final String cookiesAcceptButton = "//button[@class=\"mgbutton moove-gdpr-infobar-allow-all gdpr-fbo-0\"]";
    public static final String nameInput = "//input[@name='FNAME']";
    public static final String emailInput = "//input[@name='EMAIL']";
    public static final String subscribeButton = "//input[@value='Suscribirse']";


    // CSS -------------
    public static final String alertMessage = "input:invalid";

    // Messages -------------
    public static final String SUBSCRIBE_PAGE_EMPTY_FIELDS_MESSAGE = "Completa este campo";


    //////////////////--------------------------------------------
    // CONTACT PAGE //--------------------------------------------
    //////////////////--------------------------------------------
    public static final String CONTACT_PAGE_SEND_BUTTON = "(//button[@type='submit'])[1]";

    public  static final String CONTACT_PAGE_EMAIL_LABEL = "(//*[@id='%s'])[1]";

    public static final  String CONTACT_PAGE_COOKIES_BUTTON = "//button[@class=\"mgbutton moove-gdpr-infobar-allow-all gdpr-fbo-0\"]";
}
