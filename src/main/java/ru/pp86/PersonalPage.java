package ru.pp86;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalPage extends AbstractBasePage {

    @FindBy(xpath = "//*[@class=\"login-menu ng-star-inserted\"]")
    private WebElement chooseNameMenu;

    @FindBy(xpath = "//*[contains(text(),'Личный кабинет')]")
    private WebElement personalCabButton;

    @Step("Нажимаем на своего пользователя")
    public PersonalPage clickOnPersonalMenu() {
        chooseNameMenu.click();
        return new PersonalPage();
    }

    @Step("Нажимаем кнопку Личный кабинет")
    public PersonalCabPage clickOnPersonalCabButton() {
        personalCabButton.click();
        return new PersonalCabPage();
    }

}
