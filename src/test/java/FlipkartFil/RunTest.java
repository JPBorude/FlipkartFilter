package FlipkartFil;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
           (
        		   features="src/test/resources/Flipkart_Filters",
        		   glue= {"FlipkartFil"},
        		   plugin= {"html:target/cucumber-html-report"}
        		   
        		   )
public class RunTest {

}
