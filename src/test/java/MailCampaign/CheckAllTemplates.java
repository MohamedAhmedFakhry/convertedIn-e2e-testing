package MailCampaign;

import Utils.MailLocators;
import Utils.SeleniumActions;
import Utils.SeleniumBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.CreateMailCampaigns;
import pom.Homepage;
import pom.SignInPage;

public class CheckAllTemplates {
    SignInPage signInPage = new SignInPage();

    @BeforeTest
    public void init() {
        SeleniumBase seleniumBase = new SeleniumBase();
        //seleniumBase.seleniumConfig("https://app-stg.converted.in/login");
    }

    @Test
    public void openRedmos() {
        Homepage home = new Homepage();
        signInPage.loginPage("mckenzie.lincoln@yahoo.com", "password");
        home.EmailCampaign();
    }

    @Test(dependsOnMethods = "openRedmos")
    public void selectBackToSchoolTemplate() {
        SeleniumActions actions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        CreateMailCampaigns oneTime = new CreateMailCampaigns();
        oneTime.selectCampaignType();
        oneTime.oneTimeCampaign(locators.hoverOnBackToSchool, locators.selectBackToSchool);
        Assert.assertEquals(actions.getText(locators.assertBackToSchool), "Shopping Season Back To School");
        actions.click(locators.backButton);
    }

    @Test(dependsOnMethods = "selectBackToSchoolTemplate")
    public void selectBackInStockTemplate()  {
        SeleniumActions actions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        CreateMailCampaigns oneTime = new CreateMailCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnBackInStock, locators.selectBackInStock);
        Assert.assertEquals(actions.getText(locators.assertBackInStock), "Back In Stock");
        actions.click(locators.backButton);

    }

    @Test(dependsOnMethods = "selectBackInStockTemplate")
    public void selectDiscountOnSelectedItemsTemplate()  {
        SeleniumActions actions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        CreateMailCampaigns oneTime = new CreateMailCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnDiscountOffer, locators.selectDiscountOffer);
        Assert.assertEquals(actions.getText(locators.assertDiscountOffer), "Discount On Selected Items");
        actions.click(locators.backButton);

    }

    @Test(dependsOnMethods = "selectDiscountOnSelectedItemsTemplate")
    public void selectShoppingSeasonSummerSaleTemplate()  {
        SeleniumActions actions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        CreateMailCampaigns oneTime = new CreateMailCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnShoppingSeasonSummer, locators.selectShoppingSeasonSummer);
        Assert.assertEquals(actions.getText(locators.assertShoppingSeasonSummer), "Shopping Season Summer Sale");
        actions.click(locators.backButton);

    }

    @Test(dependsOnMethods = "selectShoppingSeasonSummerSaleTemplate")
    public void select24HrsFlashSaleTemplate()  {
        SeleniumActions actions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        CreateMailCampaigns oneTime = new CreateMailCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOn24FlashSale, locators.select24FlashSale);
        Assert.assertEquals(actions.getText(locators.assert24FlashSale), "24 Hrs Flash Sale");
        actions.click(locators.backButton);

    }

    @Test(dependsOnMethods = "select24HrsFlashSaleTemplate")
    public void select24HrsFlashSale2Template()  {
        SeleniumActions actions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        CreateMailCampaigns oneTime = new CreateMailCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOn24FlashSale2, locators.select24FlashSale2);
        Assert.assertEquals(actions.getText(locators.assert24FlashSale2), "24 Hrs FLASH SALE");
        actions.click(locators.backButton);

    }

    @Test(dependsOnMethods = "select24HrsFlashSale2Template")
    public void selectLaborDayTemplate()  {
        SeleniumActions actions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        CreateMailCampaigns oneTime = new CreateMailCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnLaborDay, locators.selectLaborDay);
        Assert.assertEquals(actions.getText(locators.assertLaborDay), "Labor Day");
        actions.click(locators.backButton);

    }

    @Test(dependsOnMethods = "selectLaborDayTemplate")
    public void selectEbookReleasedTemplate()  {
        SeleniumActions actions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        CreateMailCampaigns oneTime = new CreateMailCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnEbookReleased, locators.selectEbookReleased);
        Assert.assertEquals(actions.getText(locators.assertEbookReleased), "New Ebook Released");
        actions.click(locators.backButton);

    }

    @Test(dependsOnMethods = "selectEbookReleasedTemplate")
    public void selectSummerSaleTemplate()  {
        SeleniumActions actions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        CreateMailCampaigns oneTime = new CreateMailCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnSummerSale, locators.selectSummerSale);
        Assert.assertEquals(actions.getText(locators.assertSummerSale), "Summer Sale");
        actions.click(locators.backButton);

    }

    @Test(dependsOnMethods = "selectSummerSaleTemplate")
    public void selectWomenDayTemplate()  {
        SeleniumActions actions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        CreateMailCampaigns oneTime = new CreateMailCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnWomenDay, locators.selectWomenDay);
        Assert.assertEquals(actions.getText(locators.assertWomenDay), "Women'S Day");
        actions.click(locators.backButton);

    }

    @Test(dependsOnMethods = "selectWomenDayTemplate")
    public void selectHelloBlackFridayTemplate()  {
        SeleniumActions actions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        CreateMailCampaigns oneTime = new CreateMailCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnBlackFriday, locators.selectBlackFriday);
        Assert.assertEquals(actions.getText(locators.assertBlackFriday), "Hello Black Friday");
        actions.click(locators.backButton);

    }

    @Test(dependsOnMethods = "selectHelloBlackFridayTemplate")
    public void selectDiscountEmailTemplate()  {
        SeleniumActions actions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        CreateMailCampaigns oneTime = new CreateMailCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnDiscountEmail, locators.selectDiscountEmail);
        Assert.assertEquals(actions.getText(locators.assertDiscountEmail), "Used For Discount Email");
        actions.click(locators.backButton);

    }

    @Test(dependsOnMethods = "selectDiscountEmailTemplate")
    public void selectWelcomeEmailTemplate() {
        SeleniumActions actions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        CreateMailCampaigns oneTime = new CreateMailCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnWelcomeEmail, locators.selectWelcomeEmail);
        Assert.assertEquals(actions.getText(locators.assertWelcomeEmail), "Welcome Email");
        actions.click(locators.backButton);

    }

}
