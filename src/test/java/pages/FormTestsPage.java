package pages;


import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.SetValue;
import pages.components.CalendarComponent;
import pages.components.InputComponent;
import pages.components.ResultTable;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormTestsPage {

    SelenideElement firstNameInput = $("[id=firstName]"),
            lastNameInput = $("[id=lastName]"),
            email = $("[id=userEmail]"),
            phone = $("#userNumber"),
            bDate = $("#dateOfBirthInput"),
            subj = $("#subjectsInput"),
            file = $("#uploadPicture"),
            address = $("#currentAddress"),
            submit = $("[id=submit]");

    CalendarComponent calendarComponent = new CalendarComponent();
    InputComponent inputComponent = new InputComponent();
    ResultTable resultTable = new ResultTable();


    public FormTestsPage openPage() {
        open("automation-practice-form/");
        return this;
    }


    public FormTestsPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public FormTestsPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public FormTestsPage setUserMail(String value) {
        email.setValue(value);
        return this;
    }

    public FormTestsPage setGenderMale(String value) {
        $("#genterWrapper").$(byText(value)).click();
        return this;
    }

    public FormTestsPage setAdress(String value) {
        address.setValue(value);
        return this;
    }

    public FormTestsPage setNumber(String value) {
        phone.setValue(value);
        return this;
    }

    public FormTestsPage setDateBirht(String day, String month, String year) {
        bDate.click();
        calendarComponent.SetDate(day, month, year);
        return this;
    }

    public FormTestsPage setSubject(String symbol, String value) {
        subj.sendKeys(symbol);
        $(byText(value)).click();
        return this;
    }

    public FormTestsPage setHobby(String value) {
        $(byText(value)).click();
        return this;
    }

    public FormTestsPage uploadFile(String value) {
        file.uploadFromClasspath(value);
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
        submit.click();
        return this;
    }

    public FormTestsPage checkResult(String key, String value) {
        resultTable.checkResult(key, value);
        return this;
    }
}
