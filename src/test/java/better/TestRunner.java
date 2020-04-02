package better;

import better.services.login.LoginSteps;
import better.services.login.controller.LoginController;
import better.services.register.RegisterSteps;
import better.services.register.controller.RegisterController;
import org.testng.annotations.BeforeClass;

public class TestRunner {

    protected LoginController loginController;
    protected RegisterController registerController;
    protected LoginSteps loginSteps;
    protected RegisterSteps registerSteps;

    @BeforeClass
    public void beforeClass() {
        loginController = new LoginController();
        registerController = new RegisterController();
        loginSteps = new LoginSteps();
        registerSteps = new RegisterSteps();
    }

}
