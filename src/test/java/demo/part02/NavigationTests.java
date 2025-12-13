package demo.part02;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class NavigationTests {
    @Test
    void test_navigation() {
        open("https://www.consultant.ru/");
        sleep(3_000);
        open("https://ru.wikipedia.org/");
        sleep(3_000);
        open("https://ru.wikipedia.org/wiki/Selenide/");
        back();
        sleep(3_000);
        forward();
        sleep(10_000);
        }
}
