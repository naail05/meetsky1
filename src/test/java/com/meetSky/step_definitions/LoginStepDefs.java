package com.meetSky.step_definitions;

import com.meetSky.pages.LoginPage;

import io.cucumber.java.en.Given;


public class LoginStepDefs {
    
    LoginPage loginPage=new LoginPage();


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }



    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
        loginPage.loginFromFeature(username,password);

    }



}
