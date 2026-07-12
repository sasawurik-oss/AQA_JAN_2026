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

import java.sql.SQLException;
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
    public void myPhoneTest() throws SQLException {
        DataBaseForPhone db = new DataBaseForPhone();


        alloPage.loadPage();
        alloPage.searchPhone("Apple iPhone 17 Pro Max");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<WebElement> prices = alloPage.getPrices();
        List<WebElement> models = alloPage.getModel();


        Assert.assertTrue(models.size() >= 3);


        for (int i = 0; i < 3; i++) {

            String model = models.get(i).getText();
            String priceText = prices.get(i).getText();

            Assert.assertFalse(priceText.isBlank());
            Assert.assertFalse(model.isBlank());

            int sitePrice = Integer.parseInt(priceText.replaceAll("[^0-9]", ""));

            System.out.println((i + 1) + ": " + model + "  " + sitePrice);

            Integer dbPrice = db.priceForDb(model);

            if (dbPrice == null) {

                db.addPhone(model, sitePrice);


            } else {

                Assert.assertEquals(sitePrice, dbPrice.intValue());

            }
        }



        System.out.println("It is ok!");
    }
}




