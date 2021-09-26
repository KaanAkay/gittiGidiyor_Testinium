package Tests;

import Pages.ProductPage;
import Util.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductTest extends BasePage{

    private ProductPage productPage;

    public ProductTest(){
        this.productPage = new ProductPage();
    }

    @When("^Login işlemi kontrol edilir\\.$")
    public void loginIşlemiKontrolEdilir(){
        productPage.checkUserName();
    }

    @And("^Arama kutucuğuna bilgisayar kelimesi girilir\\.$")
    public void aramaKutucuğunaBilgisayarKelimesiGirilir(){
        productPage.searchComputer();
    }

    @And("^Bul butonuna tıklanır\\.$")
    public void bulButonunaTıklanır(){
        productPage.clickTheFindButton();
    }

    @And("^Arama sonuçları sayfası görüntülenir\\.$")
    public void aramaSonuçlarıSayfasıGörüntülenir(){
        productPage.waitForDocumentLoad(productPage.driver);
    }

    @And("^ikinci sayfaya tıklanır\\.$")
    public void ikinciSayfayaTıklanır(){
        productPage.passSecondPage();
    }

    @And("^ikinci sayfanın açıldığı kontrol edilir\\.$")
    public void ikinciSayfanınAçıldığıKontrolEdilir(){
        scroolDown();
        productPage.checkPageTwo();
    }

    @Then("^Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir\\.$")
    public void sonucaGöreSergilenenÜrünlerdenRastgeleBirÜrünSeçilir(){
        productPage.clickRandomProduct();
    }

    @And("^Seçilen ürün sepete eklenir\\.$")
    public void seçilenÜrünSepeteEklenir(){
        productPage.addSelectedProductToBasket();
    }

    @And("^Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılır\\.$")
    public void ürünSayfasındakiFiyatIleSepetteYerAlanÜrünFiyatınınDoğruluğuKarşılaştırılır(){
        productPage.takeTwoPricesAndControlThem();
    }

    @And("^Adet artırılır\\.$")
    public void adetArtırılır(){
        productPage.increaseProductCount();
    }

    @And("^Sepete Gidilir\\.$")
    public void sepeteGidilir(){
        productPage.goToBasket();
    }
}