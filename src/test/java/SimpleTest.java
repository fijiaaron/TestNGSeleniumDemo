import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleTest
{
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setup()
    {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);
        driver.manage().window().maximize();
    }

    @Test
    public void SimpliLearnTraining()
    {

        driver.get("https://www.simplilearn.com");

        WebElement menuButton = driver.findElement(AllCourses.MenuButton);
        menuButton.click();
        pause(2000);

        driver.get("https://www.simplilearn.com/selenium-certification-training");
        driver.findElement(By.cssSelector("a.login")).click();
        pause(2000);

        driver.findElement(By.linkText("Software Development")).click();

        scrollDown();
        scrollDown();
        scrollDown();
        scrollDown();
        pause(1000);
        scrollUp();
        scrollUp();
        scrollUp();
        scrollUp();

        driver.get("https://accounts.simplilearn.com/user/login");

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='user_login']")))
                .sendKeys("name@example.com");
        driver.findElement(LoginForm.PasswordField).sendKeys("password");
        driver.findElement(LoginForm.LoginButton).click();
        pause(2000);
    }

    @AfterMethod
    public void teardown()
    {
        driver.quit();
    }

    public void hoverOver(By locator)
    {
        WebElement element = driver.findElement(locator);
        new Actions(driver).moveToElement(element).pause(500).perform();
    }

    public void scrollDown()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        pause(500);
    }

    public void scrollUp()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-500)");
        pause(500);
    }

    public static class AllCourses
    {
        public static By MenuButton = By.linkText("All Courses");
        public static By SoftwareDevelopmentLink = By.linkText("Software Development");
        public static By SeleniumTrainingLink = By.linkText("Selenium 3.0 Training");
    }

    public static class LoginForm
    {
        public static By EmailAddressField = By.cssSelector("input[name='user_login']");
        public static By PasswordField = By.cssSelector("[name=user_pwd]");
        public static By LoginButton = By.cssSelector("[name=btn_login]");
    }


    public void pause(long milliseconds)
    {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}