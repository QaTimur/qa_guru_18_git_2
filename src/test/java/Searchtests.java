import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Searchtests {
    @Test
    void successfulSearchTest() {
        open("https://demoqa.com/automation-practice-form");

    }
}

