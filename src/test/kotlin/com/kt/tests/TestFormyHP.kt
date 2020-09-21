package com.kt.tests

import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.Assert
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test


class TestFormyHP {
    var driver: WebDriver? = null;

    @BeforeTest
    fun setUp() {
        WebDriverManager.chromedriver().setup()
        driver = ChromeDriver()
    }

    @AfterTest
    fun tearDown() {
        driver!!.quit()
    }

    @Test
    fun openFormyHP(){
        val url = "https://formy-project.herokuapp.com/"
        driver!!.get(url)

        Assert.assertEquals(driver!!.currentUrl, url, "URL of this webpage is incorrect.")
    }
}