
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import screens.CardTransactionScreen;
import org.junit.After;
import java.time.Duration;



public class CardTransactionTest {
     private WebDriver driver;
     private CardTransactionScreen cardTransactionScreen;
    String FromCard = "4444 4444 4444 4444";
    String ExpiredDate = "1224";
    String сvvNumber = "123";
    String FirstName = "тарас";
    String LastName = "шевченко";
    String ToCard = "4111 1111 1111 1111";
    String SecondName = "иван";
    String SecondLastName = "франко";
    String Amount = "10";



    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        cardTransactionScreen = new CardTransactionScreen(driver);
        driver.manage().timeouts(). implicitlyWait(Duration.ofSeconds(50));
        driver.manage().window().maximize();

        }

    @After
    public void tearDown() {
    driver.quit();
    }

    @Test
    public void checkTransferSum() throws InterruptedException {
    cardTransactionScreen.fillForm (FromCard, ExpiredDate, сvvNumber, FirstName,
    LastName, ToCard, SecondName, SecondLastName, Amount);

    }
}