package stepDefs;

import baseUrl.EbebekBaseUrl;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.EbebekPage;
import utilities.ConfigReader;
import utilities.Driver;


public class StepDefinition extends EbebekBaseUrl {



    EbebekPage ebebekPage = new EbebekPage();
    WebDriver driver;
    @Given("go to web sites {string}")
    public void go_to_web_sites(String string) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("ebebek_url"));
        ebebekPage.bildirim.click();
        Thread.sleep(2000);
    }

    @When("search kasik mamasi and verify")
    public void search_kasik_mamasi_and_verify() {
        ebebekPage.searchBox.sendKeys("kaşık maması" + Keys.ENTER);
        ebebekPage.firstFeature.click();
        Assert.assertTrue(ebebekPage.result.isDisplayed());


    }
    @When("add to cart the feature")
    public void add_to_cart_the_feature() throws InterruptedException {
        Thread.sleep(5000);
        ebebekPage.sepeteEkleButonu.click();
        Thread.sleep(2000);
    }
    @When("click the see the cart")
    public void click_the_see_the_cart() {
        ebebekPage.sepetiGorButonu.click();
    }
    @When("click complete the shopping")
    public void click_complete_the_shopping() throws InterruptedException {
        ebebekPage.alısverisiTamamlaButonu.click();
        Thread.sleep(10000);
    }
    @Then("verify the login page")
    public void verify_the_login_page() {
//        String title = driver.getTitle();

   //     Assert.assertEquals(title, "Giriş Yap");


    }


}
