package work.part03;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.text;

public class SearchTextXpath {
    @Test
    public void test01() {
    open("https://www.specialist.ru");
    $x("//button[@id='cookieConsent__ok']").click();
    $x("//a[.='Курсы']").click();
    $x("//a[.='Каталог курсов']").click();
    $x("//*[@class='switch-input-search']").sendKeys("тестирование");
    $x("//*[@class='switch-input-search']").pressEnter();
        String myXPath = "//*[contains(text(),'Автоматизированное тестирование веб-приложений с использованием Selenium')]/ancestor::article//dd[contains(@class,'date-start') and contains(@class,'date')]";
        SelenideElement se = $x(myXPath);
        se.shouldHave(text("24.01.2026"));
    }
}