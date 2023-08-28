package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class D_User 
{

//User Home page
	@FindBy (xpath="//span[text()=' Users']")									      WebElement user_link;
	@FindBy (xpath="//input[@placeholder='Search By Name']")						  WebElement Search_field;
	@FindBy (xpath="(//div[@class='dropdown-toggle'])[1]")                            WebElement CLient_drop_down;
	@FindBy (xpath="(//div[@class='dropdown-toggle'])[2]")							  WebElement Status_drop_down;
    @FindBy (xpath="//button[@class='btn-i-gray3 btn-icon-text commangap-3']")        WebElement Reset_button;
    @FindBy (xpath="(//div[@class=\"action align-items-center d-flex\"])[1]")         WebElement Edit_btn;
    @FindBy (xpath="//select[@class='form-select form-select ms-2 me-2']")            WebElement page_drop_down;
    
//New user page
    @FindBy(xpath="//button[@class='btn-i-secondary btn-icon-text commangap-3']")     WebElement New_btn;
    @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[1]")                WebElement Client_drop_down; 
    @FindBy(xpath="(//input[@placeholder='Enter full name'])[1]")                     WebElement Name;  
    @FindBy(xpath="(//input[@placeholder='Enter full name'])[2]")                     WebElement User_Name;  
    @FindBy(xpath="//input[@placeholder='Mobile']")                                   WebElement mobile;
    @FindBy(xpath="//input[@placeholder='Email']")                                    WebElement Email; 
    @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[2]")                WebElement Role;
    @FindBy(xpath="//input[@aria-autocomplete='list']")                               WebElement Lot_drop;
    @FindBy(xpath="//input[@placeholder='Password']")                                 WebElement New_pwd;
    @FindBy(xpath="//input[@placeholder='Retype Password']")                          WebElement retype_pwd;
    @FindBy(xpath="(//input[@type='radio' and @formcontrolname='radio'])[1]")         WebElement radio_active;
    @FindBy(xpath="(//input[@type='radio' and @formcontrolname='radio'])[2]")         WebElement radio_in_active;
    
    @FindBy(xpath="//button[text()='Cancel']")                                        WebElement cancel_button;
    @FindBy(xpath="//button[text()='Save']")                                          WebElement save_button;
    
    
    
}