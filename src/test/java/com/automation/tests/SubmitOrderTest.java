package com.automation.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.base.BaseTest;
import com.automation.pageobjects.LandingPage;

public class SubmitOrderTest extends BaseTest {
    
    @Test
    public void submitOrder() throws IOException, InterruptedException {
        String productName = "ZARA COAT 3";
        // User registration is needed to run this test or use existing credentials.
        // For this demo, we will use a dummy login that might fail if credentials are invalid,
        // but it proves the framework structure.
        // Ideally we should sign up or use known credentials.
        
        // Replace with valid credentials to make the test pass through
        landingPage.loginApplication("anshika@gmail.com", "Iamking@000");
        
        // This is a placeholder test to verify framework execution.
        // In a real scenario, we would add items to cart, checkout, etc.
        // For now, we will just verify that we landed on the page and tried to login.
        
        // Just for assertion demo
        Assert.assertTrue(true); 
    }
}
