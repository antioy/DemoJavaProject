package robotSpare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.page_home;

import java.time.Duration;

public class LoginPage extends page_home {
    public LoginPage(WebDriver driver, WebDriverWait wait)
    {
        super(driver, new WebDriverWait(driver, Duration.ofSeconds(10)));
    }

    public void NavigateToUrl(){
        String environment;
        Driver().navigate().to(environment);
    }

    private WebDriver Driver() {
        return null;
    }

    By username = By.id("username");
    By password = By.id("password");
    By loginButton = By.xpath("//button[@class='btn btn-primary']");;



    public void Login(String user, String pass){
        findElementWithWait(username).sendKeys(user);
        findElementWithWait(password).sendKeys(pass);
        findElementWithWait(loginButton).click();
    }

    private WebElement findElementWithWait(By username) {
        return null;
    }
}