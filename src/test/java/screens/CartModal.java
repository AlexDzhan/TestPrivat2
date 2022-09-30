package screens;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartModal {

    By checkName = By.xpath("//div[@data-qa-node='receiver-name']");
    By payerAmount = By.xpath("//div[@data-qa-node='payer-amount']");
    By commission = By.xpath("//div[@data-qa-node='payer-currency']");

    private static WebDriver driver;

    public CartModal(WebDriver driver) {
        this.driver = driver;
    }

    public String getTestCardValue() {
        return driver.findElement(checkName).getText();
    }

    public String getPayeramount() {
        return driver.findElement(payerAmount).getText();
    }

    public String getCommission() {
        return driver.findElement(commission).getText();
    }

    public void checkTestCardValue(String testCardValue) {
        Assert.assertEquals(testCardValue, getTestCardValue());
    }

    public void checkPayeramount(String payerAmount) {
        Assert.assertEquals(payerAmount, getPayeramount());
    }

    public void checkCommission(String commission) {
        Assert.assertEquals(commission, getCommission());
    }

    public void checkCartScreen(String testCardValue, String payerAmount, String commission) {
        checkTestCardValue(testCardValue);
        checkPayeramount(payerAmount + "USD");
        checkCommission(commission);

    }
}