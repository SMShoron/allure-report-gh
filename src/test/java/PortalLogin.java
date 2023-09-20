import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class PortalLogin {
    @Test
    public void browserSetup(){

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();

        driver.get("https://katalon-demo-cura.herokuapp.com/");

        driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();

        driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.id("btn-login")).click();
    }
}

