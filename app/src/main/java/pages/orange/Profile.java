package pages.orange;

import elements.OrangeElements;
import scripts.Commons;

public class Profile {
    public static void changeNationalityProfilePage(String option) {
        Commons.click(OrangeElements.PROFILE_PAGE_NATIONALITY_DROPDOWN);

        String nationalityXpath = String.format(OrangeElements.PROFILE_PAGE_NATIONALITY_GENERIC, option);
        
        Commons.click(Commons.findElementByXpath(nationalityXpath));
    }
}
