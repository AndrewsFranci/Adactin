package com.fb.stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {


@Given("^User launch the Adactin Application$")
public void user_launch_the_Adactin_Application() {
}

@When("^User enter valid \"([^\"]*)\" in the username field$")
public void user_enter_valid_in_the_username_field(String arg1) {
}

@When("^User enter  valid \"([^\"]*)\" in the password field$")
public void user_enter_valid_in_the_password_field(String arg1){
}

@When("^User clicks the login button$")
public void user_clicks_the_login_button()  {
}

@Then("^it navigates to the search hotel page$")
public void it_navigates_to_the_search_hotel_page()  {
}

@When("^user selects the location$")
public void user_selects_the_location()  {
}

@When("^user select the hotel$")
public void user_select_the_hotel() {
}

@When("^user selects the room type$")
public void user_selects_the_room_type()  {
}

@When("^user selects number of rooms$")
public void user_selects_number_of_rooms(){
}

@When("^user selects the checkin date$")
public void user_selects_the_checkin_date() {
}

@When("^user selects the checkout date$")
public void user_selects_the_checkout_date()  {
    
}

@When("^user selects adults per room$")
public void user_selects_adults_per_room()  {
}

@When("^user selects number of children per room$")
public void user_selects_number_of_children_per_room() {
}

@When("^user clicks the search icon$")
public void user_clicks_the_search_icon() {
}

@Then("^it navigates to the next page$")
public void it_navigates_to_the_next_page(){
}

@When("^user selects the radio button$")
public void user_selects_the_radio_button() {
}

@When("^user clicks the continue button$")
public void user_clicks_the_continue_button() {
}

@When("^User enters the name$")
public void user_enters_the_name() {
}

@When("^User enters the last name$")
public void user_enters_the_last_name()  {
}

@When("^user enters the Billing address$")
public void user_enters_the_Billing_address()  {
}

@When("^user adds Credit card number$")
public void user_adds_Credit_card_number() {
}

@When("^user selects the CC type$")
public void user_selects_the_CC_type() {
}

@When("^user selects the Expiry date$")
public void user_selects_the_Expiry_date()  {
}

@When("^user gives the CVV number$")
public void user_gives_the_CVV_number()  {
}

@Then("^user cliks logout$")
public void user_cliks_logout()  {
}



}
