package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjects.HomePage;
import PageObjects.IntroductionPage;

public class DSIntroductionDetails {

	public HomePage hp = new HomePage();
	public IntroductionPage ip =  new IntroductionPage();

	public void the_user_should_open_the_ds_algo_portal_url_in_any_supported_browser() {
		hp.openUrl();
	}

	public void the_user_should_land_in_data_structure_introduction_page_with_register_and_sign_in_links() {
		ip.validateUserIsOnIntroductionPage();
		System.out.println("The user should land in Data Structure Introduction Page with register and Sign in links");
	}

	public void the_user_clicks_the_get_started_button() {
		System.out.println("The user clicks the Get Started button");
		hp.clickOnHomePageGetStartedButton();
	}

	public void the_user_clicks_the_data_structure_dropdown_arrow() {
		ip.clickOnDataStructureDropdown();
		System.out.println("The user clicks the data structure dropdown arrow");
	}

	public void the_user_should_able_to_see_siz_options_arrays_linked_list_stack_queue_tree_graph_in_dropdown_menu() {
		ip.validateListInDataStructureDropDownMenu();
		System.out.println(
				"The user should able to see siz options Arrays Linked,List,Stack,Queue,Tree,Graph in dropdown menu");
	}

	public void the_user_is_on_the_ds_introduction_page() {
		hp.clickOnHomePageGetStartedButton();	
	}

	public void the_user_clicks_any_get_started_buttons_of_data_structures_on_the_ds_introduction_page() {
		ip.clickOnDSIntroductionhomepage();
	}

	public void the_user_should_able_to_see_an_warning_message_you_are_not_logged_in() {
		ip.validateWarningMessageWhenNotLoggedIn();
	}

	public void the_user_clicks_register_link_on_the_ds_introduction_page() {
		ip.clickOnRegisterlink();
	}

	public void the_user_should_navigate_to_register_page() {
		ip.validateUserNavigatedToRegisterPage();
	}

	public void the_user_is_on_the_ds_introduction_page_as_signed_in() {
		hp.openUrl();
		hp.clickOnHomePageGetStartedButton();
		ip.completeTheLOgin();
	}

	public void the_user_clicks_the_get_started_button_of_ds_introduction() {
		ip.clickOnGetStartedButtonOfDSIntroduction();
	}

	public void the_user_should_navigate_to_ds_intoduction_details_page() {
		ip.validateUserisOnDSIntroduction();
	}

	public void user_should_see_the_time_complexity_link() {
		ip.validateTimeComplexiButtonDisplayed();
	}

	public void the_user_clicks_the_time_complexity_button() {
		ip.clickOnTimeComplexiButton();
	}

	public void user_should_navigate_to_time_complexity_page() {
		ip.validateTimeComplexitypage();
	}

	public void user_should_see_practice_question_link_and_try_here() {
		ip.validateTimeComplexitypage();
	}

	public void user_clicks_try_here_link() {
		ip.clickOnTryHerebutton();
	}

	public void user_should_navigate_to_try_editor_page() {
		ip.codeTryEditorPage();
	}

	public void user_is_on_try_here_page_for_time_complexity() {
		ip.codeTryEditorPage();
	}

	public void the_user_write_the_invalid_code_in_editor() {
		ip.enterCodeInEditor("ABC");
	}

	public void click_the_run_button() {
		ip.clickOnRunButton();
	}

	public void the_user_should_able_to_see_an_error_message_in_alert_window() {
		ip.validateErrorMessageDisplayedOnAlert("dsportalapp.herokuapp.com says", "NameError: name 'ABC' is not defined on line 1");
	}

	public void the_user_should_not_see_any_error_message_or_alert() {
		ip.validateNoConsoleOuput();
	}

	public void the_user_write_the_valid_code_in_editor() {
		ip.enterCodeInEditor("print(\"hello\")");
	}

	public void the_user_should_able_to_see_output_in_the_console() {
		ip.validateConsoleOutput("hello");
	}

}