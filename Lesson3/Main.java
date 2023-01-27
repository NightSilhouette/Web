package org.example.Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.livejournal.com/");
        //Вход в аккаунт
        WebElement webElement1 = driver.findElement(By.cssSelector("a.s-header-item__link.s-header-item__link--login"));
        webElement1.click();
        WebElement webElement2 = driver.findElement(By.id("user"));
        webElement2.click();
        webElement2.sendKeys("Sentinight");
        WebElement webElement3 = driver.findElement(By.id("lj_loginwidget_password"));
        webElement3.click();
        webElement3.sendKeys("123Avtotest123");
        WebElement webElement4 = driver.findElement(By.name("action:login"));
        webElement4.click();
        //Проверка кнопки магазин
        WebElement webElement5 = driver.findElement(By.cssSelector("a.s-header-item__link.s-header-item__link--shop"));
        webElement5.click();
        WebElement webElement6 = driver.findElement(By.xpath("//html[@id='js']/body/div[2]/header/div/div/a"));
        webElement6.click();
        //Копирование URLсвоего поста
        WebElement webElement7 = driver.findElement(By.cssSelector("span.s-header-item.s-nav-item__name"));
        webElement7.click();
        WebElement webElement8 = driver.findElement(By.cssSelector("a.b-flatsocial.b-flatsocial-disable-counter.b-flatsocial-copy-url"));
        webElement8.click();
        WebElement webElement61 = driver.findElement(By.cssSelector("a.s-logo-link"));
        webElement61.click();
        // Проверка поиска на главной странице
        WebElement webElement9 = driver.findElement(By.cssSelector("button.s-header-search__btn.s-do-item-search-btn"));
        webElement9.click();
        WebElement webElement10 = driver.findElement(By.cssSelector("input.s-header-search__input.s-inline-search-input"));
        webElement10.click();
        webElement10.sendKeys("тесты");
        webElement9.click();
        webElement6.click();
    }
}
