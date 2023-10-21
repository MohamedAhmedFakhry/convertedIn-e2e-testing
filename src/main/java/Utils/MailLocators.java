package Utils;

import org.openqa.selenium.By;

public class MailLocators {
    //login locators
    public By loginEmail = By.id("email");
    public By loginPassword = By.id("password");
    public By loginButton = By.xpath("//button[@type='submit']");
    public By assertLogin = By.xpath("//h1[@class='title']");

    //home page locators
    public By emailCampaignsLookup = By.xpath("//span[text()='Email Campaigns']");
    public By createEmailCampaign = By.xpath("(//a[text()='Create Campaign'])[3]");
    public By assertOneTimeMailPage = By.className("campaign-item-title");

    //steps to go inside chosen template
    public By oneTimeNextButton = By.xpath("//button[text()='Next']");
    public By templateGroups = By.xpath("//div[@data-group-id=25]");
    public By hoverOnBackToSchool = By.xpath("//div[@data-template-type='83']");
    public By selectBackToSchool = By.xpath("//*[@data-template-type='83']//button[text()='Select']");
    public By assertBackToSchool = By.xpath("//*[text()='Shopping Season Back To School']");


    //locators chooseCampaignTemplate
    public By hoverCampaignTemplate = By.xpath("//div[@class='handover-media']");
    public By previewButton = By.xpath("//button[@class='preview-btn']");
    public By closePreview = By.xpath("//button[@class='btn btn-secondary']");
    public By useTemplateButton = By.xpath("//button[@class='use-template-btn']");

    public By assertCampaignDetails = By.xpath("//*[text()='Default Template Preview']");


    //locators createCampaignSettings

    public By campaignName = By.xpath("//input[@name='name']");
    public By subjectLine = By.xpath("//input[@name='subject']");
    public By segmentLookup = By.xpath("//*[@id='select2-segment-container']");
    public By segmentSearch = By.xpath("//*[@aria-label='Search']");
    public By segmentSelection = By.xpath("//li[@role='option'][1]");
    public By productSetLookup = By.xpath("//*[@id='select2-productSets-container']");
    public By productSetSearch = By.xpath("//input[@aria-controls='select2-productSets-results']");
    public By productSetSelection = By.xpath("//li[@role='option'][1]");

    // choose from product (these locators are inactive because there are some changes in this field)

    public By chooseProduct = By.xpath("(//button[@data-popuptarget='multi-select-product-popup'])[1]");
    public By searchForProduct = By.name("SearchDualList");
    public By selectProducts = By.xpath("(//label[@class='form-check-label stretched-link'])[1]");
    public By addProductButton = By.xpath("(//*[@data-popuptarget='multi-select-product-popup'])[3]");
    public By assertCustomizePopup = By.xpath("//h5[@id='exampleModalLabel']");

    //locators of customize design
    public By closePopUp = By.xpath("//*[@onclick='if (!window.__cfRLUnblockHandlers) return false; hideOnBoarding()']");
    public By assertReviewStep = By.xpath("//h2[@class='my-5']");


    //locators of review and send

    public By campaignNameCheck = By.xpath("(//*[@class='pl-5'])[1]");
    public By subjectLineCheck = By.xpath("(//*[@class='pl-5'])[2]");
    public By segmentCheck = By.xpath("(//*[@class='pl-5'])[3]");
    public By productsCheck = By.xpath("(//*[@class='pl-5'])[4]");
    public By testMail = By.id("testEmail");
    public By testMailButton = By.xpath("//button[@id='emailTestButton']");

    public By previewMail = By.xpath("//button[@class='preview-email-action']");
    public By closePreviewReview = By.xpath("(//button[@aria-label='Close'])[1]");
    public By later = By.id("later-cta");
    public By now = By.xpath("//*[@class='btn-active now-cta']");
    public By date = By.xpath("//input[@class='date-picker-wrapper']");
    public By selectDate = By.xpath("//*[@class='dudp__date current selected']");
    public By time = By.xpath("//input[@class='time-picker-input timepicker hasWickedpicker']");
    public By hours = By.xpath("(//span[@class='wickedpicker__controls__control-up'])[1]");
    public By timeZone = By.className("select2-selection__arrow");
    public By searchTimeZone = By.className("select2-search__field");

    public By assertTestMsg = By.xpath("//*[@class='success-validation hidden-by-default']");
    public By publish = By.xpath("//button[text()='Publish']");
    public By goToMyCampaign = By.xpath("//button[text()='Go to my campaigns']");

    public By assertPublishLater = By.xpath("//p[text()='Your campaign was successfully created. Your campaign is queued to be sent.']");
    public By assertPublishNow = By.xpath("//p[text()='Your campaign was successfully created & sent.']");

    //back button
    public By backButton = By.xpath("//button[text()='Back']");


    //check all templates locators and it's assertions
    public By hoverOnBackInStock = By.xpath("//div[@data-template-type='85']");
    public By selectBackInStock = By.xpath("//*[@data-template-type='85']//button[text()='Select']");
    public By assertBackInStock = By.xpath("//*[text()='Back in stock']");

    public By hoverOnDiscountOffer = By.xpath("//div[@data-template-type='87']");
    public By selectDiscountOffer = By.xpath("//*[@data-template-type='87']//button[text()='Select']");
    public By assertDiscountOffer = By.xpath("//*[text()='discount on selected items']");

    public By hoverOnShoppingSeasonSummer = By.xpath("//div[@data-template-type='89']");
    public By selectShoppingSeasonSummer = By.xpath("//*[@data-template-type='89']//button[text()='Select']");
    public By assertShoppingSeasonSummer = By.xpath("//*[text()='Shopping Season Summer Sale']");

    public By hoverOn24FlashSale = By.xpath("//div[@data-template-type='91']");
    public By select24FlashSale = By.xpath("//*[@data-template-type='91']//button[text()='Select']");
    public By assert24FlashSale = By.xpath("//*[text()='24 Hrs Flash Sale']");

    public By hoverOn24FlashSale2 = By.xpath("//div[@data-template-type='174']");
    public By select24FlashSale2 = By.xpath("//*[@data-template-type='174']//button[text()='Select']");
    public By assert24FlashSale2 = By.xpath("//*[text()='24 hrs FLASH SALE']");

    public By hoverOnLaborDay = By.xpath("//div[@data-template-type='177']");
    public By selectLaborDay = By.xpath("//*[@data-template-type='177']//button[text()='Select']");
    public By assertLaborDay = By.xpath("//*[text()='Labor Day']");

    public By hoverOnEbookReleased = By.xpath("//div[@data-template-type='180']");
    public By selectEbookReleased = By.xpath("//*[@data-template-type='180']//button[text()='Select']");
    public By assertEbookReleased = By.xpath("//*[text()='New ebook released']");

    public By hoverOnSummerSale = By.xpath("//div[@data-template-type='183']");
    public By selectSummerSale = By.xpath("//*[@data-template-type='183']//button[text()='Select']");
    public By assertSummerSale = By.xpath("//*[text()='Summer Sale']");

    public By hoverOnWomenDay = By.xpath("//div[@data-template-type='186']");
    public By selectWomenDay = By.xpath("//*[@data-template-type='186']//button[text()='Select']");
    public By assertWomenDay = By.xpath("//*[contains(text(),'Women')]");

    public By hoverOnBlackFriday = By.xpath("//div[@data-template-type='188']");
    public By selectBlackFriday = By.xpath("//*[@data-template-type='188']//button[text()='Select']");
    public By assertBlackFriday = By.xpath("//*[text()='Hello Black Friday']");

    public By hoverOnDiscountEmail = By.xpath("//div[@data-template-type='191']");
    public By selectDiscountEmail = By.xpath("//*[@data-template-type='191']//button[text()='Select']");
    public By assertDiscountEmail = By.xpath("//*[text()='Used for Discount Email']");

    public By hoverOnWelcomeEmail = By.xpath("//div[@data-template-type='193']");
    public By selectWelcomeEmail = By.xpath("//*[@data-template-type='193']//button[text()='Select']");
    public By assertWelcomeEmail = By.xpath("//*[text()='Welcome Email']");


}




