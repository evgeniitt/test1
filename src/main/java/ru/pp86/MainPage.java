package ru.pp86;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractBasePage {
    @FindBy(xpath = "//*[contains(text(),'Войти в кабинет')]")
    private WebElement signInButton;

    @Step("Нажимаем кнопку войти")
    public LoginPage pressSignInButton() {
        signInButton.click();
        return new LoginPage();
    }
}
