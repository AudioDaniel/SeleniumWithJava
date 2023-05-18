package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import pages.BasePage;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue = {"stepsDef",
                "hooks"
        },
        //tags = "@Saucedemo",
        plugin = {"pretty",
                "html:report/cucumber-report/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                //"json:target1/cucumber-report/cucumber.json"
        },
        stepNotifications = true
)

public class Runner {
        /*@BeforeClass
        public static void setVariables(){
                System.setProperty("window-size","750x1334");
        }*/
}

