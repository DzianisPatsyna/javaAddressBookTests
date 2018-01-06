package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.models.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {

        app.getContactHelper().returnToHomePage();
        if (!app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(
                    new ContactData(
                            "tes1", "tes2", "tes3", "tes4", "tes5", "test1"),
                    true);
        }
        app.getContactHelper().editForm();
        app.getContactHelper().fillTheContactForm(
                new ContactData(
                        "tes1", "tes2", "tes3", "tes4", "tes5", null),
                false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().goToHomePage();
    }
}
