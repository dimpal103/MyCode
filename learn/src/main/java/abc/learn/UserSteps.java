package abc.learn;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class UserSteps {

	private User user = new User();

	@Given("^that the user (.*) is given a task to clear (.*) certification exam$")
	public void certificationName(String name, String certication) throws Throwable {
		user.setName(name);
		user.setCertification(certication);
	}

	@When("^(.*) got (\\d+) marks in exam$")
	public void gotMarks(String name, int marks) throws Throwable {
		user.setName(name);
		user.setMarks(marks);
	}

	@Then("^(.*) is known as (.*) certified$")
	public void certifiedYes(String name, String certification) throws Throwable {
	//	assertThat(name, is(user.getName()));
	//	assertThat(user.getCertification(), equalTo("Java"));
	//	assertThat(user.getResult(), is(true));
	Assert.assertEquals(name, user.getName());
	Assert.assertEquals(user.getCertification(), "Java");
	Assert.assertEquals(user.getResult(), true);
	
	
	
	}
}
