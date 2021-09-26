package Tests;

import Pages.BasketPage;
import cucumber.api.java.en.And;

public class BasketTest extends BasketPage {
    BasketPage basketPage;

    @And("^İki adet Ürün olduğu kontrol edilir\\.$")
    public void ikiAdetÜrünOlduğuKontrolEdilir(){
        basketPage.checktwo();
    }

    @And("^Ürün sepetten silinerek sepetin boş olduğu kontrol edilir\\.$")
    public void ürünSepettenSilinerekSepetinBoşOlduğuKontrolEdilir(){
        basketPage.clickdelete();
        basketPage.checkTheBasketEmpty();
    }
}
