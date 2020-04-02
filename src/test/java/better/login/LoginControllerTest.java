package better.login;

import better.TestRunner;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

public class LoginControllerTest extends TestRunner {
    private static final String USER = "user";
    private static final String PASSWORD = "password";

    @Test
    public void loginTest() {
        ValidatableResponse response = loginController.login(USER, PASSWORD);
        loginController.assertStatusCode(response, 200);
    }

    @Test
    public void wrongPassword() {
        ValidatableResponse response = loginController.login(USER, "pass");
        loginController.assertStatusCode(response, 401);
    }
}
