import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.flexcube.framework.base.BaseTest;
import com.flexcube.framework.pages.LoginPage;
import com.flexcube.framework.pages.LogoutPage;

@Listeners(com.flexcube.framework.listeners.TestListener.class)
public class LoginTest extends BaseTest {
	@Test
	public void loginTest() {
		LoginPage loginPage = new LoginPage();
		LogoutPage logoutPage = new LogoutPage();
		loginPage.login();
		logoutPage.logout();

	}
}
