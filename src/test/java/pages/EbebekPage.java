package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EbebekPage {

    public EbebekPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//input[@aria-label='Ara']")
    public WebElement searchBox;

    @FindBy(xpath = "//img[@class='ins-close-button-c2703']")
    public WebElement bildirim;

    @FindBy(xpath = "//img[@alt='Arılac Ballı İrmikli Kaşık Maması 200g']")
    public WebElement firstFeature;

    @FindBy(xpath = "/html/body/app-root/cx-storefront/main/cx-page-layout/cx-page-slot[3]/eb-product-list/div/section/div/div/div/div[1]/div")
    public WebElement result;

    @FindBy(xpath = "//*[@id='addToCartBtn']")
    public WebElement sepeteEkleButonu;

    @FindBy(id = "btnShowCart")
    public WebElement sepetiGorButonu;

    @FindBy(xpath = "//*[@id='btnGoToShippingAddress']/span")
    public WebElement alısverisiTamamlaButonu;


}
