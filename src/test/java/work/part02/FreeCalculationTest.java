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
        SelenideElement myElement = $("input[name=sum]");
        myElement.sendKeys("500");
        $(By.name("submit")).click();
        myElement.type("1000");
        $(By.name("submit")).click();
        myElement.setValue("1000");
    }
}