package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		tags = "@brinca", plugin = "pretty", snippets = SnippetType.CAMELCASE, dryRun = false, strict = false,
		//glue = "steps",
		//features = "src/test/resources/features/brinca.feature"
		glue = {"steps"},
		features = "classpath:features"
		)

public class Runner {

}
