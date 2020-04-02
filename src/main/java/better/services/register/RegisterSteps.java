package better.services.register;

import better.services.register.controller.RegisterController;
import better.services.register.model.request.RegisterUser;
import io.restassured.response.ValidatableResponse;

public class RegisterSteps {
    private RegisterController registerController = new RegisterController();

    public ValidatableResponse register(RegisterUser user) {
        ValidatableResponse response = registerController.register(user);
        registerController.assertStatusCode(response, 200);
        return response;
    }
}
