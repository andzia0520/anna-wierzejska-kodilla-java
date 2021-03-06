package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FacebookTestingApp {

    public static final String XPATH_SELECT_DAY = "//*[@id=\"day\"]";
    public static final String XPATH_SELECT_MONTH = "//*[@id=\"month\"]";
    public static final String XPATH_SELECT_YEAR = "//*[@id=\"year\"]";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        assert driver != null;
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");

        WebElement cookieButton = driver.findElement(By.id("u_0_h"));
        cookieButton.click();

        WebElement registerButton = driver.findElement(By.id("u_0_2"));
        registerButton.click();

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));

        Select selectDay = new Select(selectComboDay);
        Select selectMonth = new Select(selectComboMonth);
        Select selectYear = new Select(selectComboYear);

        selectDay.selectByValue("21");
        selectMonth.selectByIndex(3);
        selectYear.selectByValue("1960");
    }
}
