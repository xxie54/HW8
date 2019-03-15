

public class Contact  implements Comparable<Contact> { //class Contact is used to get and set all user input of their first name, last name, address and phone number.

    private String First_name;
    private String Last_name;
    private String Address;
    private String Phone_no;

    Contact(String first_name, String last_name, String address, String phone_no) {
        this.First_name = first_name;
        this.Last_name = last_name;
        this.Address = address;
        this.Phone_no = phone_no;
    }

    /* Getters and Setters */

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone_no() {
        return Phone_no;
    }

    public void setPhone_no(String phone_no) {
        Phone_no = phone_no;
    }


    @Override
    public int compareTo(Contact au)
    {
     int first_name = this.First_name.compareTo(au.First_name);
   
     return first_name == 0 ? this.Last_name.compareTo(au.Last_name) : first_name;
    }


}

