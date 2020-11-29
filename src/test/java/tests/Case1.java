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

public class Case1 {

    private static WebDriver driver;
    private static CalculateElements calculateElements;

    @BeforeAll
    public static void init() {
        driver = new ChromeDriver();
        driver.get("http://google.com");
        calculateElements = new CalculateElements(driver);
    }

    @Test
    public void case1() {
        calculateElements.findCalculator.sendKeys("Калькулятор", Keys.ENTER);
        calculateElements.click_bracket1.click();
        calculateElements.click_one.click();
        calculateElements.click_plus.click();
        calculateElements.click_two.click();
        calculateElements.click_bracket2.click();
        calculateElements.click_multiply.click();
        calculateElements.click_three.click();
        calculateElements.click_minus.click();
        calculateElements.click_four.click();
        calculateElements.click_zero.click();
        calculateElements.click_split.click();
        calculateElements.click_five.click();
        calculateElements.click_equally.click();
        assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", calculateElements.comparison1.getText());
        assertEquals("1", calculateElements.comparison2.getText());
    }

    @AfterAll
    public static void teardown(){
        driver.quit();
    }
}
