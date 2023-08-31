package pom;

import Utils.MailLocators;
import Utils.SMSLocators;
import Utils.SeleniumActions;
import org.testng.Assert;

public class Homepage {
    public void EmailCampaign() {

        SeleniumActions actions = new SeleniumActions();
        MailLocators locators = new MailLocators();
        actions.click(locators.emailCampaignsLookup);
        actions.click(locators.createEmailCampaign);
        String homePage = actions.getText(locators.assertOneTimeMAilHomepage);
        Assert.assertEquals(homePage, "One Time Campaign", "home page assertion is done");
        Assert.assertNotNull(homePage, "assertion home page is null");
    }

    public void SMSCampaign() {
        SeleniumActions actions = new SeleniumActions();
        SMSLocators locators = new SMSLocators();
        actions.click(locators.SMSCampaignsLookup);
        actions.click(locators.createSMSCampaign);
        String homePage = actions.getText(locators.assertOneTimeSMSHomepage);
        Assert.assertEquals(homePage, "One Time Campaign", "home page assertion is done");
        Assert.assertNotNull(homePage, "assertion home page is null");
    }
}
