package work.part07.part07.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {
    SelenideElement
            cityFrom = $("#departureCity"),
            cityTo = $("#arrivalCity"),
            departureDate = $("#departureDate"),
            findButton = $x("//button[.='Найти']"),
            message = $("#searchMessage");

    @Step("Поиск рейсов (задаём только дату)")
    public void search(String departureDate) {
        this.departureDate.setValue(departureDate);
        this.findButton.click();
    }

    @Step("Поиск рейсов")
    public void search(String departureDate, String from, String to) {
        this.departureDate.setValue(departureDate);
        this.cityFrom.selectOption(from);
        this.cityTo.selectOption(to);
        this.findButton.click();
    }

    @Step("Проверка, что дата не указана")
    public void isDepartureDateEmpty() {
        this.message.shouldHave(text("Пожалуйста, укажите дату вылета."));
    }
//Проверка, что дата в прошлом
    @Test
        public void Test07DateInPast() {
        loginPage lp = new LoginPage();
        lp.login("standard_user","stand_pass1");

        SearchPage sp = new SearchPage();
        sp.search("01.01.2026");
        sp.isDateInPast();
    }
}