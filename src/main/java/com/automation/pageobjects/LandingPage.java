package com.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.abstractcomponents.AbstractComponent;

public class LandingPage extends AbstractComponent {

    WebDriver driver;

    public LandingPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // WebElement userEmail = driver.findElement(By.id("userEmail"));
    
    @FindBy(id = "userEmail")
    WebElement userEmail;
    
    @FindBy(id = "userPassword")
    WebElement passwordEle;
    
    @FindBy(id = "login")
    WebElement submit;
    
    @FindBy(css = "[class*='flyInOut']")
    WebElement errorMessage;

    public void loginApplication(String email, String password) {
        userEmail.sendKeys(email);
        passwordEle.sendKeys(password);
        submit.click();
    }

    public void goTo() {
        driver.get("https://rahulshettyacademy.com/client");
    }
    
    public String getErrorMessage() {
        waitForWebElementToAppear(errorMessage);
        return errorMessage.getText();
    }
}
