package stepDefinations;

import org.openqa.selenium.WebDriver;

import commonFunction.FunctionLibrary;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SupplierSteps {
	public static WebDriver driver;
	@When("^Open Browser$")
	public void open_Browser() throws Throwable {
		driver =FunctionLibrary.startBrowser();
	}

	@When("^Open Application url\"http://webapp.qedgetech.com/")
	public void OpenUrl(String url) throws Throwable {
		FunctionLibrary.openApplcation(driver,url);
	}

	@When("^Wait For Username with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_For_Username_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.waitForElement(driver, Locator_Type, Locator_Value, "10");
	}

	@When("^Enter Username with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_Username_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.typeAction(driver, Locator_Type, Locator_Value, "admin");
	}

	@When("^Enter Password with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_Password_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.typeAction(driver, Locator_Type, Locator_Value, "master");
	}

	@When("^Click On Login with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_Login_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.clickAction(driver, Locator_Type, Locator_Value);
	}

	@When("^Wait For Supplier with \"([^\"]*)\" and\"([^\"]*)\"$")
	public void wait_For_Supplier_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.waitForElement(driver, Locator_Type, Locator_Value, "10");
	}

	@When("^Click On Supplier with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_Supplier_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.clickAction(driver, Locator_Type, Locator_Value);
	}

	@When("^Wait For AddButton with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_For_AddButton_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.waitForElement(driver, Locator_Type, Locator_Value, "10");
	}

	@When("^Click On AddButton with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_AddButton_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.clickAction(driver, Locator_Type, Locator_Value);
	}

	@When("^Wait For SupplierNumber with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_For_SupplierNumber_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.waitForElement(driver, Locator_Type, Locator_Value, "10");
	}

	@Then("^Capture Data with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void captureSupp(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.captureSupp(driver, Locator_Type, Locator_Value);
	}

	@When("^Enter in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void addsupplier(String Test_Data, String Locator_Type, String Locator_value) throws Throwable {
		FunctionLibrary.typeAction(driver, Locator_Type, Locator_value, Test_Data);
	}

	@When("^Click On Add Button after adding notes with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_Add_Button_after_adding_notes_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.clickAction(driver, Locator_Type, Locator_Value);
	}

	@When("^Wait For Ok Button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_For_Ok_Button_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.waitForElement(driver, Locator_Type, Locator_Value, "10");
	}

	@When("^Click On Ok Button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_Ok_Button_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.clickAction(driver, Locator_Type, Locator_Value);
	}

	@When("^Wait For Alert with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_For_Alert_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.waitForElement(driver, Locator_Type, Locator_Value, "10");
	}

	@When("^Click On Alert with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_Alert_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.clickAction(driver, Locator_Type, Locator_Value);
	}

	@Then("^user validate the supplier table$")
	public void user_validate_the_supplier_table() throws Throwable {
		FunctionLibrary.supplierTable(driver);
	}

	@When("^user closes the browser$")
	public void user_closes_the_browser() throws Throwable {
		FunctionLibrary.closeBrowser(driver);
	}


}


