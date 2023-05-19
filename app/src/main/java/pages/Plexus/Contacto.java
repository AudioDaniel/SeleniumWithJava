package pages.Plexus;

import elements.PlexusElements;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import scripts.Commons;
import utils.RGBtoANSIConverter;

import java.util.List;
import java.util.Map;

public class Contacto {
    public static void clickSendButton() {
        Commons.click(Commons.findElementByXpath(PlexusElements.CONTACT_PAGE_SEND_BUTTON));
        Commons.sleep(2500);
    }

    public static void verifyFieldsColors(DataTable dt) {
        String xpath = PlexusElements.CONTACT_PAGE_EMAIL_LABEL;
        String cssAttribute = "border-color";

        List<Map<String, String>> rows = dt.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            String field = columns.get("field");
            String color = columns.get("color");
            String xpathFormatted = String.format(xpath, field);


            Boolean result = Commons.verifyElementHasCssAttribute(
                    Commons.findElementByXpath(xpathFormatted),
                    cssAttribute,
                    color);

            System.out.println(RGBtoANSIConverter.RGBtoANSIPrintCode(color) + color + RGBtoANSIConverter.RESET);
            Assert.assertTrue(("Color doesn't match: " + color),result);
        }
        // String ASSERTED_COLOR = "rgb(224, 40, 79)";
        //Map<String, String> columns;
    }

    public static void navigateToContactPage() {
        Commons.navigateTo("https://www.plexus.es/contacto/");
        Commons.click(Commons.findElementByXpath(PlexusElements.CONTACT_PAGE_COOKIES_BUTTON));
    }
}
