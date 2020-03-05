package testForaddressBook;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;
import java.util.ArrayList;
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
        book.add("Katya",new Address("Toreza",20,90));
        Map<String,Address> a = new HashMap<>();
        a.put("Katya",new Address("Toreza",20,90));
        a.put("Pasha",new Address("Lenin",13,14));
        AddressBook b = new AddressBook(a);
        Assert.assertEquals(book,b);
    }

    @Test
    public void delete() {
        AddressBook book = new AddressBook(new HashMap<>());
        book.add("Katya",new Address("Toreza",20,90));
        book.add("Pasha",new Address("Lenin",13,14));
        Map<String,Address> a = new HashMap<>();
        a.put("Pasha",new Address("Lenin",13,14));
        AddressBook b = new AddressBook(a);
        book.delete("Katya");
        Assert.assertEquals(book,b);
    }

    @Test
    public void change() {
        AddressBook book = new AddressBook(new HashMap<>());
        book.add("Serezha",new Address("Kantemirovskaya",16,89));
        book.add("Pasha",new Address("Lenin",13,14));
        Map<String,Address> a = new HashMap<>();
        a.put("Serezha",new Address("Kantemirovskaya",16,89));
        a.put("Pasha",new Address("Nevsky prospect",100,500));
        AddressBook b = new AddressBook(a);
        book.change("Pasha",new Address("Nevsky prospect",100,500));
        Assert.assertEquals(book,b);

    }

    @Test
    public void outputAddress() {
        AddressBook book = new AddressBook(new HashMap<>());
        book.add("Serezha",new Address("Kantemirovskaya",16,89));
        book.add("Pasha",new Address("Lenin",13,14));
        Assert.assertEquals(book.outputAddress("Serezha"),new Address("Kantemirovskaya",16,89));

    }

    @Test
    public void listOfPeopleOne() {
        AddressBook book = new AddressBook(new HashMap<>());
        book.add("Serezha",new Address("Kantemirovskaya",16,89));
        book.add("Pasha",new Address("Lenin",13,14));
        book.add("Lesha",new Address("Sennaya",1,8));
        book.add("Lena",new Address("Lenin",1,4));
        Assert.assertEquals(book.listOfPeopleOne("Lenin"),Arrays.asList("Lena","Pasha"));

    }

    @Test
    public void listOfPeopleTwo() {
        AddressBook book = new AddressBook(new HashMap<>());
        book.add("Serezha",new Address("Kantemirovskaya",16,89));
        book.add("Pasha",new Address("Lenin",13,14));
        book.add("Vitya",new Address("Lenin",13,8));
        book.add("Lena",new Address("Lenin",1,4));
        Assert.assertEquals(book.listOfPeopleTwo("Lenin",13),Arrays.asList("Vitya","Pasha"));
    }
}