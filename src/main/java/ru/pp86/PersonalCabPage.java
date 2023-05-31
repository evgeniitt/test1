package ru.pp86;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalCabPage extends AbstractBasePage {

    @FindBy(xpath = "//*[@routerlink=\"card\"]")
    private WebElement otherButton;

    @Step("Нажимаем кнопку Разное")
    public void pressOtherButton() {
        otherButton.click();
    }
}
