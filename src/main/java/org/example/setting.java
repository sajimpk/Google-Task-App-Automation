package org.example;

import io.appium.java_client.remote.options.BaseOptions;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class setting {

    private AndroidDriver driver;


    @Before
    public <MobileElement> void main() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "pixel"); // Change to your emulator/device
        caps.setCapability("app", "C:\\Users\\MDS\\Downloads\\Google_Tasks.apk");

        // Initialize AndroidDriver
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);

        // Perform some actions
        System.out.println("App launched successfully!");
    }
    @Test
    public void sampleTest() {
        System.out.println("App sampleTest successfully!");
    }

    @After
    public void tearDown() {
        driver.quit();
        System.out.println("App Closed successfully!");
    }

}
