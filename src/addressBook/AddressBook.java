package addressBook;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class AddressBook {

    private Map<String, Address> mapOfAddresses;

    public AddressBook(Map<String, Address> mapOfAddresses){
        this.mapOfAddresses = mapOfAddresses;
    }
    public static class Address{

        private String street; // улица
        private int house; // номер дома
        private int door; // номер квартиры

        public Address(String street, int house, int door) {
            this.street = street;
            this.house = house;
            this.door = door;
            }
            public int getDoor(){
            return door;
            }
            public int getHouse(){
            return house;
        }
            public String getStreet(){
            return street;
        }
        @Override
        public String toString(){
            StringBuilder two = new StringBuilder();
            two.append(street);
            two.append(" ");
            two.append(house);
            two.append(" ");
            two.append(door);
            two.append("; ");
            return two.toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this==o)
                return true;
            if(o==null)
                return false;
            if (getClass()!=o.getClass())
                return false;
            Address other = (Address) o;
            return (street.equals(other.street)) && (house == other.house) && (door == other.door);
        }
        @Override
        public int hashCode() {
            return Objects.hash(street, house,door);
        }

        }
    public boolean add(String name, Address address) {
        if(!mapOfAddresses.containsKey(name))
        { mapOfAddresses.put(name, address);
        return true;}
        else return false;
    }
    public boolean delete(String name) {
        if(mapOfAddresses.containsKey(name))
        {mapOfAddresses.remove(name);
        return true;}
        else return false;
    }
    public boolean change(String name, Address address) {
        if (mapOfAddresses.containsKey(name))
        {mapOfAddresses.put(name,address);
        return true;}
        else return false;
    }
    public Address outputAddress(String name) {
        return mapOfAddresses.get(name);
    }
    public List<String> listOfPeopleOnStreet(String street) {
        List<String> listOfPeople = new ArrayList<>();
        for (Map.Entry<String, Address> element: mapOfAddresses.entrySet()) {
            if (element.getValue().street.equals(street))
                listOfPeople.add(element.getKey());
        }
        return listOfPeople;
    }
    public List<String> listOfPeopleInHouse(String street, int house) {
        List<String> listOfPeople = new ArrayList<>();
        for (Map.Entry<String, Address> element: mapOfAddresses.entrySet()) {
            if (element.getValue().street.equals(street) && element.getValue().house == house) {
                listOfPeople.add(element.getKey());
            }
        }
        return listOfPeople;
    }

    @Override
    public String toString(){
        StringBuilder one = new StringBuilder();
        for(Map.Entry<String, Address> element: mapOfAddresses.entrySet()){
            one.append(element.getKey());
            one.append(" ");
            one.append(element.getValue().street);
            one.append(" ");
            one.append(element.getValue().house);
            one.append(" ");
            one.append(element.getValue().door);
            one.append("; ");
        }
        return one.toString();
    }
    @Override
    public boolean equals(Object o) {
        if (this==o)
            return true;
        if(o==null)
            return false;
        if (getClass()!=o.getClass())
            return false;
        AddressBook other = (AddressBook) o;
        return mapOfAddresses.equals(other.mapOfAddresses);
    }

    @Override
    public int hashCode() {
        return mapOfAddresses.hashCode();
    }
}
