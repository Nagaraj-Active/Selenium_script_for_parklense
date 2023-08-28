package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class E_Site {
	
	//Site home page
	    @FindBy (xpath="//a[@href='/sites']//span")									      WebElement site_link;
		@FindBy (xpath="//input[@placeholder='Search By Name']")						  WebElement Search_field;
		@FindBy (xpath="(//div[@class='dropdown-toggle'])[1]")                            WebElement CLient_drop_down;
		@FindBy (xpath="(//div[@class='dropdown-toggle'])[2]")							  WebElement Status_drop_down;
	    @FindBy (xpath="//button[@class='btn-i-gray3 btn-icon-text commangap-3']")        WebElement Reset_button;
	    @FindBy (xpath="")         WebElement Edit_btn;
	    @FindBy (xpath="//select[@class='form-select form-select ms-2 me-2']")            WebElement page_drop_down;
	    
	//New page
	    @FindBy(xpath="//button[@class='btn-i-secondary btn-icon-text commangap-3']")     WebElement New_btn;
	    @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[1]")                WebElement Client_drop_down;
	    @FindBy(xpath="(//input[@placeholder='Enter full name'])[1]")                     WebElement Site_name;  
	    @FindBy(xpath="//input[@placeholder='Enter Site Title']")                         WebElement Title_name; 
	    @FindBy(xpath="//div[@class='ng2-tag-input ng-tns-c102-1 bootstrap']")            WebElement Lot_name;
	    @FindBy(xpath="(//input[@type='radio' and @formcontrolname='radio'])[1]")         WebElement radio_active;
	    @FindBy(xpath="(//input[@type='radio' and @formcontrolname='radio'])[2]")         WebElement radio_in_active;
	    
	    @FindBy(xpath="//button[text()='Cancel']")                                        WebElement cancel_button;
	    @FindBy(xpath="//button[text()='Save']")                                          WebElement save_button; 
}
