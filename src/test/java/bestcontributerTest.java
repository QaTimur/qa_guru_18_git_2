import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


public class bestcontributerTest {

        @Test
        void shouldFindSelenideRep(){
            //Открыть сайт гитхаб
            open("https://github.com/selenide/selenide");
            // подвести мышку к автору
            // увидеть информацию по автору
            $("div.BorderGrid ").$(Selectors.byText("Contributors"))
            .closest(".BorderGrid-cell").$$("ul li").first().hover();
        sleep(10000);


        }
    }

