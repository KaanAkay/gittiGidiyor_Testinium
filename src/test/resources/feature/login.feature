@login_sayfası
Feature: Login Test Senaryoları

Scenario: Başarılı login testi
  And   Gittigidiyor sitesi açılır
  Then  Ana sayfanın açıldığı kontrol edilir.
  Then  Login butonunun üzerine gelinir.
  Then  Login butonuna tıklanır.
  And   Login sayfasının yüklenmesi beklenir.
  And   Login sayfasında eposta kutusu doldurulur.
  And   Login sayfasında şifre alanı doldurulur.
  Then  Siteye Login Olunur.
  When  Login işlemi kontrol edilir.
  And   Arama kutucuğuna bilgisayar kelimesi girilir.
  And   Bul butonuna tıklanır.
  And   Arama sonuçları sayfası görüntülenir.
  And   ikinci sayfaya tıklanır.
  And   ikinci sayfanın açıldığı kontrol edilir.
  Then  Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir.
  And   Seçilen ürün sepete eklenir.
  And   Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılır.
  And   Adet artırılır.
  And   Sepete Gidilir.
  And   İki adet Ürün olduğu kontrol edilir.
  And   Ürün sepetten silinerek sepetin boş olduğu kontrol edilir.

