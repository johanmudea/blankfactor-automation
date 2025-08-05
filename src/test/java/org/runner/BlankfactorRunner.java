package org.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // para especificarque se va a correr con cucumber

@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE ,
        features = {"src/test/resources/feature/blankfactorFlow.feature"},
        glue = "org.steps"


)

public class BlankfactorRunner {


}
