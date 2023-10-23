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
    @BeforeTest
    public void init() {
        SeleniumBase seleniumBase = new SeleniumBase();
        seleniumBase.SeleniumConfig();
        seleniumBase.Environment();
    }

    @Test
    public void openRedmos() {
        Homepage home = new Homepage();
        home.EmailCampaign();
    }


    @Test(dependsOnMethods = "openRedmos")
    public void selectBackInStockTemplate() {
        SeleniumActions actions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        CreateMailCampaigns oneTime = new CreateMailCampaigns();
        oneTime.selectCampaignType();
        oneTime.oneTimeCampaign(locators.hoverOnBackInStock, locators.selectBackInStock);
        Assert.assertEquals(actions.getText(locators.assertBackInStock), "Back In Stock");
        actions.click(locators.backButton);

    }


    @Test(dependsOnMethods = "selectBackInStockTemplate")
    public void selectShoppingSeasonSummerSaleTemplate() {
        SeleniumActions actions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        CreateMailCampaigns oneTime = new CreateMailCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnShoppingSeasonSummer, locators.selectShoppingSeasonSummer);
        Assert.assertEquals(actions.getText(locators.assertShoppingSeasonSummer), "Shopping Season Summer Sale");
        actions.click(locators.backButton);

    }

    @Test(dependsOnMethods = "selectShoppingSeasonSummerSaleTemplate")
    public void select24HrsFlashSaleTemplate() {
        SeleniumActions actions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        CreateMailCampaigns oneTime = new CreateMailCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOn24FlashSale, locators.select24FlashSale);
        Assert.assertEquals(actions.getText(locators.assert24FlashSale), "24 Hrs Flash Sale");
        actions.click(locators.backButton);

    }

    @Test(dependsOnMethods = "select24HrsFlashSaleTemplate")
    public void select24HrsFlashSale2Template() {
        SeleniumActions actions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        CreateMailCampaigns oneTime = new CreateMailCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOn24FlashSale2, locators.select24FlashSale2);
        Assert.assertEquals(actions.getText(locators.assert24FlashSale2), "24 Hrs FLASH SALE");
        actions.click(locators.backButton);

    }

    @Test(dependsOnMethods = "select24HrsFlashSale2Template")
    public void selectEbookReleasedTemplate() {
        SeleniumActions actions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        CreateMailCampaigns oneTime = new CreateMailCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnEbookReleased, locators.selectEbookReleased);
        Assert.assertEquals(actions.getText(locators.assertEbookReleased), "New Ebook Released");
        actions.click(locators.backButton);

    }

    @Test(dependsOnMethods = "selectEbookReleasedTemplate")
    public void selectSummerSaleTemplate() {
        SeleniumActions actions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        CreateMailCampaigns oneTime = new CreateMailCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnSummerSale, locators.selectSummerSale);
        Assert.assertEquals(actions.getText(locators.assertSummerSale), "Summer Sale");
        actions.click(locators.backButton);

    }


    @Test(dependsOnMethods = "selectSummerSaleTemplate")
    public void selectHelloBlackFridayTemplate() {
        SeleniumActions actions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        CreateMailCampaigns oneTime = new CreateMailCampaigns();
        oneTime.oneTimeCampaign(locators.hoverOnBlackFriday, locators.selectBlackFriday);
        Assert.assertEquals(actions.getText(locators.assertBlackFriday), "Hello Black Friday");
        actions.click(locators.backButton);

    }

    @Test(dependsOnMethods = "selectHelloBlackFridayTemplate")
    public void selectDiscountEmailTemplate() {
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
