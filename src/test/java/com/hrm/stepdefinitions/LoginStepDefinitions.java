package com.hrm.stepdefinitions;

import com.hrm.steps.LoginSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class LoginStepDefinitions {
    @Steps
    private LoginSteps loginSteps;

    @Given("que estou na página de login")
    public void queEstouNaPaginaDeLogin(){
        loginSteps.que_estou_na_página_de_login();
    }

    @When("eu preencho o campo de usuário com {string}")
    public void eu_preencho_o_campo_de_usuário_com(String string) {
        loginSteps.eu_preencho_o_campo_de_usuário_com(string);
    }

    @And("eu preencho o campo de senha com {string}")
    public void euPreenchoOCampoSenha(String password){
        loginSteps.eu_preencho_o_campo_de_senha_com(password);
    }

    @And("eu clico no botão login")
    public void euClicoNoBotaoLogin(){
        loginSteps.eu_clico_no_botão_login();
    }

    @Then("eu devo ver a página inicial com a url contendo a palavra {string}")
    public void euReceboAPaginaDeDashboard(String dashboard){
        loginSteps.eu_devo_ver_a_página_inicial_com_a_url_contendo_a_palavra(dashboard);
    }
}
