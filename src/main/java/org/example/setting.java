package org.example;

import io.appium.java_client.remote.options.BaseOptions;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class setting {
//    @Test
//    public void sampleTest() {
//
//    }
    AndroidDriver driver;



    public static <MobileElement> void main(String[] args) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "pixel"); // Change to your emulator/device
        caps.setCapability("app", "C:\\Users\\MDS\\Downloads\\Google_Tasks.apk");

        // Initialize AndroidDriver
        AndroidDriver driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723/wd/hub"), caps);

        // Perform some actions
        System.out.println("App launched successfully!");
//        driver.quit();

    }

}
