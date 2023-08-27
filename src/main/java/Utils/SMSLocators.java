package Utils;

import org.openqa.selenium.By;

public class SMSLocators {
    //home page locator
    public By SMSCampaignsLookup = By.xpath("//span[text()='SMS Campaigns']");
    public By createSMSCampaign = By.xpath("(//a[text()='Create Campaign'])[2]");
    public By assertOneTimeSMSHomepage = By.className("campaign-item-title");



}
