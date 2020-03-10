package addressBook;
import java.util.Map;
import java.util.HashMap;
import addressBook.AddressBook.Address;
public class Main {

    public static void main(String[] args) {
        AddressBook book = new AddressBook(new HashMap<>());
        book.add("Pasha",new Address("Lenin",13,14));
        book.add("Lesha",new Address("Lenin",7,8));
        book.add("Katya",new Address("Toreza",9,158));
        book.add("Denis",new Address("Lenin",13,9));
        System.out.println(book);

        System.out.println(book.listOfPeopleOnStreet("Toreza"));

        System.out.println(book.listOfPeopleInHouse("Lenin",13));

        book.delete("Katya");
        System.out.println(book);

        book.change("Denis",new AddressBook.Address("Mendeleev Bulvar", 4,7));
        System.out.println(book);

        System.out.println(book.outputAddress("Pasha"));


    }
}
