package Tests;

import Pages.LoginPage;
import Util.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class LoginTest extends BasePage {

    private LoginPage loginPage;

    public LoginTest(){
        this.loginPage = new LoginPage();
    }

        @And("^Login sayfasında eposta kutusu doldurulur\\.$")
        public void loginSayfasındaEpostaKutusuDoldurulur(){
            loginPage.writeEmailAdress();
        }

        @And("^Login sayfasında şifre alanı doldurulur\\.$")
        public void loginSayfasındaŞifreAlanıDoldurulur(){
            loginPage.writePassword();
    }


        @Then("^Siteye Login Olunur\\.$")
        public void siteyeLoginOlunur(){
            loginPage.clickTheLgnBtn();
    }

}
