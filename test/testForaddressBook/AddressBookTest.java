package testForaddressBook;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import addressBook.AddressBook;
import addressBook.AddressBook.Address;

public class AddressBookTest {

    @Test
    public void add() {
        AddressBook book = new AddressBook(new HashMap<>());
        book.add("Pasha",new Address("Lenin",13,14));
       // AddressBook bookForTests = new AddressBook(
        Assert.assertEquals(book,new AddressBook(Map.of("Pasha",new Address("Lenin",13,14))));
    }

    @Test
    public void delete() {
    }

    @Test
    public void change() {
    }

    @Test
    public void outputAddress() {
    }

    @Test
    public void listOfPeopleOne() {
    }

    @Test
    public void listOfPeopleTwo() {
    }
}