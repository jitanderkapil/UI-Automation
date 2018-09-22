import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingGenericSeleniumCommands {

    public static void main(String args[]){

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");

        WebElement textbox = driver.findElement(By.name("q"));
        textbox.sendKeys("selenium commands");
        WebElement button = driver.findElement(By.name("btnG"));
        button.click();

        driver.quit();
    }
}