package demo.part02;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class FindElementByTest {
    @Test
    void test01_find_element() {
        open("https://slqa.ru/cases/ChatGPTLogin/");
        $("#username").setValue("standard_user");
        sleep(5_000);
    }
}
