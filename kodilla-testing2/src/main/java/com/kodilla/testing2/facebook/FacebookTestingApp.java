package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_SELECT_DAY = "//span[contains(@class, \"_5k_4\")]/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//span[contains(@class, \"_5k_4\")]/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//span[contains(@class, \"_5k_4\")]/span/select[3]";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement cookieButton = driver.findElement(By.id("u_0_h"));
        cookieButton.click();

        WebElement registerButton = driver.findElement(By.id("u_0_2"));
        registerButton.click();

        WebElement day = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        WebElement month = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        WebElement year = driver.findElement(By.xpath(XPATH_SELECT_YEAR));

        Select selectDay = new Select(day);
        Select selectMonth = new Select(month);
        Select selectYear = new Select(year);

        selectDay.selectByVisibleText("23");
        selectMonth.selectByVisibleText("3");
        selectYear.selectByVisibleText("1960");
    }
}
