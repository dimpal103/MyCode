package Cucumber.Cucumber;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class stepDefinition {
		
		       @Given("^https://www.codiva.io$")
		
		       public void givenStatment(){
		
		              System.out.println("Given statement executed successfully");
		
		       }
		
		       @When("^email dimpal.tarwan@gmail.conm and password thanksok is given$")
		
		       public void whenStatement(){
		
		              System.out.println("When statement execueted successfully");
		
		       }
		
		       @Then("^show login successful$")
		
		       public void thenStatment(){
		
		              System.out.println("Then statement executed successfully");
		
		       }
		
		}



