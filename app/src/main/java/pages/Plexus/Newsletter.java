package pages.Plexus;

import elements.PlexusElements;
import scripts.Commons;

public class Newsletter {

    // Locators ----------------------
    private static String cookiesAcceptButton = PlexusElements.cookiesAcceptButton;
    private static String nameInput = PlexusElements.nameInput;
    private static String emailInput = PlexusElements.emailInput;
    private static String subscribeButton = PlexusElements.subscribeButton;

    // CSS ----------------------
    private static String alertMessage = PlexusElements.alertMessage;


    // Messages ----------------------
    private static String emptyFieldsMessage = PlexusElements.SUBSCRIBE_PAGE_EMPTY_FIELDS_MESSAGE;

    public static void navigateToSubsriptionPage() {
        Commons.navigateTo("https://www.plexus.es/inscripcion/");
        Commons.click(Commons.findElementByXpath(cookiesAcceptButton));
    }


    // TODO QUITAR "AA" en MAIL
    public static void setEmailPlexus(String email) {
        Commons.writeText(emailInput, "aa");
    }

    public static void setName(String name) {
        Commons.writeText(nameInput, name);
    }

    public static void clickSubscribeButton() {
        Commons.click(Commons.findElementByXpath(subscribeButton));
    }

    public static void verifyErrorMessage() {


        Commons.verifyElementHasAttribute(Commons.findElementByXpath(emailInput), "validationMessage",
                "\"Incluye un signo \\\"@\\\" en la dirección de correo electrónico. La dirección \\\"aa\\\" no incluye el signo \\\"@\\\".\"\n"
        );
        // TODO SEPARAR EN STEPS
        Commons.writeText(emailInput,"");
        Commons.verifyElementHasAttribute(Commons.findElementByXpath(emailInput),"validationMessage",
                "Completa este campo");




    }



}