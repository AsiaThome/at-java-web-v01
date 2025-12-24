package work.part07.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    SelenideElement
        username = $("#username"),
        password = $("#password"),
        loginButton = $("#loginButton"),
        errorMessage = $("#message"),
        greeting = $("#greeting"),
        logoutButton = $("#logoutButton");

    @Step("Вход в систему")
    public void login(String username, String password) {
        this.username.setValue(username);
        this.password.setValue(password);
        this.loginButton.click();
    }

    @Step("Неуспешный логин")
    public void isLoginUnsuccessful() {
        this.errorMessage.shouldHave(text("Неверное имя пользователя или пароль."));
    }

    @Step("Успешный логин")
    public void isLoginSuccessful(String fio) {
        this.greeting.shouldHave(text("Добро пожаловать, " + fio + "!"));
    }

    @Step("Выход из системы")
    public void Logout(){this.logoutButton.click();}

    @Step("Успешный выход из системы")
    public void isSuccessfulLogout(){this.errorMessage.exists();}

    @Step("Заблокированный пользователь")
    public void isUserBlocked() {this.errorMessage.shouldHave(text("Пользователь заблокирован."));
    }
}