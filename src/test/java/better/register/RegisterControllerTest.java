package better.register;

import better.TestRunner;
import better.services.register.model.request.RegisterUser;
import io.restassured.response.ValidatableResponse;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class RegisterControllerTest extends TestRunner {

    @Test
    public void registerUser() {
        RegisterUser userToRegister = RegisterUser.generateUser();
        ValidatableResponse response = registerController.register(userToRegister);
        registerController.assertStatusCode(response, 200);

        String id = registerController.extractFieldAs(response, "id", String.class);
        Assertions.assertThat(id).isNotBlank();
    }

    @Test
    public void failedRegisterWithWrongEmail() {
        RegisterUser userToRegister = RegisterUser.builder()
                .username("somename")
                .email("jhk")
                .password("pass")
                .build();

        ValidatableResponse response = registerController.register(userToRegister);
        registerController.assertStatusCode(response, 500);
    }

    @Test
    public void failedRegisterWithEmptyPassword() {
        RegisterUser userToRegister = RegisterUser.builder()
                .username("somename")
                .email("somename@gmail.com")
                .password("")
                .build();

        ValidatableResponse response = registerController.register(userToRegister);
        registerController.assertStatusCode(response, 500);
    }

}
