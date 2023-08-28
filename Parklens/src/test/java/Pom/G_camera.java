package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class G_camera 
{
//Home_page	
	@FindBy(xpath="//a[@href='/camera']")                                                  WebElement camera_link;
	@FindBy(xpath="//input[@placeholder='Search By Name']")						           WebElement Search_field;
	@FindBy(xpath="(//div[@class='dropdown-toggle'])[1]")                                  WebElement CLient_drop;
	@FindBy(xpath="(//div[@class='dropdown-toggle'])[2]")							   	   WebElement Site_drop;
	@FindBy(xpath="(//div[@class='dropdown-toggle'])[3]")							   	   WebElement Lot_drop;
	@FindBy(xpath="(//div[@class='dropdown-toggle'])[4]")							   	   WebElement Status_drop;
	@FindBy(xpath="//button[@class='btn-i-gray3 btn-icon-text commangap-3 mb-3']")         WebElement Reset_button;
    //@FindBy (xpath="")           WebElement Edit_btn;
    @FindBy (xpath="//select[@class='form-select form-select ms-2 me-2']") 	               WebElement page_drop;

//New camera page
    @FindBy(xpath="//button[@class='btn-i-secondary btn-icon-text commangap-3 mb-3']")     WebElement New_button;
    @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[1]")                	   WebElement Client_drop;
	@FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[2]")			      	   WebElement Site_Drop;
	@FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[3]")                     WebElement lot_drop ;
	@FindBy(xpath="//input[@placeholder='Enter Camera Name']")                             WebElement Camera_name ;
	@FindBy(xpath="//input[@aria-autocomplete='list']")                                    WebElement Stalls_drop ;
	@FindBy(xpath="//input[@placeholder='Enter the Camera Access URL']")                   WebElement Camera_url ;
	@FindBy(xpath="(//div[@class='form-check min-w-108 ms-3'])[1]/input")                  WebElement radio_active;
    @FindBy(xpath="(//div[@class='form-check min-w-108 ms-3'])[2]/input")                  WebElement radio_in_active;
    
    @FindBy(xpath="//button[text()='Cancel']")                                             WebElement cancel_button;
    @FindBy(xpath="//button[text()='Save']")                                               WebElement save_button;
	
	
}
