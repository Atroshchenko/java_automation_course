/*package ru.stqa.pft.addressbook;// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;
public class OpenchartfirsttestTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void openchartfirsttest() {
    driver.get("https://demo.opencart.com/");
    driver.manage().window().setSize(new Dimension(1721, 1033));
    driver.findElement(By.cssSelector(".show > .d-none")).click();
    driver.findElement(By.linkText("PC (0)")).click();
    driver.findElement(By.linkText("Laptops & Notebooks (5)")).click();
    driver.findElement(By.linkText("HP LP3065")).click();
    driver.findElement(By.id("button-cart")).click();
    {
      WebElement element = driver.findElement(By.id("button-cart"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.id("button-cart"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".show > .d-none")).click();
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.linkText("Continue")).click();
    driver.findElement(By.id("input-firstname")).click();
    driver.findElement(By.id("input-firstname")).sendKeys("Victor");
    driver.findElement(By.id("input-lastname")).click();
    driver.findElement(By.id("input-lastname")).sendKeys("Atroshchenko");
    driver.findElement(By.id("input-email")).click();
    driver.findElement(By.id("input-email")).sendKeys("victor.atroshchenko@gmail.com");
    driver.findElement(By.cssSelector("main")).click();
    driver.findElement(By.id("input-password")).click();
    driver.findElement(By.id("input-password")).sendKeys("password");
    driver.findElement(By.name("agree")).click();
    driver.findElement(By.cssSelector(".btn-primary")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".btn-primary"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.linkText("Continue")).click();
  }
}*/
package ru.stqa.pft.addressbook;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class OpenchartfirsttestTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  private JavascriptExecutor js;

  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<>();
  }

  @After
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void openchartfirsttest() {
    driver.get("https://demo.opencart.com/");
    driver.manage().window().setSize(new Dimension(1721, 1033));

    navigateToProduct();
    addToCart();
    registerNewAccount("Victor", "Atroshchenko", "victor.atroshchenko@gmail.com", "password");
  }

  private void navigateToProduct() {
    clickElement(By.cssSelector(".show > .d-none"));
    clickElement(By.linkText("PC (0)"));
    clickElement(By.linkText("Laptops & Notebooks (5)"));
    clickElement(By.linkText("HP LP3065"));
  }

  private void addToCart() {
    clickElement(By.id("button-cart"));
  }

  private void registerNewAccount(String firstName, String lastName, String email, String password) {
    clickElement(By.cssSelector(".show > .d-none"));
    clickElement(By.linkText("Login"));
    clickElement(By.linkText("Continue"));

    enterText(By.id("input-firstname"), firstName);
    enterText(By.id("input-lastname"), lastName);
    enterText(By.id("input-email"), email);
    enterText(By.id("input-password"), password);

    clickElement(By.name("agree"));
    clickElement(By.cssSelector(".btn-primary"));
    clickElement(By.linkText("Continue"));
  }

  private void clickElement(By locator) {
    driver.findElement(locator).click();
  }

  private void enterText(By locator, String text) {
    WebElement element = driver.findElement(locator);
    element.click();
    element.sendKeys(text);
  }
}
