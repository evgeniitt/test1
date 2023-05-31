package ru.pp86;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import io.qameta.allure.Epic;
import org.testng.annotations.*;
import utils.WebDriverManager;

@Epic(value = "Тестируем ввод данных")
public class CheckErrorMessageAppearanceTest {

    @BeforeMethod
    public void logIn() {
        new MainPage()
                .pressSignInButton()
                .enterUserName("71450643575")
                .enterPassword("123")
                .pressLogIn()
                .clickOnPersonalMenu()
                .clickOnPersonalCabButton()
                .pressOtherButton();
    }

    @Link(name = "pp86", url = "https://pp86.hostco.ru/")
    @Owner(value = "Evgenii Tatarkin")
    @Description("Переходим на сайт, заходим в нужный раздел с элементами, открываем таблицу для ввода данных, вводим некорректные данные, проверяем наличие сообщения с ошибкой")
    @Feature(value = "Проверяем наличие сообщения с ошибкой")
    @Story(value = "В окно для ввода данных с давлением вводим некорректныеьмт  данные и ожидаем появление сообщения об ошибочных данных ")
    @Test(description = "Проверяем наличие сообщения с ошибкой")
    public void checkErrorMessageAppearance() {
        new HealthChecksPage()
                .openChecksButton()
                .enterHighPressure(50)
                .enterLowPressure(100)
                .checkErrorMessage();
    }

    @AfterMethod
    public void tearDown(){
        WebDriverManager.close();
    }
}
