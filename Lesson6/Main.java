package org.example.Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;



public class Main extends AbstractPage {

    // поиск
    @FindBy(css = "button.s-header-search__btn.s-do-item-search-btn")
    private WebElement pouck;
    @FindBy(css = "input.s-header-search__input.s-inline-search-input")
    private WebElement pole;
    //вход
    @FindBy(css = "a.s-header-item__link.s-header-item__link--login")
    private WebElement vhod;
    @FindBy(id = "user")
    private WebElement user;
    @FindBy(id = "lj_loginwidget_password")
    private WebElement password;
    @FindBy(name = "action:login")
    private WebElement vhod2;
    //магазин
    @FindBy(css = "a.s-header-item__link.s-header-item__link--shop")
    private WebElement magaz;
    @FindBy(css = "span.s-header-item.s-nav-item__name")
    //копирование
    private WebElement profil;
    @FindBy(css = "a.b-flatsocial.b-flatsocial-disable-counter.b-flatsocial-copy-url")
    private WebElement sulka;
    @FindBy(css = "a.s-header-item__link.s-header-item__link--lang")

    //язык
    private WebElement lang;
    @FindBy(xpath = "//a[contains(text(),'English (en)')]")
    private WebElement eng;


    //поиск
    public Main clickpouck() {
        pouck.click();
        return this;
    }
    public Main vod(String value) {
        pole.click();
       pole.sendKeys(value);
        return this;
    }


    //Язык
    public Main navestislang() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(lang).build().perform();
        return this;
    }
    public Main clicklang(){
        eng.click();
        return this;
    }


    //Вход
    public Main clickvhod(){
        vhod.click();
        return this;
    }
    public Main userpole(String value){
        user.click();
        user.sendKeys(value);
        return this;
    }
public Main passwordpole (String value){
        password.click();
        password.sendKeys(value);
        return this;
}
public Main clockvhod2(){
        vhod2.click();
        return this;

        //Проверка магазина
}
public Main clickmagaz(){
        magaz.click();
        return this;
}
    // Проверка копирование поста
    public Main post (){
        profil.click();
        sulka.click();
        return this;
    }

    public Main(WebDriver driver) {
        super(driver);
    }
}