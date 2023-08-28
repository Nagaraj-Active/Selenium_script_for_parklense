package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class F_Lot 
{
//Lot Home page
	@FindBy (xpath="//span[text()=' Lots']")									           WebElement Lot_link;
	@FindBy (xpath="//input[@placeholder='Search By Name']")						       WebElement Search_field;
	@FindBy (xpath="(//div[@class='dropdown-toggle'])[1]")                                 WebElement CLient_drop_down;
	@FindBy (xpath="(//div[@class='dropdown-toggle'])[2]")							   	   WebElement Site_drop_down;
	@FindBy (xpath="(//div[@class='dropdown-toggle'])[3]")							   	   WebElement Status_drop_down;
    @FindBy (xpath="//button[@class='btn-i-gray3 btn-icon-text commangap-3']")         	   WebElement Reset_button;
    //@FindBy (xpath="")           WebElement Edit_btn;
    @FindBy (xpath="//select[@class='form-select form-select ms-2 me-2']") 	               WebElement page_drop_down;
  
//New user page
    @FindBy(xpath="//button[@class='btn-i-secondary btn-icon-text commangap-3']")      	   WebElement New_btn;
    @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[1]")                	   WebElement Client_drop_down;
	@FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[2]")			      	   WebElement Site_Drop_down;
	@FindBy(xpath="//input[@placeholder='Enter Lot Name']")	                               WebElement Lot_name;
	@FindBy(xpath="//input[@placeholder='Enter Lot Title (Display Name)']")	               WebElement Title_Name;
	@FindBy(xpath="//input[@placeholder='Enter parking duration']")	                       WebElement Parking_duration;
	@FindBy(xpath="(//div[@class='form-check min-w-108 ng-star-inserted'])[1]/input")      WebElement Location_indoor;
	@FindBy(xpath="(//div[@class='form-check min-w-108 ng-star-inserted'])[2]/input")      WebElement Location_outdoor;
	@FindBy(xpath="//div[@class='input-group']//span")                                     WebElement Lot_Overlay;
	@FindBy(xpath="//input[@placeholder='Latitude']")	                                   WebElement Lattitude;
	@FindBy(xpath="//input[@placeholder='Longitude']")	                                   WebElement Longitude;
	@FindBy(xpath="(//div[@class='form-check min-w-108 ms-3 ng-star-inserted'])[1]/input") WebElement radio_active;
    @FindBy(xpath="(//div[@class='form-check min-w-108 ms-3 ng-star-inserted'])[2]/input") WebElement radio_in_active;
    
    @FindBy(xpath="//button[text()='Cancel']")                                             WebElement cancel_button;
    @FindBy(xpath="//button[text()='Save']")                                               WebElement save_button;
}
