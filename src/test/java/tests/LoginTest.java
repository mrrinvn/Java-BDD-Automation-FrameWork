package tests;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.LoginPage;


public class LoginTest  {

    LoginPage page ;

    public LoginTest()
    {
        page = new LoginPage(BaseTest.driver);
    }

    @Given("^User give url$")
    public void user_give_url() {
        page.openPage();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("^User give valid user name and pass$")
    public void user_give_valid_user_name_and_pass()  {
        page.enterUserName();
        page.enterPassWord();
    }

    @Then("^User click Login button$")
    public void user_click_Login_button() {
        page.clickToMainPage();
    }

    @Then("^User is able to login$")
    public void user_is_able_to_login() {

    }

}
