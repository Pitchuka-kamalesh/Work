package org.ascus.utils;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ascus.reports.ExtentReportManager;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;

public class DriverManager {
    private static final Logger log = LogManager.getLogger(DriverManager.class.getName());
    private static final ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();
    /**
     * Gets the WebDriver instance associated with the current thread.
     * @return The WebDriver instance.
     */
    public static WebDriver getDriver(){
        log.info("DriverManager.getDriver()");
        return threadLocal.get();
    }
    /**
     * Sets the WebDriver instance for the current thread.
     * @param driver The WebDriver instance to set.
     */
    public static void setDriver(WebDriver driver){
        log.info("DriverManager.setDriver()");
        threadLocal.set(driver);
    }
    /**
     * Releases the WebDriver instance associated with the current thread.
     */
    public static void releaseDriver(){
        log.info("DriverManager.releaseDriver()");
        threadLocal.remove();
    }
    /**
     * Closes the WebDriver instance associated with the current thread.
     */
    public static synchronized void closeWebDriver(){
        WebDriver drivers = getDriver();
        if (drivers!=null){
            try{
                ExtentReportManager.logInfoDetails("Quiting the WebDriver");
                drivers.quit();
            }catch (NoSuchSessionException e){
                ExtentReportManager.logStacktrace(Arrays.toString(e.getStackTrace()));
            }
        }
    }

}

