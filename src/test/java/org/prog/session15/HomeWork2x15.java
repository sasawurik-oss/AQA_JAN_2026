package org.prog.session15;

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

    public void prices(List<WebElement> prices) {
        for (int i = 0; i < 3; i++) {
            String price = prices.get(i).getText();

            Assert.assertFalse(price.isBlank());
            System.out.println((i + 1) + ": " + price);
        }
    }


}
