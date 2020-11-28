package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case1 {

    @Test
    public void test1 (){
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.quit();
    }
}
