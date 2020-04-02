package better.services.login;

import better.services.login.controller.LoginController;
import io.restassured.response.ValidatableResponse;

public class LoginSteps {
    private LoginController loginController = new LoginController();

    public ValidatableResponse login(String name, String password) {
        ValidatableResponse response = loginController.login(name, password);
        loginController.assertStatusCode(response, 200);
        return response;
    }
}
