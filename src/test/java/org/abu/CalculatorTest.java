package org.abu;

import org.abu.framework.Driver;
import org.abu.framework.Hooks;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CalculatorTest extends Hooks {

    @Test
    public void test() {
        var openScreen = Driver.getDriver().findElement(By.id("com.digitalchemy.calculator.freedecimal:id/helpScreen1"));
        openScreen.click();

        var openScreen2 = Driver.getDriver().findElement(By.id("com.digitalchemy.calculator.freedecimal:id/helpScreen2"));
        openScreen2.click();

        var openScreen3 = Driver.getDriver().findElement(By.id("com.digitalchemy.calculator.freedecimal:id/helpScreen3"));
        openScreen3.click();

        var closeBtn = tryFind(By.id("com.digitalchemy.calculator.freedecimal:id/close_button"));
        if (closeBtn != null) closeBtn.click();
    }

    static WebElement tryFind(By by) {
        try {
            return Driver.getDriver().findElement(by);
        } catch (Exception e) {
            return null;
        }
    }
}
