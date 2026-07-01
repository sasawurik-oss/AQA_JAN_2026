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

    @BeforeSuite
    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void myPhoneTest() {
        driver.get("https://allo.ua");
        WebElement element = driver.findElement(By.name("search"));
        element.sendKeys("Apple iPhone 17 Pro Max");
        element.sendKeys(Keys.ENTER);

        List<WebElement> prices = driver.findElements(By.cssSelector("v-pb_cur discount"));

        element.sendKeys(Keys.ENTER);
        Assert.assertTrue(prices.size() >= 3);

        // Проверяем, что первые три цены не пустые
        Assert.assertNotNull(prices.get(0).getText());
        Assert.assertNotNull(prices.get(1).getText());
        Assert.assertNotNull(prices.get(2).getText());

        // Выводим цены в консоль
        System.out.println("1: " + prices.get(0).getText());
        System.out.println("2: " + prices.get(1).getText());
        System.out.println("3: " + prices.get(2).getText());


        System.out.println("It is ok!");
    }
}




