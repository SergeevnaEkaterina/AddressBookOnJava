package addressBook;
import java.util.Map;
import java.util.HashMap;
public class Main {

    public static void main(String[] args) {
        AddressBook book = new AddressBook(new HashMap<>());
        book.add("Pasha",new AddressBook.Address("Lenin",13,14));
        book.add("Lesha",new AddressBook.Address("Lenin",7,8));
        book.add("Katya",new AddressBook.Address("Toreza",9,158));
        book.add("Denis",new AddressBook.Address("Lenin",13,9));
        System.out.println(book);

        System.out.println(book.listOfPeopleOne("Toreza"));

        System.out.println(book.listOfPeopleTwo("Lenin",13));

        book.delete("Katya");
        System.out.println(book);

        book.change("Denis",new AddressBook.Address("Mendeleev Bulvar", 4,7));
        System.out.println(book);

        System.out.println(book.outputAddress("Pasha"));


    }
}
