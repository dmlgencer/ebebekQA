package baseUrl;

import io.cucumber.java.AfterAll;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Before;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import testResultLogger.TestResultLogger;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestResultLogger.class)

public class EbebekBaseUrl {

    protected RequestSpecification spec;
    //If you use @Before annotation at the top of a method, it will be executed before every test method.
    @Before
    public void setUp(){

        spec = new RequestSpecBuilder().setBaseUri("https://www.e-bebek.com/").build();

    }

}
