package stepDefinitions;

import io.cucumber.java.en.*;

public class RegisterPageStep {

	@Then("user navigates to Register Account")
	public void user_navigates_to_register_account() {
	    
	}
	@When("user enter firstname and lastname and email and password and check marked Privacy Policy and clicked on continue")
	public void user_enter_firstname_and_lastname_and_email_and_password_and_check_marked_privacy_policy_and_clicked_on_continue(io.cucumber.datatable.DataTable dataTable) {
	    
	}
	
	@Then("account created successfully and shows {string}")
	public void account_created_successfully_and_shows(String status_msg) {
	    
	}

	
	@Then("account not created and showing user already have account")
	public void account_not_created_and_showing_user_already_have_account() {
	    
	}
}
