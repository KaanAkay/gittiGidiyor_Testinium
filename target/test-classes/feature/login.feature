Feature: Login Test Senaryoları

Scenario: Başarılı login testi


And   Gittigidiyor sitesi açılır
Then  Ana sayfanın açıldığı kontrol edilir. Siteye login olunur
When  Login işlemi kontrol edilir.
And   Arama kutucuğuna bilgisayar kelimesi girilir.
And   Arama sonuçları sayfasından 2.sayfa açılır.
And   2.sayfanın açıldığı kontrol edilir.
Then  Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir.
And   Seçilen ürün sepete eklenir.
And   Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılır.
And   Arama  sonuclarısayfası açılır.
Then  ikinci sayfaya tıklanır.
And   ikinci sayfanın açıltığı kontrol edilir
And   Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir.
And   Seçilen ürün sepete eklenir.
And   Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılır.
And   Adet arttırılarak ürün adedinin 2 olduğu doğrulanır.
And   Sepete Gidilir
And   İki adet Ürün olduğu kontrol edilir.
And   Ürün sepetten silinerek sepetin boş olduğu kontrol edilir.

