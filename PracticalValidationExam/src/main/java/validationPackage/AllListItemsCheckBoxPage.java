package validationPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AllListItemsCheckBoxPage {

	WebDriver driver;

	public AllListItemsCheckBoxPage(WebDriver driver) {
		this.driver = driver;
	}
@FindBy (how= How.XPATH, using ="//div[@class='controls']/a")
WebElement CHECKBOXES_LIST;
public void validateCheckboxList() {

	boolean isEnabled = CHECKBOXES_LIST.isEnabled();
	if (isEnabled) {
		System.out.println("All list items are clickable");
	} else {
		System.out.println("Verification Failed");
	}

}
}
