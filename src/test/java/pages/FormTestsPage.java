package pages;


import com.codeborne.selenide.commands.SetValue;
import pages.components.CalendarComponent;
import pages.components.InputComponent;
import pages.components.ResultTable;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormTestsPage {

    CalendarComponent calendarComponent = new CalendarComponent();
    InputComponent inputComponent = new InputComponent();
    ResultTable resultTable = new ResultTable();


    public FormTestsPage openPage() {
        open("automation-practice-form/");
        return this;
    }


    public FormTestsPage setFirstName(String value) {
        $("[id=firstName]").setValue(value);
        return this;
    }

    public FormTestsPage setLastName(String value) {
        $("[id=lastName]").setValue(value);
        return this;
    }

    public FormTestsPage setUserMail(String value) {
        $("[id=userEmail]").setValue(value);
        return this;
    }

    public FormTestsPage setGenderMale(String value) {
        $("#genterWrapper").$(byText(value)).click();
        return this;
    }

    public FormTestsPage setAdress(String value) {
        $("#currentAddress").setValue(value);
        return this;
    }

    public FormTestsPage setNumber(String value) {
        $("#userNumber").setValue(value);
        return this;
    }

    public FormTestsPage setDateBirht(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendarComponent.SetDate(day, month, year);
        return this;
    }

    public FormTestsPage setSubject(String symbol, String value) {
        $("#subjectsInput").sendKeys(symbol);
        $(byText(value)).click();
        return this;
    }

    public FormTestsPage setHobby(String value) {
        $(byText(value)).click();
        return this;
    }

    public FormTestsPage uploadFile(String value) {
        $("#uploadPicture").uploadFromClasspath(value);
        return this;
    }

    public FormTestsPage setState(String value) {
        inputComponent.SetValue("#react-select-3-input", value);
        return this;
    }

    public FormTestsPage setCity(String value) {
        inputComponent.SetValue("#react-select-4-input", value);
        return this;
    }

    public FormTestsPage clickSubmit () {
        $("[id=submit]").click();
        return this;
    }

    public FormTestsPage checkResult(String key, String value) {
        resultTable.checkResult(key, value);
        return this;
    }
}
