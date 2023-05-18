package pages.orange;
import elements.OrangeElements;
import org.jsoup.select.CombiningEvaluator;
import scripts.Commons;

public class Recruitment {

    public static void writeFirstName(String firstname) {
        Commons.writeText(OrangeElements.RECRUITMENT_PAGE_FIRSTNAME_FIELD,firstname);
    }

    public static void writeMiddleName(String middlename) {
        Commons.writeText(OrangeElements.RECRUITMENT_PAGE_MIDDLENAME_FIELD,middlename);
    }

    public static void writeLastName(String lastname) {
        Commons.writeText(OrangeElements.RECRUITMENT_PAGE_LASTNAME_FIELD,lastname);
    }

    public static void writeMail(String mail) {
        Commons.writeText(OrangeElements.RECRUITMENT_PAGE_MAIL_FIELD,mail);
    }
}
