package Test;

import org.testng.annotations.Test;

import base.searchhotel_selenium;

public class Search_Selenium extends Baseclass{
	
	searchhotel_selenium searchhotel;

	@Test(priority = 1, enabled= true)
	public void clickhotel() {
		searchhotel = new searchhotel_selenium(driver);
		searchhotel.click_hotel();
		
	}

	@Test(priority = 2, enabled= true , dependsOnMethods = {"clickhotel"})
	public void clicksearchfield() throws InterruptedException {
		Thread.sleep(2000);
		searchhotel = new searchhotel_selenium(driver);
		searchhotel.search_hotel();}
	
	@Test(priority = 3, enabled= true ,dependsOnMethods = {"clicksearchfield"})
	public void sendname() throws InterruptedException {
		Thread.sleep(2000);
		searchhotel = new searchhotel_selenium(driver);
		searchhotel.send_name();}
	
	@Test(priority = 4, enabled= true ,dependsOnMethods = {"sendname"})
	public void selectname() throws InterruptedException{
		Thread.sleep(2000);
		searchhotel = new searchhotel_selenium(driver);
		searchhotel.select_country();
		}
	
	@Test(priority = 5, enabled= true)
	public void clickCheckin() throws InterruptedException{
		Thread.sleep(2000);
		searchhotel.click_checkin();
	}
	
	@Test (priority = 6, enabled= true, dependsOnMethods = {"clickCheckin"})
	public void clickCheckout() throws InterruptedException {
		Thread.sleep(2000);
		searchhotel.click_checkout();
	}
	
	@Test (priority = 7, enabled= true, dependsOnMethods = {"clickCheckout"})
	public void addroom() throws InterruptedException{
		Thread.sleep(2000);
		searchhotel.click_addroom();
	}
	
	@Test (priority = 8, enabled= true, dependsOnMethods = {"addroom"})
	public void addadults() throws InterruptedException{
		Thread.sleep(2000);
		searchhotel.click_adults();
	}
	@Test (priority = 9, enabled= true, dependsOnMethods = {"clickCheckout"})
	public void addchild()  throws InterruptedException {
		Thread.sleep(2000);
		searchhotel.click_child_button();
	}
	
	@Test (priority = 10, enabled= true, dependsOnMethods = {"addchild"})
	public void clickAgedropdown() throws InterruptedException {
		searchhotel.click_agedropdown();
		Thread.sleep(2000);
	}
	
	@Test (priority = 11, enabled= true, dependsOnMethods = {"clickAgedropdown"})
	public void selectage() throws InterruptedException {
		searchhotel.selectage();
		Thread.sleep(2000);
	}	
	
	
	@Test (priority = 12, enabled= true, dependsOnMethods = {"selectage"})
	public void updatebutton() throws InterruptedException {
		searchhotel.updatebutton();
		Thread.sleep(2000);
	}
	

	@Test (priority = 13, enabled= true, dependsOnMethods = {"updatebutton"})
	public void hotelcalss() throws InterruptedException {
		Thread.sleep(3000);
		searchhotel.click_hotelclass();
		
	}
	
	@Test (priority = 14, enabled= true, dependsOnMethods = {"updatebutton"})
	public void printhotelname() throws InterruptedException {
		Thread.sleep(2000);
		searchhotel.hotelname();
		
	}
}
