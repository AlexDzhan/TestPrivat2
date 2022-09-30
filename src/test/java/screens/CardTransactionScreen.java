package screens;

import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CardTransactionScreen {

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

    String PrivatUrl = "https://next.privat24.ua/money-transfer/card";



    private static WebDriver driver;

    public void navigate(){
        driver.get(PrivatUrl);
    }
    public CardTransactionScreen (WebDriver driver){
        this.driver = driver;
    }

    public void fillFromCard  (String fromCard) {
    driver.findElement(this.fromCard).sendKeys(fromCard);
    }

    public void fillExpiredDate ( String expiredDate) {
        driver.findElement(this.expiredDate).sendKeys(expiredDate);

    }
    public void fillCvv (String cvv) {
        driver.findElement(this.cvv).sendKeys(cvv);

    }
    public void fillFirstName (String firstName) {
        driver.findElement(this.firstName).sendKeys(firstName);
    }
    public void fillLastName (String lastName) {
        driver.findElement(this.lastName).sendKeys(lastName);
    }
    public void fillToCard(String toCard){
    driver.findElement(this.toCard).sendKeys(toCard);
    }
    public void fillSecondName(String secondName) {
    driver.findElement(this.secondName).sendKeys(secondName);
    }
    public void fillSecondLastName(String secondLastName) {
        driver.findElement(this.secondLastName).sendKeys(secondLastName);
    }
    public void fillAmount(String amount) {
        driver.findElement(this.amount).sendKeys(amount);
    }
    public void  fillSpanClick () {
        driver.findElement(span).click();
    }
    public void fillValueClick () {
        driver.findElement(value).click();
    }
    public void fillSubmitButtonClick (){
        driver.findElement(submitButton).submit();
    }

   public void fillForm (String  FromCard , String ExpiredDate , String  Cvv ,
   String FirstName , String LastName , String ToCard , String SecondName , String SecondLastName ,
   String Amount) throws InterruptedException {
        fillFromCard(FromCard);
        fillExpiredDate(ExpiredDate);
        fillCvv(Cvv);
        fillFirstName(FirstName);
        fillLastName(LastName);
        fillToCard(ToCard);
        fillSecondName(SecondName);
        fillSecondLastName(SecondLastName);
        fillAmount(Amount);
        fillSpanClick();
        fillValueClick();
        fillSubmitButtonClick();

        Thread.sleep(5000);
        
   }
}


