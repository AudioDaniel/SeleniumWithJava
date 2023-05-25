package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue = {"stepsDef",
                "hooks"
        },
        //tags = "@Saucedemo",
        plugin = {"pretty",
                //"html:report/cucumber-report/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                //"json:target1/cucumber-report/cucumber.json"
                "json:report/cucumber-report/cucumber.json"
        },
        stepNotifications = true
)

public class Runner {
        /*@BeforeClass
        public static void setVariables(){
                System.setProperty("window-size","750x1334");
        }*/
}

