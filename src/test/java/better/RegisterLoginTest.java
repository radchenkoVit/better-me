package better;

import better.services.register.model.request.RegisterUser;
import org.testng.annotations.Test;

public class RegisterLoginTest extends TestRunner {

    @Test
    public void loginNewlyCreatedUser() {
        RegisterUser userToRegister = RegisterUser.generateUser();
        registerSteps.register(userToRegister);
        loginSteps.login(userToRegister.getUsername(), userToRegister.getPassword());
    }
}
