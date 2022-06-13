package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchhotel_selenium {

public searchhotel_selenium (WebDriver driver) {
	
PageFactory.initElements(driver, this);}

@FindBy(xpath="//a[@href=\"/Hotels\"]") WebElement hotel_Button;
public void click_hotel() {
	hotel_Button.click();
}



@FindBy(xpath="/html/body/div[2]/div/form/input[1]") WebElement search_hotel;
public void search_hotel() {
	search_hotel.click();
}


//public void send_name(WebElement search_field) {
	//search_field.sendKeys("Switzerland");
//}

public void send_name() {
	search_hotel.sendKeys("Switzerland");
}


@FindBy(xpath="//*[@id=\"typeahead_results\"]/a[1]/div[2]") WebElement select_country;
public void select_country() {
	select_country.click();
}

@FindBy(xpath="//*[@id=\"HEADING\"]") WebElement heading_of_the_page;
public void heading_of_the_page() {
	
}

@FindBy(xpath="//*[@id=\"BODY_BLOCK_JQUERY_REFLOW\"]/div[5]/div[2]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[3]/div[5]") WebElement click_checkin;
public void click_checkin() {
	click_checkin.click();
}

@FindBy(xpath="//*[@id=\"BODY_BLOCK_JQUERY_REFLOW\"]/div[5]/div[2]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[3]/div[5]") WebElement click_checkout;
public void click_checkout() {
	click_checkout.click();
}

@FindBy(css="body#BODY_BLOCK_JQUERY_REFLOW div:nth-child(1) > div.fiDyZ._m.c.q.B1.Z.R2 > button:nth-child(3) > span") WebElement click_addroom;
public void click_addroom() {
	 click_addroom.click();
}


@FindBy(css="body#BODY_BLOCK_JQUERY_REFLOW div:nth-child(3) > div.fiDyZ._m.c.q.B1.Z.R2 > button:nth-child(3) > span") WebElement click_child_button;
public void click_child_button() {
	 click_child_button.click();

}



@FindBy(css="body#BODY_BLOCK_JQUERY_REFLOW div:nth-child(2) > div.fiDyZ._m.c.q.B1.Z.R2 > button:nth-child(3) > span") WebElement click_adults;
public void click_adults() {
	 click_adults.click();
}


@FindBy(css="body#BODY_BLOCK_JQUERY_REFLOW div.chkmV.Mf > button") WebElement updatebutton;
public void updatebutton() {
	 updatebutton.click();
}

@FindBy(css="body#BODY_BLOCK_JQUERY_REFLOW div.cJbNW.Mf.Z._V > div > div > button") WebElement click_agedropdown;
public void click_agedropdown() {
	 click_agedropdown.click();
}

@FindBy(css="body#BODY_BLOCK_JQUERY_REFLOW div.dMszK._g._f.Z > button:nth-child(4)") WebElement selectage;
public void selectage() {
	 selectage.click();
}

@FindBy(css="div#component_12 div:nth-child(6) > div.czbRE > div:nth-child(4) > div > label") WebElement click_hotelclass;
public void click_hotelclass() {
	 click_hotelclass.click();
}

@FindBy(xpath="//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[3]/div[3]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]") WebElement hotelname;
public void hotelname() {
	 System.out.println("----> Heading is: "+ hotelname.getText());
}




//@FindBy(xpath="//button[@data-automation='childrenMore']") WebElement click_child_button;
//public void click_child_button() {
	//click_child_button.click();
}



















