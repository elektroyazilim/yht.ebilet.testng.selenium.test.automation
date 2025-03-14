package gib.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserUtils {

    public static void isRadioSelected(WebElement element)
    {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        Boolean isChecked = (Boolean) js.executeScript("return arguments[0].checked;", element);
        System.out.println("Radio butonu seçili mi? " + isChecked);

        System.out.println(element.isSelected());
    }

    public static WebElement waitForVisibilityOfElement(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static boolean isElementDisplay(WebElement element)
    {
        return element.isDisplayed();
    }
    public static void clickWithJS(WebElement element) {
        // ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }


}
