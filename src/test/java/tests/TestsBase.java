package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.FormTestsPage;

public class TestsBase {

    FormTestsPage formTestsPage = new FormTestsPage();
    TestDataProfile testDataProfile = new TestDataProfile();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com/";
        Configuration.browserSize = "1920x1200";

    }
}
