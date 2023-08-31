package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeleniumActions extends SeleniumBase {
    public SeleniumActions() {
    }

    public void click(By path) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement Click = driver.findElement(path);
        waitUntil(Waits.ELEMENT_TO_BE_CLICKABLE,path);
        //wait.until(ExpectedConditions.elementToBeClickable(path));
        Click.click();
    }

    public void sendKeys(By path, String text) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement SendKey = driver.findElement(path);
        SendKey.sendKeys(text);
    }

    public String getText(By path) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement GetText = driver.findElement(path);
        return GetText.getText();
    }

    public void clear(By path) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement ClearText = driver.findElement(path);
        ClearText.clear();
    }

    public void scroll(int scrollHeight) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, arguments[0])", scrollHeight);
    }

    public void hoverOnElement(By path) {
        Actions actions = new Actions(driver);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement Hover = driver.findElement(path);
        actions.moveToElement(Hover).perform();
    }

    public void waitUntil(Waits waits, By path) {
        switch (waits) {
            case VISIBILITY_OF_ELEMENT:
                wait.until(ExpectedConditions.visibilityOfElementLocated(path));
                break;
            case ELEMENT_TO_BE_CLICKABLE:
                wait.until(ExpectedConditions.elementToBeClickable(path));
                break;
        }
    }

    public enum Waits {
        VISIBILITY_OF_ELEMENT,
        ELEMENT_TO_BE_CLICKABLE
    }


}

