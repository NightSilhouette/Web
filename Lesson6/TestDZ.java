package org.example.Lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class TestDZ extends AbstractTestDZ {

    //Провера поиска на главной странице
    @Test
    void PouckTest(){
        Main main = new Main(getWebDriver());
        main.clickpouck()
        .vod("Hello")
        .clickpouck();
        Assertions.assertEquals("https://www.livejournal.com/",getWebDriver().getCurrentUrl());
    }
    //Смена языка
    @Test
    void language() {
        Main main = new Main(getWebDriver());
        main.navestislang()
        .clicklang();
        Assertions.assertEquals("https://www.livejournal.com/",getWebDriver().getCurrentUrl());
    }
    //Вход
    @Test
    void Login(){
        Main main = new Main(getWebDriver());
        main.clickvhod()
                .userpole("Sotn1997")
                .passwordpole("123Avtotest123")
                        .clockvhod2();
        Assertions.assertEquals("https://www.livejournal.com/",getWebDriver().getCurrentUrl());
    }
    //Магазин
    @Test
void magazine(){
    Main main = new Main(getWebDriver());
    main.clickvhod()
            .userpole("Sotn1997")
            .passwordpole("123Avtotest123")
            .clockvhod2()
            .clickmagaz();
    Assertions.assertEquals("https://www.livejournal.com/",getWebDriver().getCurrentUrl());
}
//Копирование поста
    @Test
    void copi(){
        Main main = new Main(getWebDriver());
        main.clickvhod()
                .userpole("Sotn1997")
                .passwordpole("123Avtotest123")
                .clockvhod2()
                .post();
        Assertions.assertEquals("https://www.livejournal.com/",getWebDriver().getCurrentUrl());
    }


}
