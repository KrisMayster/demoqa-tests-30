package tests;


import org.junit.jupiter.api.Test;


public  class FormTestsWithTestData extends TestsBase {


    @Test
    void successfulTest() {


        formTestsPage.openPage()
                .setFirstName(testDataProfile.firstName)
                .setLastName(testDataProfile.lastName)
                .setUserMail(testDataProfile.email)
                .setGenderMale(testDataProfile.gender)
                .setNumber(testDataProfile.phone)
                .setDateBirht(testDataProfile.day,testDataProfile.month, testDataProfile.year)
                .setSubject(testDataProfile.subShort, testDataProfile.subFull)
                .setHobby(testDataProfile.hobbies)
                .uploadFile(testDataProfile.file)
                .setAdress(testDataProfile.address)
                .setState(testDataProfile.state)
                .setCity(testDataProfile.city)
                .clickSubmit()
                .checkResult("Student Name", testDataProfile.firstName + " " + testDataProfile.lastName)
                .checkResult("Student Email", testDataProfile.email)
                .checkResult("Gender", testDataProfile.gender)
                .checkResult("Mobile", testDataProfile.phone)
                .checkResult("Date of Birth", testDataProfile.day + " " + testDataProfile.month + "," + testDataProfile.year)
                .checkResult("Subjects", testDataProfile.subFull)
                .checkResult("Hobbies", testDataProfile.hobbies)
                .checkResult("Picture", testDataProfile.file)
                .checkResult("Address", testDataProfile.address)
                .checkResult("State and City", testDataProfile.state + " " + testDataProfile.city);

    }


}