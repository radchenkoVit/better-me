package better.services.login.controller;

import better.shared.BaseController;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class LoginController extends BaseController {
    private static final String LOGIN_URL = "/login";

    @Step("Login with user: {0} and pass: {1}")
    public ValidatableResponse login(String user, String password) {
        return RestAssured.given().log().all()
                .port(port)
                .auth().preemptive()
                .basic(user, password)
                .when()
                .get(uri + LOGIN_URL)
                .then();
    }
}
