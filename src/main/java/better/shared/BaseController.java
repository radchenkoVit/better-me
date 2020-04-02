package better.shared;

import better.utils.PropertyLoader;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

import static better.utils.RequestSpecUtils.buildDefaultSpec;

public abstract class BaseController {
    protected int port = PropertyLoader.getPort();
    protected String uri = PropertyLoader.getUri();

    @Step("Do POST for endpoint: {1} with model: {0}")
    protected <T> ValidatableResponse doPost(T model, String endPoint) {
        return RestAssured.given(buildDefaultSpec())
                .port(port)
                .body(model)
                .when()
                .post(uri + endPoint)
                .then()
                .log().ifError();
    }

    @Step("response code validation: {1}")
    public BaseController assertStatusCode(ValidatableResponse response, int statusCode) {
        response
                .log().ifError()
                .assertThat()
                .statusCode(statusCode);

        return this;
    }

    @Step("Extract json field value: {1} as object from response to class {2}")
    public <T> T extractFieldAs(ValidatableResponse response, String fieldName, Class<T> clazz) {
        return response.extract().jsonPath().get(fieldName);
    }
}
