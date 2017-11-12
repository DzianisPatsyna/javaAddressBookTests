package ru.stqa.pft.addressbook.tests;
import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase{

    @Test
    public void testContactDeletion() {
        app.getContactHelper().goHome();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.wd.switchTo().alert().accept();
    }
}