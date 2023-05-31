package ru.pp86;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractBasePage {

    @FindBy(id = "username")
    private WebElement userNameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "kc-login")
    private WebElement logInButton;

    @Step("Вводим юзернейм")
    public LoginPage enterUserName(String username) {
        userNameField.sendKeys(username);
        return new LoginPage();
    }

    @Step("Вводим пароль")
    public LoginPage enterPassword(String password) {
        passwordField.sendKeys(password);
        return new LoginPage();
    }

    @Step("Нажимаем кнопку вход")
    public PersonalPage pressLogIn() {
        logInButton.click();
        return new PersonalPage();
    }
}
