package work.part02;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class FreeCalculationTest {
    @Test
    public void testElementSearchMethods() {
        open("https://slqa.ru/cases/fc/v01/");
        $(By.name("sum")).setValue("1000");
        $(By.name("submit")).click();
        $(By.name("sum")).clear(); type("500");
        $(By.name("submit")).click();
    }
}