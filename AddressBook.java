
import java.util.ArrayList;
import java.util.*;

public class AddressBook {      // creat arraylist of contacts

    public ArrayList<Contact> contacts = new ArrayList<Contact>();


    public AddressBook() {    

    }



    public void removeContact(int index)
    {
        contacts.remove(index);
    }

    public void sortAddressBook() {    
        Collections.sort(contacts);
    }



    public void addNewContact(Contact cont) {       //to add new contacts   
        contacts.add(cont);
    }

    public int getIndexByName(String first_name) {      //to get contact and storage it to the index

       for (int i=0; i<contacts.size(); i++) {
            if (contacts.get(i).getFirst_name().equals(first_name)) {
                return i;
            }
        }

       return -1;
    }


 public int getIndexBylastName(String last_name) {      //to get contact and storage it to the index

       for (int i=0; i<contacts.size(); i++) {
            if (contacts.get(i).getLast_name().equals(last_name)) {
                return i;
            }
        }

       return -1;
    }


public int getIndexByAddress(String Address)
{
     for (int i=0; i<contacts.size(); i++) {
            if (contacts.get(i).getAddress().equals(Address)) {
                return i;
            }
        }

       return -1;
}



public int getIndexByNumber(String number)
{
     for (int i=0; i<contacts.size(); i++) {
            if (contacts.get(i).getPhone_no().equals(number)) {
                return i;
            }
        }

       return -1;
}



    public void updateName(int index, String newName){      // add name to the index
        this.contacts.get(index).setFirst_name(newName);
    }


    public void updatelastName(int index, String newName){      // add name to the index
        this.contacts.get(index).setLast_name(newName);
    }



 public void updateAddress(int index, String newAddress){      // add name to the index
        this.contacts.get(index).setAddress(newAddress);
    }


public void updatephonenumber(int index, String newphonenumber){      // add name to the index
        this.contacts.get(index).setPhone_no(newphonenumber);
    }


public void displaySpci(int i)
{

        Contact contact = contacts.get(i);

        System.out.println(" Name: " + contact.getFirst_name());
            System.out.println(" Last name: " + contact.getLast_name());
            System.out.println(" Phone #: " + contact.getPhone_no());
            System.out.println(" Address: " + contact.getAddress());
            System.out.println("-------------");
}



    public void displayAllContacts() {      //display all contacts of first name, last name, phone number and address`

        for (int i = 0; i < contacts.size(); i ++) {

            Contact contact = contacts.get(i);

            System.out.println(" Name: " + contact.getFirst_name());
            System.out.println(" Last name: " + contact.getLast_name());
            System.out.println(" Phone #: " + contact.getPhone_no());
            System.out.println(" Address: " + contact.getAddress());
            System.out.println("-------------");
        }
    }

}
