package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public  class FormTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com/";
        Configuration.browserSize = "1920x1200";

    }

    @Test
    void successfulTest() {
        open("automation-practice-form/");


        $("[id=firstName]").setValue("Cloude");
        $("[id=lastName]").setValue("Mone");
        $("[id=userEmail]").setValue("cloudeMone@testmailtest.ru");

        $(byText("Male")).click();

        $("#userNumber").setValue("7088952934"); // с # вместо id=

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("August"); // с . вместо class=
        $(".react-datepicker__year-select").selectOption("1991");
        $(".react-datepicker__day--011").click();

        $("#subjectsInput").sendKeys("E");
        $(byText("English")).click();

        $(byText("Music")).click();

        $("#uploadPicture").uploadFromClasspath("mone.jpeg");

        $("#currentAddress").setValue("62 Locust St.,Brooklyn, NY 11207");

        $("#react-select-3-input").setValue("Rajasthan").pressEnter();
        $("#react-select-4-input").setValue("Jaipur").pressEnter();


        $("[id=submit]").click();

        $(".table-responsive").shouldHave(

                text("Cloude Mone"),
                text("cloudeMone@testmailtest.ru"),
                text("Male"),
                text("7088952934"),
                text("11 August,1991"),
                text("English"),
                text("Music"),
                text("mone.jpeg"),
                text("62 Locust St.,Brooklyn, NY 11207"),
                text("Rajasthan Jaipur")

        );
    }


}