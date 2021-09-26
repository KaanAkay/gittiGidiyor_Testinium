package Pages;

import Util.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasketPage extends BasePage {

    public By btnDelete=By.xpath("//a[@class='btn-delete btn-update-item']");
    public By emptyHeader=By.xpath("//div[@class='gg-w-22 gg-d-22 gg-t-21 gg-m-18']//following::h2");


    public void checktwo(){
        Select select = new Select(driver.findElement(By.xpath("//select")));
        WebElement option = select.getFirstSelectedOption();
        String ItemQ = option.getText();
        Assert.assertEquals("2", ItemQ);
    }


    public void clickdelete(){

        clickElement(btnDelete);
    }

    public void checkTheBasketEmpty(){
        String emptyText=driver.findElement(emptyHeader).getAttribute("innerText").toString();
        Assert.assertEquals("Sepetinizde ürün bulunmamaktadır.", emptyText);
    }




}


