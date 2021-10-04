package com.SepSriniCucu;

import org.openqa.selenium.WebDriver;

import baseclass.BaseClasssep;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BsepSteps extends BaseClasssep {
	WebDriver driver = BsepRunner.driver;
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		loadProperties();
	   	   String str = p.getProperty("url");
	   	   System.out.println(str);
	}

	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user Enter The \"([^\"]*)\" In password Field$")
	public void user_Enter_The_In_password_Field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user Click On The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user Select The Location In Location Field$")
	public void user_Select_The_Location_In_Location_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user Select The Hotel In Hotel Field$")
	public void user_Select_The_Hotel_In_Hotel_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user Select The Room Type In RoomType Field$")
	public void user_Select_The_Room_Type_In_RoomType_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user Select The No\\. Of Rooms In Room Field$")
	public void user_Select_The_No_Of_Rooms_In_Room_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user Enters The Date In check In Date Field$")
	public void user_Enters_The_Date_In_check_In_Date_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user Enters The Date In check Out Date Field$")
	public void user_Enters_The_Date_In_check_Out_Date_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user Select Adults per Room In Adults per Room Field$")
	public void user_Select_Adults_per_Room_In_Adults_per_Room_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user Select Children Per Room In Children per Room Field$")
	public void user_Select_Children_Per_Room_In_Children_per_Room_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user Click On The Search Button And It Navigates To The Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user Click The Radio Button To Select The Hotel$")
	public void user_Click_The_Radio_Button_To_Select_The_Hotel() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user Click On The Continue Button And It Navigates To The Booking Page$")
	public void user_Click_On_The_Continue_Button_And_It_Navigates_To_The_Booking_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user Enter The Firstname In Firstname Field$")
	public void user_Enter_The_Firstname_In_Firstname_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user Enter The Lastname In Lastname Field$")
	public void user_Enter_The_Lastname_In_Lastname_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user Enter The Address In Billing Address Field$")
	public void user_Enter_The_Address_In_Billing_Address_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user Enter The Credit Card No\\. In Credit Card No\\. Field$")
	public void user_Enter_The_Credit_Card_No_In_Credit_Card_No_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user Select The Credit Card Type In Credit Card Type Field$")
	public void user_Select_The_Credit_Card_Type_In_Credit_Card_Type_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user Select The Month In Expiry Date Field$")
	public void user_Select_The_Month_In_Expiry_Date_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user Select The Year In Expiry Date Field$")
	public void user_Select_The_Year_In_Expiry_Date_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user Enter The Cvv No\\. In Cvv Field$")
	public void user_Enter_The_Cvv_No_In_Cvv_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user Click On The Book Now Button And It Navigates To The Booking Confirmation Page$")
	public void user_Click_On_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirmation_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user Click On The My Itinerary Button And It Navigates To The Book Itinerary Page$")
	public void user_Click_On_The_My_Itinerary_Button_And_It_Navigates_To_The_Book_Itinerary_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user Click On The Logout Button And It Navigates To The Logout Page$")
	public void user_Click_On_The_Logout_Button_And_It_Navigates_To_The_Logout_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}
