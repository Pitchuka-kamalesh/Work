package org.ascus.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ascus.utils.DriverManager;
import org.ascus.utils.TestUtils;
import org.testng.annotations.*;

public class BaseTest {
    private static final Logger log = LogManager.getLogger(BaseTest.class.getName());

    /**
     * Executes before the entire test suite.
     */
    @BeforeSuite
    public synchronized void beforeSuite(){
        log.info("BaseTest.beforeSuit()");
        TestUtils.startBrowser();
    }
    /**
     * Executes before each test method.
     */
    @BeforeTest
    public synchronized void beforeTest(){
        log.info("BaseTest.beforeTest()");
    }
    /**
     * Executes before each test class.
     */
    @BeforeClass
    public synchronized void beforeClass(){
        log.info("BaseTest.beforeClass()");
    }
    /**
     * Executes before each test method.
     */
    @BeforeMethod
    public synchronized void beforeMethod(){
        log.info("BaseTest.beforeMethod");
    }
    /**
     * Executes after each test method.
     */
    @AfterTest
    public synchronized void afterTest(){
        log.info("BaseTest.afterTest()");
        log.info("inside afterTest() method");
    }
    /**
     * Executes after each test method.
     */
    @AfterMethod
    public synchronized void afterMethod(){
        log.info("BaseTest.afterMethod()");
    }
    /**
     * Executes after each test class.
     */
    @AfterClass
    public synchronized void afterClass(){log.info("BaseTest.afterClass()");}
    /**
     * Executes after the entire test suite.
     */
    @AfterSuite
    public synchronized void afterSuite(){
        log.info("BaseTest.afterSuite()");
        DriverManager.releaseDriver();
        DriverManager.closeWebDriver();

    }


}
