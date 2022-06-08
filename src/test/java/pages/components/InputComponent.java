package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class InputComponent {
    public void SetValue (String selector, String value){
        $(selector).setValue(value).pressEnter();
    }
}