package com.cyient.testautomation;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;
public class WebAppTest {
public static void main(String args[]) throws MalformedURLException 
   {
	
	//Android OS Platform
	//Browser -->Chrome
	//Device Name-> Samsung
	DesiredCapabilities cap= new DesiredCapabilities();
	cap.setCapability("platform","Android");
	cap.setCapability("deviceName","Samsung");
	cap.setCapability("browserName","Chrome");
	cap.setCapability("chromedriverExcutable","D:\\ChromeDriver\\chromedriver.exe");
	//set the desiredcapabilities into appium server
    AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
    //hub--->remote address
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.get("https://magento.com/");
    driver.findElementByXPath("//span[@text()='Sign in']"); 
    driver.findElementByXPath("//input[@id()='email']").sendKeys("agrawal.ayu3009@gmail.com");
    // Log Out after waiting for sometime
   }
     }
