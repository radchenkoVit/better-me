package better.services.register.model.request;

import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang3.RandomStringUtils;

@Data
@Builder
public class RegisterUser {
    private String username;
    private String password;
    private String email;

    public static RegisterUser generateUser() {
        return RegisterUser.builder()
                .username(RandomStringUtils.randomAlphabetic(10))
                .email(RandomStringUtils.randomAlphabetic(7) + "@gmail.com")
                .password(RandomStringUtils.randomAlphabetic(7))
                .build();
    }
}
