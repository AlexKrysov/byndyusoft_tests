package com.krysov.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class ByndyusoftTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
    }
    @Test
    void calculatorTest(){
        step("Открываем главную страницу", () -> {
        open("https://byndyusoft.com/");
        });
        step("Кликаем на калькулятор доставки", () -> {
        $(".dropdown-menu__item").hover();
        $(".sub-menu__link", 1).click();
        });
        step("Проверяем наличие кейса на OZON.ru", () -> {
        $(".delivery-calculator").shouldHave(text("Кейс OZON.ru: Как сделать тарификацию доставки прозрачной и управляемой"));
        });
    }
    @Test
    void directorFindTest(){
        step("Открываем главную страницу", () -> {
            open("https://byndyusoft.com/");
        });
        step("Кликаем на Онлайнизатор продаж", () -> {
            $(".dropdown-menu__item").hover();
            $(".sub-menu__link", 0).click();
        });
        step("Кликаем на Переход ритейлера автозапчастей на продуктовую разработку и микросервисы", () -> {
        $(".cs-latest__i-link", 0).click();
        });
        step("Проверяем наличие указания директора фирмы Романа Алябьева", () -> {
            $(".case-study__client-name").shouldHave(text("Роман Алябьев"));
        });
    }
    @Test
    void analyticsTest(){
        step("Открываем главную страницу", () -> {
            open("https://byndyusoft.com/");
        });
        step("Кликаем на Аналитика продукта", () -> {
            $(".dropdown-menu__item").hover();
            $(".sub-menu__link", 3).click();
        });
        step("Проверяем наличие результатов для путевой карты пользователя", () -> {
            $(".product-analysis__step", 1).shouldHave(text("Точки входа, точки выхода и переходы пользователей."));
        });
        sleep(5000);
    }
}
