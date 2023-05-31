package ru.pp86;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.WebDriverManager;

public class HealthChecksPage extends AbstractBasePage {

    @FindBy(xpath = "//*[contains(text(),'Записать показатель')]")
    private WebElement checksButton;

    @FindBy(xpath = "//*[contains(text(),'Температура')]/../following-sibling::div/p-inputmask/input")
    private WebElement temperatureField;

    @FindBy(xpath = "//*[contains(text(),'Вес')]/../following-sibling::div/input")
    private WebElement weightField;

    @FindBy(xpath = "//*[contains(text(),'Давление')]/../following-sibling::div/div/input[1]")
    private WebElement highPressureField;

    @FindBy(xpath = "//*[contains(text(),'Давление')]/../following-sibling::div/div/input[2]")
    private WebElement lowPressureField;

    @FindBy(xpath = "//*[@class='error-text']")
    private WebElement errorPressureMessage;

    @FindBy(xpath = "//*[contains(text(),'Сохранить')]")
    private WebElement saveButton;

    @Step("Проверяем появляется ли ошибка при вводе некорректных значений")
    public HealthChecksPage checkErrorMessage() {
        Assert.assertEquals(errorPressureMessage.getText(), "Верхнее давление должно быть выше нижнего");
        return new HealthChecksPage();
    }

    @Step("Нажимаем кнопку сохранить")
    public HealthChecksPage pressSaveButton() {
        saveButton.click();
        return new HealthChecksPage();
    }

    @Step("Нажимаем на кнопку Записать показатель")
    public HealthChecksPage openChecksButton() {
        checksButton.click();
        return new HealthChecksPage();
    }

    @Step("Вводим вверхнее давление")
    public HealthChecksPage enterHighPressure(int highPressure) {
        highPressureField.sendKeys(String.valueOf(highPressure));
        return new HealthChecksPage();
    }

    @Step("Вводим нижнее давление")
    public HealthChecksPage enterLowPressure(int lowPressure) {
        lowPressureField.sendKeys(String.valueOf(lowPressure));
        return new HealthChecksPage();
    }

    @Step("Вводим температуру")
    public HealthChecksPage enterTemp(double temp) {
        temperatureField.sendKeys(String.valueOf(temp));
        return new HealthChecksPage();
    }

    @Step("Вводим вес")
    public HealthChecksPage enterWeight(double weight) {
        weightField.sendKeys(String.valueOf(weight));
        return new HealthChecksPage();
    }
}
