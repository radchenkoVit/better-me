package better.services.register.controller;

import better.services.register.model.request.RegisterUser;
import better.shared.BaseController;
import io.qameta.allure.Step;
import io.restassured.response.ValidatableResponse;

public class RegisterController extends BaseController {
    private static final String REGISTER_ENDPOINT = "/register";

    @Step("Register next user: {0}")
    public ValidatableResponse register(RegisterUser user) {
        return doPost(user, REGISTER_ENDPOINT);
    }
}
