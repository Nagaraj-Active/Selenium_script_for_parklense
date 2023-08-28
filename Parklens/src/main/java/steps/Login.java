package steps;

import io.cucumber.java.en.*;

public class Login 
{
	@Given("User launch the browser")
	public void user_launch_the_browser() 
	{
	  System.out.println("Iam parklense");
	}

	@When("User enter the valid email")
	public void user_enter_the_valid_email() 
	{
	  System.out.println("Iam parklense");
	}

	@And("User enter the valid password")
	public void user_enter_the_valid_password() 
	{
		System.out.println("Iam parklense");	
    }

	@And("Click on login button")
	public void click_on_login_button() 
	{
		System.out.println("Iam parklense");
	}

	@Then("User navigate to home page")
	public void user_navigate_to_home_page() 
	{
		System.out.println("Iam parklense");
	}

	@When("User enter the invalid mail_id")
	public void user_enter_the_invalid_mail_id() 
	{
		System.out.println("Iam parklense");
	}

	@Then("Proper error message should be displayed")
	public void proper_error_message_should_be_displayed() 
	{
		System.out.println("Iam parklense");
	}

	@When("User enter the valid mail_id")
	public void user_enter_the_valid_mail_id() 
	{
		System.out.println("Iam parklense");
	}

	@When("User enter the invalid password")
	public void user_enter_the_invalid_password() 
	{
		System.out.println("Iam parklense");   
	}

	@When("User keep the empty mail id text field")
	public void user_keep_the_empty_mail_id_text_field() 
	{
		System.out.println("Iam parklense");	
	}

	@When("User keep the empty password text field")
	public void user_keep_the_empty_password_text_field() 
	{
		System.out.println("Iam parklense");
	}

@When("click on the login button")
public void click_on_the_login_button() 
{
System.out.println("End");
}



}
