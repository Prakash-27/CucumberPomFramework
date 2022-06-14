package stepdefinitionparallelwithtestng;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.Pages.AccountPage;
import com.Pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AccountsPageSteps {

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private AccountPage accountsPage;

	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable CredentialTable) {
		List<Map<String, String>> CredentialList = CredentialTable.asMaps();
		String username = CredentialList.get(0).get("username");
		String password = CredentialList.get(0).get("password");

		DriverFactory.getDriver()
				.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		accountsPage = loginPage.doLogin(username, password);
	}

	@Given("user is on Account page")
	public void user_is_on_account_page() {
		String title = accountsPage.getAccountPageTitle();
		System.out.println("Accounts Page title is: " + title);
	}
	
	@Then("user gets account section")
	public void user_gets_account_section(DataTable sectionsTable) {
		List<String> expectedAccountSectionsList = sectionsTable.asList();
		System.out.println("Expected accounts section list: " + expectedAccountSectionsList);

		List<String> actualAccountSectionsList = accountsPage.getAccountsSectionsList();
		System.out.println("Actual accounts section list: " + actualAccountSectionsList);

		Assert.assertTrue(expectedAccountSectionsList.containsAll(actualAccountSectionsList));
	}

	@Then("account section count should be {int}")
	public void account_section_count_should_be(Integer expectedSectionCount) {
		Assert.assertTrue(accountsPage.getAccountsSectionCount() == expectedSectionCount);
	}

}