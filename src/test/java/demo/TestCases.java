package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
// import io.github.bonigarcia.wdm.WebDriverManager;
import demo.wrappers.Wrappers;


public class TestCases {
    ChromeDriver driver;
    /*
     * TODO: Write your tests here with testng @Test annotation. 
     * Follow `testCase01` `testCase02`... format or what is provided in instructions
     */
    @Test
    public void testCase01() throws InterruptedException {
        System.out.println("Start test case 01");
       driver.get("https://docs.google.com/forms/d/e/1FAIpQLSep9LTMntH5YqIXa5nkiPKSs283kdwitBBhXWyZdAS-e4CxBQ/viewform");
      // Thread.sleep(5000);
      //Wrappers wait = new Wrappers(driver, 30);
      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
      wait.until(ExpectedConditions.urlContains("forms"));

       WebElement namefield = driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[1]"));
       namefield.click();
       namefield.sendKeys("Crio Learner");

       WebElement reason = driver.findElement(By.xpath("//textarea[@jsname='YPqjbf']"));
       reason.click();
       long epoch = System.currentTimeMillis();
       //String Reason = "I want to be the best QA Engineer!";
       reason.sendKeys("I want to be the best QA Engineer!"+epoch);

       WebElement radiobutton = driver.findElement(By.xpath("//div[@id='i13']"));
       radiobutton.click();

       Thread.sleep(2000);

       WebElement java =driver.findElement(By.xpath("//div[@id='i30']"));
       java.click();
       Thread.sleep(2000);

       WebElement selnium = driver.findElement(By.xpath("//div[@id='i33']"));
       selnium.click();
       Thread.sleep(2000);
       WebElement testng = driver.findElement(By.xpath("//div[@id='i39']")); 
       testng.click();
       Thread.sleep(2000);
       WebElement dropdown1 = driver.findElement(By.xpath("(//div[@class='e2CuFe eU809d'])[1]"));
       dropdown1.click();
       Thread.sleep(1000);
       WebElement mr = driver.findElement(By.xpath("(//span[text()='Mr'])[2]"));
       mr.click();
       Thread.sleep(1000);

       WebElement date = driver.findElement(By.xpath("//input[@aria-labelledby='i50']"));
       date.sendKeys("06/30/2024");
       Thread.sleep(1000);


       WebElement hour = driver.findElement(By.xpath("//input[@aria-label='Hour']"));
       hour.sendKeys("07");
       Thread.sleep(1000);
       WebElement min = driver.findElement(By.xpath("//input[@aria-label='Minute']"));
       min.sendKeys("30");
       Thread.sleep(1000);

       WebElement submit = driver.findElement(By.xpath("//span[contains(text(),'Submit')]"));
       submit.click();
       Thread.sleep(3000);
        //   Wrappers wait = new Wrappers(driver, 30);
    //   wait.until(ExpectedConditions.presenceOfElementLocated)

    WebElement submitresponse = driver.findElement(By.xpath("//div[contains(text(),'Thanks for your response, Automation Wizard!')]"));
    String text = submitresponse.getText();
    System.out.println(text);
    System.out.println("end test case 01");





            // // Open the Google Form
            // driver.get("https://docs.google.com/forms/d/e/1FAIpQLSep9LTMntH5YqIXa5nkiPKSs283kdwitBBhXWyZdAS-e4CxBQ/viewform");

            // // Fill in the first text box
            // WebElement firstTextBox = driver.findElement(By.xpath("//div[@class='Xb9hP']//div"));
            // firstTextBox.sendKeys("Crio Learner");

            // // Write down "I want to be the best QA Engineer! [current epoch time]"
            // long epochTime = System.currentTimeMillis() / 1000;
            // WebElement messageBox = driver.findElement(By.xpath("//textarea[@class='KHxj8b tL9Q4c']"));
            // messageBox.sendKeys("I want to be the best QA Engineer! " + epochTime);

            // // Enter your Automation Testing experience in the next radio button
            // WebElement experienceRadioButton = driver.findElement(By.xpath("//div[@id='i13']"));
            // experienceRadioButton.click();

            // // Select Java, Selenium, and TestNG from the next check-box
            // WebElement javaCheckbox = driver.findElement(By.xpath("//div[@id='i30']"));
            // WebElement seleniumCheckbox = driver.findElement(By.xpath("//div[@id='i33']"));
            // WebElement testngCheckbox = driver.findElement(By.xpath("//div[@id='i39']"));
            // javaCheckbox.click();
            // seleniumCheckbox.click();
            // testngCheckbox.click();

            // // Provide how you would like to be addressed in the next dropdown
            // Select addressDropdown = new Select(driver.findElement(By.xpath("//div[@aria-labelledby='i42']")));
            // addressDropdown.selectByVisibleText("Mr");

            // // Provide the current date minus 7 days in the next date field
            // LocalDate date = LocalDate.now().minusDays(7);
            // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            // WebElement dateField = driver.findElement(By.xpath("//input[@type='date']"));
            // dateField.sendKeys(date.format(formatter));

            // // Provide the time 07:30 in the next field
            // WebElement hourField = driver.findElement(By.xpath("//input[@aria-label='Hour']"));
            // hourField.sendKeys("07");

            // WebElement minField = driver.findElement(By.xpath("//input[@aria-label='Minute']"));
            // minField.sendKeys("30");

            // // Submit the form
            // WebElement submitButton = driver.findElement(By.xpath("///span[text()='Submit']"));
            // submitButton.click();

            // // Print the success message
            // WebElement successMessage = driver.findElement(By.xpath("/div[text()='Thanks for your response, Automation Wizard!']"));
            // System.out.println(successMessage.getText());
        }
    /*
     * Do not change the provided methods unless necessary, they will help in automation and assessment
     */
    @BeforeTest
    public void startBrowser()
    {
        System.setProperty("java.util.logging.config.file", "logging.properties");

        // NOT NEEDED FOR SELENIUM MANAGER
        // WebDriverManager.chromedriver().timeout(30).setup();

        ChromeOptions options = new ChromeOptions();
        LoggingPreferences logs = new LoggingPreferences();

        logs.enable(LogType.BROWSER, Level.ALL);
        logs.enable(LogType.DRIVER, Level.ALL);
        options.setCapability("goog:loggingPrefs", logs);
        options.addArguments("--remote-allow-origins=*");

        System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "build/chromedriver.log"); 

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
    }

    @AfterTest
    public void endTest()
    {
        driver.close();
        driver.quit();

    }
}