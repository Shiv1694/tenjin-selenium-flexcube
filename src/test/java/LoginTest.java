import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.flexcube.framework.base.BaseTest;
import com.flexcube.framework.pages.LoginPage;
import com.flexcube.framework.pages.LogoutPage;
import com.flexcube.framework.pages.PopupHandler;
import com.flexcube.framework.utils.WebDriverUtility;

@Listeners(com.flexcube.framework.listeners.TestListener.class)
public class LoginTest extends BaseTest {
	@Test
	public void loginTest() {
		LoginPage loginPage = new LoginPage();
		LogoutPage logoutPage = new LogoutPage();
		PopupHandler popupHandler = new PopupHandler();
		
		loginPage.login();
		WebDriverUtility.captureScreenshot("before login");
		popupHandler.clickOkButton();
		WebDriverUtility.captureScreenshot("after login");
		logoutPage.logout();
		

	}
}
