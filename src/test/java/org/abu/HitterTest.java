package org.abu;

import org.abu.framework.Driver;
import org.abu.framework.Hooks;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class HitterTest extends Hooks {

    @Test
    public void test() {
        var letsGoBtn = Driver.getDriver().findElement(By.className("android.widget.Button"));
        letsGoBtn.click();
        sleep(2);

        var phoneNumberInputLine = Driver.getDriver().findElement(By.className("android.widget.EditText"));
        var signInBtn = Driver.getDriver().findElement(By.xpath("//android.widget.Button"));

        phoneNumberInputLine.sendKeys("7088109668");
        signInBtn.click();
        sleep(2);

        var smsCodeInputLine = Driver.getDriver().findElement(By.className("android.widget.EditText"));
        smsCodeInputLine.sendKeys("0000");
        sleep(2);

        var turnOnNotificationsBtn = Driver.getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"ВКЛЮЧИТЬ УВЕДОМЛЕНИЯ\"]"));
        turnOnNotificationsBtn.click();
        sleep(1);

        var givePermissionBtn = Driver.getDriver().findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
        givePermissionBtn.click();
        sleep(1);

        var profileIcon = Driver.getDriver().findElement(By.xpath("//x1.q1/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.Button"));
        profileIcon.click();
        sleep(2);

        var signOutBtn = Driver.getDriver().findElement(By.xpath("//x1.q1/android.view.View/android.view.View/android.view.View/android.widget.Button[2]"));
        signOutBtn.click();
        sleep(1);

        var yesBtn = Driver.getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"ВЫЙТИ\"]"));
        yesBtn.click();
        sleep(5);
    }

    public static void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
