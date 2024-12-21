package com.ajay.cucumberpractice.stepdefinitions;

import com.ajay.cucumberpractice.RestaurantMenu;
import com.ajay.cucumberpractice.RestaurantMenuItem;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MenuManagementSteps {
    RestaurantMenuItem NewMenuItem;
    RestaurantMenu locationMenu = null;
    @Given("I have a menu item with name {string} and price {int}")
    public void i_have_a_menu_item_with_name_and_price(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions

        String newMenuItemName="pasta";
        int price=20;
        NewMenuItem=new RestaurantMenuItem(newMenuItemName,"",price);
        System.out.println("step1");
    }

    @When("I add that menu item")
    public void i_add_that_menu_item() {
        // Write code here that turns the phrase above into concrete actions
locationMenu=new RestaurantMenu();
        locationMenu.addMenuItem(new RestaurantMenuItem("pasta","",20));
        System.out.println("step2");
    }

    @Then("Menu Item with name {string} should be added")
    public void menu_item_with_name_should_be_added(String string) {
        // Write code here that turns the phrase above into concrete actions
    boolean exists=locationMenu.doesItemExist(NewMenuItem);
    System.out.println("step3 " +exists);
    }
}
