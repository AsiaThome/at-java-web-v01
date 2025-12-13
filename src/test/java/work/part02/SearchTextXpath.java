package work.part02;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.text;

public class SearchTextXpath {
    @Test
    public void test01() {
        open("https://www.specialist.ru/courses");
        $x("//*[@class='switch-input-search']").sendKeys("тестирование");
        $x("//*[@class='switch-input-search']").pressEnter();
        $x("//*[contains(.,'Автоматизированное тестирование веб-приложений с использованием Selenium)]");
        $x("//dd[@class='date date-start']").shouldHave(text("24.01.2026"));
    }
}
