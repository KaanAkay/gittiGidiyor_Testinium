package Pages;

import Util.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class ProductPage extends BasePage {

    private final By secondPageElement = By.xpath("//*[@id=\"best-match-right\"]/div[5]/ul/li[2]/a");
    public By secondPageComputer;
    private final By selectedSecond=By.xpath("//*[@class=\"current\"]");
    private final By userName=By.xpath("//*[@class='gekhq4-4 egoSnI']//following::span");
    private final By searchInputElement = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[1]/div[2]/input");
    private final By btnSearch=By.xpath("//*[@data-cy=\"search-find-button\"]");
    private final By btnAddTheBsc =By.id("add-to-basket");
    private final By productPrice=By.id("sp-price-lowPrice");
    private final By basketIcon=By.xpath("//*[@id=\"header_wrapper\"]/div[4]/div[3]");


    String productPrc;
    String basketPrc;

    public void checkUserName(){
        Assert.assertEquals("asasaasdasdasdasdasdasd812149",driver.findElement(userName).getText());
        }

    public void searchComputer(){
        driver.findElement(searchInputElement).sendKeys("Bilgisayar");
        }

    public void clickTheFindButton(){
        clickElement(btnSearch);
    }

    public void passSecondPage(){
        scroolDown();
        clickElement(secondPageElement);
    }

    public void checkPageTwo(){
        String second=driver.findElement(selectedSecond).getAttribute("innerText").toString();
        Assert.assertEquals("2",second );
    }

    public void clickRandomProduct(){
        int product_index=(int)(Math.random()*32);
        secondPageComputer=By.xpath("//*[@product-index=\""+product_index+"\"]");
        clickElement(secondPageComputer);
    }

    public void addSelectedProductToBasket(){
        clickElement(btnAddTheBsc);
    }

    public void takeTwoPricesAndControlThem(){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight/10)");
        productPrc=driver.findElement(productPrice).getAttribute("innerText").toString();
        mouseOver(basketIcon);

        basketPrc= driver.findElement(By.xpath("//p[@class='product-price']/span[@class='product-new-price']")).getAttribute("innerText").toString();

        System.out.println("Product Price :" + basketPrc);

        System.out.println("Basket Price :" + productPrc);

        Assert.assertEquals(productPrc,basketPrc);

        driver.navigate().refresh();
    }

    public void increaseProductCount(){
        addSelectedProductToBasket();
    }

    public void goToBasket(){

        clickElement(basketIcon);


    }





}
