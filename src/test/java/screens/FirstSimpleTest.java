package screens;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import screens.CartModal;
public class FirstSimpleTest {
     By fromCard = By.xpath("//input[@data-qa-node='numberdebitSource']");
     By expiredDate  = By.xpath("//input[@data-qa-node='expiredebitSource']");
     By cvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
     By firstName = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
     By lastName = By.xpath("//input[@data-qa-node='lastNamedebitSource']");
     By toCard = By.xpath("//input[@data-qa-node='numberreceiver']");
     By secondName = By.xpath("//input[@data-qa-node='firstNamereceiver']");
     By secondLastName = By.xpath("//input[@data-qa-node='lastNamereceiver']");
     By amount = By.xpath("//input[@data-qa-node='amount']");
     By span =By.xpath("//span[@class='sc-hwwEjo eMhkcK']");
     By value = By.xpath("//button [@data-qa-value ='USD']");
     By submitButton = By.xpath("//button[@type='submit']");


     By payerAmount = By.xpath("//div[@data-qa-node='payer-amount']");
     By commission = By.xpath("//div[@data-qa-node='payer-currency']");
     By checkName = By.xpath("//div[@data-qa-node='receiver-name']");


     String FromCard = "4444333322221111";
     String ExpiredDate = "1224";
     String cvvNumber = "123";
     String FirstName = "TARAS";
     String LastName = "SHEVCHENKO";
     String ToCard = "4111 1111 1111 1111";
     String SecondName = "IVAN";
     String SecondLastName = "FRANKO";
     String Amount = "10";
     String sum = "10 USD";
     String Comiss = "3.15 USD";
     String CheckName = "IVAN FRANKO";


     private WebDriver driver;

     @Before
     public void setUp() {
          System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
          driver = new ChromeDriver();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          driver.manage().window().maximize();
          driver.get("https://next.privat24.ua/money-transfer/card");

     }
     @After
     public void tearDown() {
     driver.quit();
     }

     @Test
     public void checkTransferSum() throws InterruptedException {
          driver.findElement(fromCard).sendKeys(FromCard);
          driver.findElement(expiredDate).sendKeys(ExpiredDate);
          driver.findElement(cvv).sendKeys(cvvNumber);
          driver.findElement(firstName).sendKeys(FirstName);
          driver.findElement(lastName).sendKeys(LastName);
          driver.findElement(toCard).sendKeys(ToCard);
          driver.findElement(secondName).sendKeys(SecondName);
          driver.findElement(secondLastName).sendKeys(SecondLastName);
          driver.findElement(amount).sendKeys(Amount);
          driver.findElement(span).click();
          driver.findElement(value).click();
          driver.findElement(submitButton).submit();


          Thread.sleep(5000);
          Assert.assertEquals(CheckName, driver.findElement(checkName).getText());
          Assert.assertEquals(sum, driver.findElement(payerAmount).getText());
          Assert.assertEquals(Comiss, driver.findElement(commission).getText());


     }
}
