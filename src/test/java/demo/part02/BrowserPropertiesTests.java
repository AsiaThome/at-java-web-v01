package demo.part02;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BrowserPropertiesTests {
    @Test
    void test_browser_properties() {
        Configuration.browser = "GoogleChrome";
        Configuration.browserSize = "1500x500";
        Configuration.browserPosition = "100x200";
        open("https://www.consultant.ru/");
        getWebDriver().manage().window().maximize();
        sleep(10_000);
    }
}
