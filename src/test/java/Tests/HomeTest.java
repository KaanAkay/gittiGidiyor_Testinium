package Tests;

import Pages.HomePage;
import Util.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class HomeTest extends BasePage {

    private HomePage homePage;

    public HomeTest (){
        this.homePage = new HomePage();
    }

    @And("^Gittigidiyor sitesi açılır$")
    public void gittigidiyorSitesiAçılır() {
        System.out.println("Site Açılıyor.");
    }

    @Then("^Ana sayfanın açıldığı kontrol edilir\\.$")
    public void anaSayfanınAçıldığıKontrolEdilir(){
        Assert.assertEquals("GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi",driver.getTitle());
    }

    @Then("^Login butonunun üzerine gelinir\\.$")
    public void loginButonununÜzerineGelinir(){
        homePage.iconwait();
    }

    @Then("^Login butonuna tıklanır\\.$")
    public void loginButonunaTıklanır() {
        homePage.clicklogin();
    }


    @And("^Login sayfasının yüklenmesi beklenir\\.$")
    public void loginSayfasınınYüklenmesiBeklenir() {
        homePage.waitForDocumentLoad(homePage.driver);
    }
}
