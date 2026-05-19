import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class textBoxTests {
    @Test
    void fillFormTestTest() {
        open("https://demoqa.com/text-box"); // - Октрыть сайт демоQA
        $("[id=userName]").setValue("Roman Anisimov");
        $("[id=userEmail]").setValue("djhaskdlgh@gmail.com");
        $("[id=currentAddress]").setValue("Tunakova 47");
        $("[id=permanentAddress]").setValue("Cheluskina 62");
        $("#submit").click();

        //СВерка вывода
        $("#output").shouldHave(text("Roman Anisimov"),text("djhaskdlgh@gmail.com"), text("Tunakova 47"), text("Cheluskina 62"));

    }
}

