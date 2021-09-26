package Pages;

import Util.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private final By emailElement = By.id("L-UserNameField");
    public By passwordElement = By.id("L-PasswordField");
    public By loginBtnElement = By.id("gg-login-enter");

    public void writeEmailAdress(){
        driver.findElement(emailElement).sendKeys("Linktestotomasyon@gmail.com");
    }

    public void writePassword(){

        driver.findElement(passwordElement).sendKeys("asdf1234");
    }

    public void clickTheLgnBtn(){

        clickElement(loginBtnElement);
    }

}
