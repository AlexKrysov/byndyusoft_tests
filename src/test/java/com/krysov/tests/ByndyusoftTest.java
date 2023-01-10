package com.krysov.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class ByndyusoftTest extends com.krysov.tests.TestBase {

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
    }
    @Test
    void checkReview1(){
        step("Открываем главную страницу", () -> {
            open("https://byndyusoft.com/");
        });
        step("Кликаем на Клиенты", () -> {
            $(".header__nav-ls").$(new ByText("Клиенты")).click();
        });
        step("Проверяем наличие отзыва от Дениса Болигара", () -> {
            $(".reviews__signature", 1).shouldHave(text("Денис Болигар"));
        });
    }
    @Test
    void checkReview2(){
        step("Открываем главную страницу", () -> {
            open("https://byndyusoft.com/");
        });
        step("Кликаем на Клиенты", () -> {
            $(".header__nav-ls").$(new ByText("Клиенты")).click();
        });
        step("Проверяем наличие отзыва от Александра Круглова", () -> {
            $(".reviews__signature", 2).shouldHave(text("Александр Круглов"));
        });
    }
}
