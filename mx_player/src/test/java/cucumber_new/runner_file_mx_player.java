package cucumber_new;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions (features={"src/test/resources/mxplayer/mxplayer.feature"},glue= {"defination_mxplayer"},plugin ={"html:testoutput/cucumber1.html"})
public class runner_file_mx_player {

}





