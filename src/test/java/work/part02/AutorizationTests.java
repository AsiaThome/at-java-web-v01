package work.part02;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.ExactText;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

@TestMethodOrder(MethodOrderer.MethodName.class)

    public class AutorizationTests {
    @Test
    public void test01LoginSuccess() {
        open("https://slqamsk.github.io/cases/slflights/v01/");

        $(By.id("username")).setValue("standard_user");
        $(By.id("password")).setValue("stand_pass1");
        $(By.id("loginButton")).click();
        $(By.id("flightForm")).shouldHave(text("Поиск авиабилетов"));
        $(By.id("logoutButton")).click();
    }
    @Test
    public void test02LoginWrongPassword() {
        open("https://slqamsk.github.io/cases/slflights/v01/");

        $(By.id("username")).setValue("standard_user");
        $(By.id("password")).setValue("stand_pass2");
        $(By.id("loginButton")).click();
        $(By.id("message")).shouldHave(text("Неверное имя пользователя или пароль."));
    }
}

