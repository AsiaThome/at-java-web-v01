package work.part04;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class AutoTest01 {
    @Test
    public void test01() {
    open("https://www.specialist.ru");
    $x("//button[@id='cookieConsent__ok']").click();
    $x("//a[.='Форматы обучения']").click();
    $x("//div[@class='format-article-content']//a[contains(text(),'Свободное обучение')]").click();
    $x("//a[.='Выбрать курс']").click();
    $x("//*[@class='filter-input']").sendKeys("Программирование");
    $x("//*[@class='filter-button']").pressEnter();
    $x( "//*[contains(text(),'Тестирование ПО')]");
    }
}