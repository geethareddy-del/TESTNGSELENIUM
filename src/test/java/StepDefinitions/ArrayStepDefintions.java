package StepDefinitions;

import PageObjects.ArrayPage;
import PageObjects.IntroductionPage;

public class ArrayStepDefintions {

	public ArrayPage ap = new ArrayPage();
	public IntroductionPage ip =  new IntroductionPage();

	public void the_user_clicks_on_get_started_link_for_array() {
		ip.clickOnGetStartedButtonOfArray();
	}

	public void the_user_is_on_the_array_details_page() {
		ap.validateUserIsOnArrayDetailPage();
	}

	public void the_user_click_on_array_in_python_link() {
		ap.clickOnArrayInPythonLink();
	}

	public void the_user_is_navigated_to_array_in_arrays_in_python() {
		ap.validateUserIsOnArraysInPython();
	}

	public void the_user_is_on_the_arrays_in_python_page() {
		ap.clickOnArrayInPythonLink();
		ap.validateUserIsOnArraysInPython();
	}

	public void the_user_click_on_array_using_list_link() {
		ap.clickOnArrayUsingListLink();
	}

	public void the_user_is_navigated_to_array_in_array_using_list() {
		ap.validateUserIsOnArraysUsingList();
	}

	public void the_user_is_on_the_array_using_list() {
		ap.clickOnArrayUsingListLink();
		ap.validateUserIsOnArraysUsingList();
	}

	public void the_user_click_on_basic_operations_in_lists() {
		ap.clickOnBasicOperationsLink();
	}

	public void the_user_is_navigated_to_basic_opertaions_in_lists() {
		ap.validateUserIsOnBasicOperationsInList();
	}

	public void the_user_is_on_the_basic_operations_in_lists() {
		ap.clickOnBasicOperationsLink();
		ap.validateUserIsOnBasicOperationsInList();
	}

	public void the_user_click_on_applications_of_array_link() {
		ap.clickOnApplicationOfArrayLink();
	}
	
	public void the_user_is_navigated_to_applications_of_array() {
		ap.validateUserIsOnApplicationsOfArray();
	}

	public void the_user_is_on_the_applications_of_array() {
		ap.clickOnApplicationOfArrayLink();
		ap.validateUserIsOnApplicationsOfArray();
	}

	public void the_user_click_on_the_practice_questions_link() {
		ap.clickOnPracticeQuestionsLink();
	}

	public void the_user_navigates_to_practice_question_page() {
		ap.validateUserIsOnPracticeQuestionsPage();
	}

}