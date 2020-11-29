package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class CalculateElements {

    @FindBy(css = "input.gLFyf.gsfi")
    public WebElement findCalculator;

    @FindBy(xpath = "//div[@jsname='j93WEe']")
    public WebElement click_bracket1;

    @FindBy(xpath = "//div[@jsname='N10B9']")
    public WebElement click_one;

    @FindBy(xpath = "//div[@jsname='XSr6wc']")
    public WebElement click_plus;

    @FindBy(xpath = "//div[@jsname='lVjWed']")
    public WebElement click_two;

    @FindBy(xpath = "//div[@jsname='qCp9A']")
    public WebElement click_bracket2;

    @FindBy(xpath = "//div[@jsname='YovRWb']")
    public WebElement click_multiply;

    @FindBy(xpath = "//div[@jsname='KN1kY']")
    public WebElement click_three;

    @FindBy(xpath = "//div[@jsname='pPHzQc']")
    public WebElement click_minus;

    @FindBy(xpath = "//div[@jsname='xAP7E']")
    public WebElement click_four;

    @FindBy(xpath = "//div[@jsname='bkEvMb']")
    public WebElement click_zero;

    @FindBy(xpath = "//div[@jsname='WxTTNd']")
    public WebElement click_split;

    @FindBy(xpath = "//div[@jsname='Ax5wH']")
    public WebElement click_five;

    @FindBy(xpath = "//div[@jsname='Pt8tGc']")
    public WebElement click_equally;

    @FindBy(css = "span.vUGUtc")
    public WebElement comparison1;

    @FindBy(css = "span.qv3Wpe")
    public WebElement comparison2;

    @FindBy(xpath = "//div[@jsname='abcgof']")
    public WebElement click_six;

    public CalculateElements(WebDriver driver) {
        initElements(driver, this);
    }
}
