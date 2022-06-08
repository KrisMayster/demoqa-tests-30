package tests;


import org.junit.jupiter.api.Test;


public  class FormTestsWithObjectPageTests extends TestsBase {


    @Test
    void successfulTest() {


        formTestsPage.openPage()
                .setFirstName("Cloude")
                .setLastName("Mone")
                .setUserMail("cloudeMone@testmailtest.ru")
                .setGenderMale("Male")
                .setNumber("7088952934")
                .setDateBirht("30", "August", "1990")
                .setSubject("e","English")
                .setHobby("Music")
                .uploadFile("mone.jpeg")
                .setAdress("62 Locust St.,Brooklyn, NY 11207")
                .setState("Rajasthan")
                .setCity("Jaipur")
                .clickSubmit()
                .checkResult("Student Name", "Cloude"+ " " + "Mone")
                .checkResult("Student Email", "cloudeMone@testmailtest.ru")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "7088952934")
                .checkResult("Date of Birth", "30 August,1990")
                .checkResult("Subjects", "English")
                .checkResult("Hobbies", "Music")
                .checkResult("Picture", "mone.jpeg")
                .checkResult("Address", "62 Locust St.,Brooklyn, NY 11207")
                .checkResult("State and City", "Rajasthan Jaipur");

    }


}