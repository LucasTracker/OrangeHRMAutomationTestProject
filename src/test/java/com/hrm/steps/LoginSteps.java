package com.hrm.steps;

import com.hrm.page.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    private LoginPage loginPage;

    @Given("que estou na página de login")
    public void que_estou_na_página_de_login() {
        loginPage.getLoginPage();
    }
    @When("eu preencho o campo de usuário com {string}")
    public void eu_preencho_o_campo_de_usuário_com(String string) {
        loginPage.enterUsername(string);
    }
    @When("eu preencho o campo de senha com {string}")
    public void eu_preencho_o_campo_de_senha_com(String string) {
        loginPage.enterPassword(string);
    }
    @When("eu clico no botão login")
    public void eu_clico_no_botão_login() {
        loginPage.clickLoginButton();
    }
    @Then("eu devo ver a página inicial com a url contendo a palavra {string}")
    public void eu_devo_ver_a_página_inicial_com_a_url_contendo_a_palavra(String string) {
        loginPage.getDashboardPage();
    }


}
