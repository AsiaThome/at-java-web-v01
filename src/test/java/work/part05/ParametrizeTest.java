package work.part05;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Selenide.$x;

public class ParametrizeTest {
    @ParameterizedTest(name = "01. Успешный вход в систему по кнопке Login под разными логинами, #{index}, username: {0}")
    @ValueSource(strings = {"100", "2000", "йцукен"})
    void test01_sum(String sum) {
        $x("//[.=sum]").sendKeys(sum);
    }
}
//@Test
       // $("#password").sendKeys("secret_sauce");
       // $("#loginButton").click();
       // $("#message").shouldHave(text("Вход в систему выполнен успешно! Загрузка..."));
       // $("#message").shouldBe(visible);
       // $("#message").shouldBe(cssClass("success"));
       // $("#greeting").shouldHave(text("Welcome, " + username + "!"));
       // $("#greeting").shouldBe(visible);
