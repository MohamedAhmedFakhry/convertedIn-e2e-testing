package MailCampaign;

import Utils.MailLocators;
import Utils.SeleniumActions;
import Utils.SeleniumBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.Homepage;
import pom.OneTimeMailCampaignSteps;
import pom.SignInPage;

import java.util.Arrays;
import java.util.List;

import static Utils.SeleniumBase.driver;

public class CheckOnlyOneTimeCampaignSteps {
    @BeforeTest
    public void init() {

        SeleniumBase seleniumBase = new SeleniumBase();
        seleniumBase.SeleniumConfig();
        seleniumBase.Environment();
    }

    @Test()

    public void openRedmos() {
        Homepage home = new Homepage();
        home.EmailCampaign();
        driver.navigate().to("https://app-stg.converted.in/dashboard/campaigns/email/one-time-campaign/templates/188/list");
    }

    @Test(dependsOnMethods = "openRedmos")
    public void chooseCampaignTemplate() {
        SeleniumActions actions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        OneTimeMailCampaignSteps steps = new OneTimeMailCampaignSteps();
        steps.chooseCampaignTemplate();
        Assert.assertEquals(actions.getText(locators.assertCampaignDetails), "Default Template Preview");
    }

    @Test(dependsOnMethods = "chooseCampaignTemplate")

    public void createCampaignSettings() {
        OneTimeMailCampaignSteps steps = new OneTimeMailCampaignSteps();
        List<String> products = Arrays.asList("test", "star", "sunglasses");
        steps.createCampaignSettings("campaign1", "subject1", "all", "new", products);
    }

    @Test(dependsOnMethods = "createCampaignSettings")
    public void customizeYourDesign() {
        OneTimeMailCampaignSteps steps = new OneTimeMailCampaignSteps();
        steps.customizeYourDesign();
    }

    @Test(dependsOnMethods = "customizeYourDesign")
    public void reviewAndSend() {
        OneTimeMailCampaignSteps steps = new OneTimeMailCampaignSteps();
        SeleniumActions actions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        Assert.assertEquals(actions.getText(locators.campaignNameCheck), "campaign1");
        Assert.assertEquals(actions.getText(locators.subjectLineCheck), "subject1");
        Assert.assertEquals(actions.getText(locators.segmentCheck), "All Customers");
        Assert.assertTrue(actions.getText(locators.productsCheck).contains("Sunglasses"));
        steps.reviewAndSendLater("h.adel@converted.in", "cairo");
    }
}
