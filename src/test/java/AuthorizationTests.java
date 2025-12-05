import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AuthorizationTests {
    @Test
    void test01_login_success() {
    open("https://www.saucedemo.com/");
    $("#user-name").setValue("standard_user");
    $("#password").setValue("secret_sauce");
    $("#login-button").click();
    System.out.println("Авторизация успешна");
    }
    @Test
    void test02_login_wrong_password() {
        open("https://www.saucedemo.com/");
        $("#user-name").setValue("standard_user");
        $("#password").setValue("secret_souce");
        $("#login-button").click();
        System.out.println("Неверный пароль");
    }
}
