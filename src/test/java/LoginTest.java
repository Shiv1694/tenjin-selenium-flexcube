import org.testng.annotations.Test;

import com.flexcube.framework.base.BaseTest;
import com.flexcube.framework.pages.LoginPage;
import com.flexcube.framework.pages.LogoutPage;

public class LoginTest extends BaseTest {
	@Test
	public void loginTest() {
		LoginPage loginPage = new LoginPage();
		LogoutPage logoutPage = new LogoutPage();
		loginPage.login();
		logoutPage.logout();
		
	}
}
