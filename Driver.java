import java.util.Scanner;
import java.util.*;

public class Driver {      //this is the driver class with main to called the class Contact and Addressbook 

    public static void main(String[] args) {       //the main class 

boolean continues = true;
do{


   Contact one = new Contact("John", "Hong", "3253 Stockton street", "3452345355");   // I give it some contact information first.
        Contact two = new Contact("Shirley", "Xie", "712 Market street", "533463425");
        Contact three = new Contact("Alex", "Fu", "712 Keary street", "3455345335");


        Scanner scan = new Scanner(System.in);
        AddressBook book = new AddressBook();
        book.addNewContact(one);
        book.addNewContact(two);
        book.addNewContact(three);      




        System.out.println("give me your name? ");  //ask for name
        String name = scan.nextLine();  //take the input from the user and store is as the variable name 
        System.out.println("Last name?");
        String lname = scan.nextLine();
        System.out.println("address?");
        String address =scan.nextLine();
        System.out.println("phone number?");
        String num =scan.nextLine();

        book.addNewContact(new Contact(name, lname, address, num)); 

        System.out.println("This is your addressbook");
        book.displayAllContacts(); //this method call displayAllContact is to display all it have from the address book

try{
      System.out.println("Who do you want to remove?");
      String nametoremove = scan.nextLine();
      int j = book.getIndexByName(nametoremove);
      book.removeContact(j);

      System.out.println(nametoremove+" has been removed, this is your addressbook.");
      book.displayAllContacts(); //this method call displayAllContact is to display all it have from the address book


     System.out.println("What information do you want to change? First name,last name, address, or phone number? ");
     String change=scan.nextLine();

     if(change.equals("first name"))
     {
     System.out.println("Give me the name and I will change it. ");
     String firstname = scan.nextLine();
     int i = book.getIndexByName(firstname)+1;
     System.out.println("I found " + firstname +   " at index" + i); 
     System.out.println("Type the new first name.");
     String newName = scan.nextLine();
     book.updateName(i-1, newName);
     }
     else if(change.equals("last name"))
    {
     System.out.println("Give me the first name and I will change it. ");
     String lastname = scan.nextLine();
     int i = book.getIndexByName(lastname)+1;
     System.out.println("I found " + lastname +   " at index " + i);
     System.out.println("Type the new last name.");
     String newlastName = scan.nextLine();
     book.updatelastName(i-1, newlastName);

    }
    else if(change.equals("address"))
    {
     System.out.println("Who's address do you want to change? type(first name)");
     String  firstname = scan.nextLine();
     int i = book.getIndexByName(firstname)+1;
     System.out.println("I found " + firstname +   " at index" + i); 
     System.out.println("Type the new address.");
     String newaddress = scan.nextLine();
     book.updateAddress(i-1, newaddress);
    }
    else if(change.equals("phone number"))
    {
     System.out.println("Who's number you want to change, type (first name) ");
     String  firstname = scan.nextLine();
     int i = book.getIndexByName(firstname)+1;
     System.out.println("I found " + firstname +   " at index" + i); 
     System.out.println("Type the new number.");
     String newphonenumber = scan.nextLine();
     book.updatephonenumber(i-1, newphonenumber);
    }
    
    
    else
        throw new Exception("Wrong");
    

    book.displayAllContacts(); //this method call displayAllContact is to display all it have from the address book



    System.out.println("What kinds of information you want to search? type(first name,last name, address, or phone number)");
     String search=scan.nextLine();

     if(search.equals("first name"))
     {
     System.out.println("Type their first name and I will find it. ");
     String  searchfirstname = scan.nextLine();
     int i = book.getIndexByName(searchfirstname)+1;
     System.out.println("I found " + searchfirstname +   " at index " + i);
     book.displaySpci(i-1);
     }
    else if(search.equals("last name"))
    {
    System.out.println("Type their last name and I will find it.");
     String  searchlastname = scan.nextLine();
     int i = book.getIndexBylastName(searchlastname)+1;
     System.out.println("I found " + searchlastname +   " at index" + i);
     book.displaySpci(i-1);
    }
    else if(search.equals("address"))
    {
    System.out.println("Type the address and I will find it.");
     String  searchaddress = scan.nextLine();
     int i = book.getIndexByAddress(searchaddress)+1;
     System.out.println("I found " + searchaddress +   " at index " + i);
     book.displaySpci(i-1);
    }
    else if(search.equals("phone number"))
    {
    System.out.println("Type the phone number and I will find it.");
     String  searchNum = scan.nextLine();
     int i = book.getIndexByNumber(searchNum)+1;
     System.out.println("I found " + searchNum +   " at index" + i);
     book.displaySpci(i-1);
    }
    else
        throw new Exception("BAD");

}


catch(Exception e)
{
    System.out.println(e.getMessage());
    System.out.println("this program is crash, you did not type a change option.");
    e.getMessage();
}
//catch(NoSuchMethodException e)
//{
  //   System.out.println("This program is crash");
//}
finally
{
    System.out.println("below are the contacts displaied in sorted order by their first name. ");
    book.sortAddressBook();
    book.displayAllContacts(); //this method call displayAllContact is to display all it have from the address book
}


System.out.println("Type yes to exit the program, if not type no.");
String userInput=scan.nextLine();


if(userInput.equals("yes"))
{
  continues=false;
}



}while(continues==true);





}
}






