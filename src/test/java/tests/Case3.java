package tests;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CalculateElements;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Case3 {

    private static WebDriver driver;
    private static CalculateElements calculateElements;

    @BeforeAll
    public static void init() {
        driver = new ChromeDriver();
        driver.get("http://google.com");
        calculateElements = new CalculateElements(driver);
    }

    @Test
    public void case3() {
        calculateElements.findCalculator.sendKeys("Калькулятор", Keys.ENTER);
        calculateElements.click_sin.click();
        calculateElements.click_equally.click();
        assertEquals("sin() =", calculateElements.comparison3.getText());
        assertEquals("Error", calculateElements.comparison2.getText());
    }

    @AfterAll
    public static void teardown(){
        driver.quit();
    }
}
