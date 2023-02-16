package org.example.Lesson5;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestDZ extends AbstractTestDZ {
    //авторизация
    @Test
void myActiontest() throws InterruptedException {
    new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://www.livejournal.com/media/"));
    Actions entrance = new Actions(getDriver());
    entrance.click(getDriver().findElement(By.cssSelector("a.s-header-item__link.s-header-item__link--login")))
            .pause(1000l)
            .sendKeys(getDriver().findElement(By.id("user")),"Sotn1997")
            .pause(1000l)
            .sendKeys(getDriver().findElement(By.id("lj_loginwidget_password")),"123Avtotest123")
            .pause(1000l)
            .click(getDriver().findElement(By.name("action:login")))
            .build()
            .perform();

    Thread.sleep(10000);
}
    //Провера поиска на главной странице
    @Test
    void myActiontest1() throws InterruptedException {
    new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://www.livejournal.com/media/"));
        Actions search = new Actions(getDriver());
        search.click(getDriver().findElement(By.cssSelector("button.s-header-search__btn.s-do-item-search-btn")))
                .pause(1000l)
                .sendKeys(getDriver().findElement(By.cssSelector("input.s-header-search__input.s-inline-search-input")),"Тесты")
                .pause(1000l)
                .click(getDriver().findElement(By.cssSelector("button.s-header-search__btn.s-do-item-search-btn")))
                .build()
                .perform();

        Thread.sleep(1000);
    }
    //ПРоверка магазина
    @Test
    void myActiontest2() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://www.livejournal.com/media/"));
        Actions entrance = new Actions(getDriver());
        entrance.click(getDriver().findElement(By.cssSelector("a.s-header-item__link.s-header-item__link--login")))
                .pause(1000l)
                .sendKeys(getDriver().findElement(By.id("user")),"Sotn1997")
                .pause(1000l)
                .sendKeys(getDriver().findElement(By.id("lj_loginwidget_password")),"123Avtotest123")
                .pause(1000l)
                .click(getDriver().findElement(By.name("action:login")))
                .build()
                .perform();
        Thread.sleep(10000);
        Actions mag = new Actions(getDriver());
        mag.click(getDriver().findElement(By.cssSelector("a.s-header-item__link.s-header-item__link--shop")))
                .pause(1000l)
                .build()
                .perform();
    }
    //Копирование Url своего поста
    @Test
    void myActiontest3() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://www.livejournal.com/media/"));
        Actions entrance = new Actions(getDriver());
        entrance.click(getDriver().findElement(By.cssSelector("a.s-header-item__link.s-header-item__link--login")))
                .pause(1000l)
                .sendKeys(getDriver().findElement(By.id("user")),"Sotn1997")
                .pause(1000l)
                .sendKeys(getDriver().findElement(By.id("lj_loginwidget_password")),"123Avtotest123")
                .pause(1000l)
                .click(getDriver().findElement(By.name("action:login")))
                .build()
                .perform();
        Thread.sleep(10000);
        Actions cod = new Actions(getDriver());
        cod.click(getDriver().findElement(By.cssSelector("span.s-header-item.s-nav-item__name")))
                .build()
                .perform();
        Thread.sleep(10000);
        Actions cod1 = new Actions(getDriver());
               cod1.click(getDriver().findElement(By.cssSelector("a.b-flatsocial.b-flatsocial-disable-counter.b-flatsocial-copy-url")))
                .build()
                .perform();
        Thread.sleep(10000);
    }
    //смена языка
    @Test
    void myActiontest4() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://www.livejournal.com/media/"));
        Actions eng = new Actions(getDriver());
        eng.moveToElement(getDriver().findElement(By.cssSelector("a.s-header-item__link.s-header-item__link--lang")))

                .build()
                .perform();
        Thread.sleep(10000);

        Actions english = new Actions(getDriver());
        english.click(getDriver().findElement(By.xpath("//a[contains(text(),'English (en)')]")))
                .build()
                .perform();
        Thread.sleep(10000);
    }
}