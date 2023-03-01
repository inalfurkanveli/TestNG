package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QdPage {

  public  QdPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = "//a[text()='Log in']")
    public WebElement firstLoginLink;

@FindBy(id = "login-email")
    public WebElement emailBox;

@FindBy(id = "login-password")
    public WebElement passwordBox;

@FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;

@FindBy(xpath = "//a[text()='Instructor']")
    public WebElement successfulLogin;
}

