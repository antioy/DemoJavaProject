package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class page_home {

    private String baseUrl = "https://robotsparebinindustries.com/";
    private By elementsButtonLocator = By.xpath("//*[@class='category-cards']/div[1]");

    public page_home(org.openqa.selenium.WebDriver driver, org.openqa.selenium.support.ui.WebDriverWait webDriverWait) {
    }

    public page_home(WebDriver driver, WebDriverWait webDriverWait) {
    }

    public page_home(WebDriver driver, WebDriverWait webDriverWait) {
    }

    public page_home(WebDriver driver, WebDriverWait webDriverWait) {
    }


    public String getUrl() {
        return baseUrl;
    }

    public WebDriver clickElementsButton(WebDriver driver) {
        driver.findElement(elementsButtonLocator).click();
        return driver;
    }

}