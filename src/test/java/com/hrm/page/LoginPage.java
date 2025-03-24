package com.hrm.page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")
public class LoginPage extends PageObject {
    @FindBy(name = "username")
    private WebElementFacade username;

    @FindBy(name = "password")
    private WebElementFacade password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElementFacade loginButton;

    private DashboardPage dashboardPage;


    public void enterUsername(String username){
        this.username.shouldBeVisible();
        this.username.type(username);
    }

    public void enterPassword(String password){
        this.password.type(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public String getDashboardPage() {
        return dashboardPage.getUrl();
    }

    public void getLoginPage() {
        getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    }
}
