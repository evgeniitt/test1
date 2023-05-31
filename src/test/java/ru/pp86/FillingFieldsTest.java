package ru.pp86;

import io.qameta.allure.*;
import org.testng.annotations.*;
import utils.WebDriverManager;

@Epic(value = "Тестируем ввод данных")
public class FillingFieldsTest {

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
    @Description("Переходим на сайт, заходим в нужный раздел с элементами, открываем таблицу для ввода данных, вводим данные, сохраняем")
    @Feature(value = "Вводим данные")
    @Story(value = "Вводим данные о температуре, весе, давлении и сохраняем ")
    @Test(description = "Вводим данные")
    public void checkHealthCardFilling() {
        new HealthChecksPage()
                .openChecksButton()
                .enterTemp(36.6)
                .enterWeight(75.8)
                .enterHighPressure(100)
                .enterLowPressure(80)
                .pressSaveButton();
    }

    @AfterMethod
    public void tearDown() {
        WebDriverManager.close();
    }
}
