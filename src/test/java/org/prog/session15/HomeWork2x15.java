package org.prog.session15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomeWork2x15 {

    private final WebDriver driver;


    private final static String BASE_URL = "https://allo.ua";

    public HomeWork2x15(WebDriver driver) {
        this.driver = driver;
    }

    public void loadPage() {
        driver.get(BASE_URL);
    }

    public void searchPhone(String phoneName) {
        WebElement search = driver.findElement(By.name("search"));
        search.sendKeys(phoneName);
        search.sendKeys(Keys.ENTER);

    }

    public List<WebElement> getPrices() {
        return driver.findElements(By.className("sum"));
    }


}
