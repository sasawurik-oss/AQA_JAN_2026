package org.prog.session15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Instant;
import java.util.List;

public class HoneWork15 {
    private WebDriver driver;
    private HomeWork2x15 alloPage;


    @BeforeSuite
    public void setUp() {
        driver = new ChromeDriver();
        alloPage = new HomeWork2x15(driver);

    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void myPhoneTest() {
        alloPage.loadPage();
        WebElement element = driver.findElement(By.name("search"));
        element.sendKeys("Apple iPhone 17 Pro Max");
        element.sendKeys(Keys.ENTER);

        List<WebElement> prices = driver.findElements(By.className("sum"));

        Assert.assertTrue(prices.size() >= 3);

        // проверка: первые три цены не пустые
        alloPage.prices(prices);




        System.out.println("It is ok!");
    }
}




