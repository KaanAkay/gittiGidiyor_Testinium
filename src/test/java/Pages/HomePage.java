package Pages;

import Util.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private final By icon = By.xpath("//*[@data-cy=\"header-user-menu\"]");
    private final By btnlgn = By.xpath("//*[@data-cy=\"header-login-button\"]");

    public void iconwait(){
        mouseOver(icon);
    }

    public void  clicklogin(){
        clickElement(btnlgn);

    }




}
