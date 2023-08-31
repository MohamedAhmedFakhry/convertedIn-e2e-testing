package MailCampaign;

import Utils.MailLocators;
import Utils.SeleniumActions;
import Utils.SeleniumBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.CreateMailCampaigns;
import pom.Homepage;
import pom.OneTimeMailCampaignSteps;
import pom.SignInPage;

import java.util.Arrays;
import java.util.List;

public class SendEmailNow {
    SignInPage signInPage = new SignInPage();

    @BeforeTest
    public void init() {
        SeleniumBase seleniumBase = new SeleniumBase();
        seleniumBase.seleniumConfig();
        seleniumBase.Environment();
    }


    @Test
    public void openRedmos() {
        Homepage home = new Homepage();
        signInPage.loginPage("mckenzie.lincoln@yahoo.com", "password");
        home.EmailCampaign();
    }

    @Test(dependsOnMethods = "openRedmos")
    public void selectOneTimeCampaign() {

        MailLocators locators = new MailLocators();
        CreateMailCampaigns oneTime = new CreateMailCampaigns();

        oneTime.selectCampaignType();
        oneTime.oneTimeCampaign(locators.hoverOnBackToSchool, locators.selectBackToSchool);
    }

    @Test(dependsOnMethods = "selectOneTimeCampaign")
    public void chooseCampaignTemplate() {
        OneTimeMailCampaignSteps steps = new OneTimeMailCampaignSteps();
        steps.chooseCampaignTemplate();
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
        Assert.assertEquals(actions.getText(locators.segmentCheck), "ALL");
        Assert.assertTrue(actions.getText(locators.productsCheck).contains("Sunglasses"));
        steps.reviewAndSendNow("m.abolela@converted.in");
        actions.click(locators.publish);
        Assert.assertEquals(actions.getText(locators.assertPublishNow),"Your campaign was successfully created & sent.");
        actions.click(locators.goToMyCampaign);
    }
}