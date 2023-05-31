package ru.pp86;

import utils.WebDriverManager;

import static org.openqa.selenium.support.PageFactory.initElements;

public abstract class AbstractBasePage {

    public AbstractBasePage() {
        initElements(WebDriverManager.getWd(), this);
    }
}
