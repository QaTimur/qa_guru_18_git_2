import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class shouldHaveSelenideTest {
    @Test
    void shouldFindSelenideRep(){
        //Открыть сайт гитхаб
        open("https://github.com");
        //Написать в поиске селенит
        // Нажать интер
        $(By.name("css=span.flex-1css=span.flex-1")).setValue("selenide").pressEnter();
        sleep(200);
        // Ожидаемый резульатат: страница с заголовком селенит

    }
}
