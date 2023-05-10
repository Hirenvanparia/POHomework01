package org.example;

import org.openqa.selenium.By;

public class CheckOutAsGuest extends Utils{
    private By _checkOutGuest = By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    private By _firstName =By.cssSelector("input#BillingNewAddress_FirstName");
    private By _lastName =By.cssSelector("input#BillingNewAddress_LastName");
    private By _emailAddress = By.cssSelector("input#BillingNewAddress_Email");
    private By _companyName =By.cssSelector("input#BillingNewAddress_Company");
    private By _countryName =By.cssSelector("select#BillingNewAddress_CountryId");
    // private By _state =By.cssSelector("select#BillingNewAddress_StateProvinceId");
    private By _cityName =By.cssSelector("input#BillingNewAddress_City");
    private By _address1 =By.cssSelector("input#BillingNewAddress_Address1");
    private By _zip =By.cssSelector("input#BillingNewAddress_ZipPostalCode");
    private By _phoneNumber =By.cssSelector("input#BillingNewAddress_PhoneNumber");
    private By _faxNumber =By.cssSelector("input#BillingNewAddress_FaxNumber");
    private By _continueButton = By.xpath("//button[@class='button-1 new-address-next-step-button']");
    private By _nextDayAir =By.cssSelector("input#shippingoption_1");
    private By _continueButtonAgain = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    private By _creditCardButton = By.cssSelector("input#paymentmethod_1");
    private By _continueButton3 = By.cssSelector(".button-1.payment-method-next-step-button");
    private By _visaType =By.cssSelector("select#CreditCardType");
    private By _cardHolderName =By.cssSelector("input#CardholderName");
    private By _cardHolderNumber =By.cssSelector("input#CardNumber");
    private By _expireMonth =By.cssSelector("select#ExpireMonth");
    private By _expireYear = By.cssSelector("select#ExpireYear");
    private By _cvvCode =By.cssSelector("input#CardCode");
    private By _continueAfterCardDetails=By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    private By _orderConformButton =By.cssSelector("button.button-1.confirm-order-next-step-button");



    public void CheckOutAsGuestSuccessfully(){
        clickOnElement(_checkOutGuest);

    }
    public void BillingAddress(){
        // type first name
        typeText(_firstName,"Harry");
        // type last name
        typeText(_lastName,"Peter");
        //type email
        typeText(_emailAddress,"PorteHarry@gmail.com");
        // type company name
        typeText(_companyName,"Harry Commerce ltd");
        // select country
        selectElementsByText(_countryName,"United Kingdom");
        // type city name
        typeText(_cityName,"London");
        // type road name and number
        typeText(_address1,"10 london road");
        // type zip code
        typeText(_zip,"365631");
        // type phone number
        typeText(_phoneNumber,"7538874266");
        // type fax number
        typeText(_faxNumber,"20345681");
        // click on continue button
        clickOnElement(_continueButton );
        // select shipping
        clickOnRadioButtonElement( _nextDayAir);
        // click again continue
        clickOnElement( _continueButtonAgain);
        // click on credit card button
        clickOnRadioButtonElement(_creditCardButton);
        // click on continue
        clickOnElement(_continueButton3);

    }
    public void PaymentInformation(){
        //selectDropDownElementByText(_visaType,"visa");
        clickOnElement(_visaType);
        //Type cardholder name
        typeText(_cardHolderName,"Harry");
        //Type cardholder number
        typeText(_cardHolderNumber,"4556152371521922");
        //enter expiry month
        selectOptionByValue(_expireMonth,"7");
        //enter expiry year
        selectOptionByValue(_expireYear,"2029");
        //clickOnElement(_cardCode);
        typeText(_cvvCode,"973");
        //click on continue button
        clickOnElement(_continueAfterCardDetails);
        //click on conform order
        clickOnElement(_orderConformButton);
    }
}

