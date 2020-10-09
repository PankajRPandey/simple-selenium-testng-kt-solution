package com.kt.tests

import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.Assert
import org.testng.annotations.AfterClass
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test


class TestOpenCartLandingPage {
    var driver: WebDriver? = null
    val url = "http://opencart.abstracta.us/"

    @BeforeTest
    fun setUp() {
        WebDriverManager.chromedriver().setup()
        when(driver){
            null -> driver = ChromeDriver()
            else -> print("Driver is not null. Using same driver instance.")
        }
    }

    @AfterClass
    fun tearDown() {
        driver!!.quit()
    }

    @Test
    fun verifyOpenCartLandingPageURL(){
        driver!!.get(url)
        Assert.assertEquals(driver!!.currentUrl+"e", url, "URL of this webpage is incorrect.")
    }

    @Test
    fun verifyOpenCartLandingPageTitle(){
        driver!!.get(url)
        val title = "Your Stor"
        Assert.assertEquals(driver!!.title, title, "Title of this webpage is incorrect.")
    }
}