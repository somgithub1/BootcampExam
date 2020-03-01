package test;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import util.BrowserFactory;
import validationPackage.AllListItemsCheckBoxPage;


public class AllListItemsCheckBoxTest {

	
	
	@Test
	public void validateAllListItemsCheckBox() {
		
		WebDriver driver = BrowserFactory.startBrowser();
		AllListItemsCheckBoxPage validationAllList= PageFactory.initElements(driver, AllListItemsCheckBoxPage.class);
		validationAllList.validateCheckboxList();
	}
}
