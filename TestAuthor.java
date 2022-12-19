/*
1.	Write a Java class Author with following features:
•	Instance variables :
o	firstName for the author’s first name of type String.
o	lastName for the author’s last name of type String.
•	Constructor:
o	public Author (String firstName, String lastName): A constructor with parameters, it creates the Author object by setting the two fields to the passed values.
•	Instance methods:
o	public void setFirstName (String firstName): Used to set the first name of author.
o	public void setLastName (String lastName): Used to set the last name of author.
o	public double getFirstName(): This method returns the first name of the author.
o	public double getLastName(): This method returns the last name of the author.
o	public String toString(): This method printed out author’s name to the screen
Finally write test class TestAuthor to test the functionalities you implemented.

•	Create two objects with the defined constructor.
•	Display the values of first object by using getters.
•	Display the values of the second object by using the toString() method.
•	This time create an object with default constructor. What is your observation?
•	Create one reference and try to display the values. What is your observation?
•	Assign second object to the reference and display the values.

Prints the Author’s string representation to standard output (using System.out.println).

*/


class Author{
    private String firstName;
    private String lastName;
         Author(){

         }
        Author(String first,String last){
        firstName=first;
        lastName=last;
    }

    public void setFirstName(String firstName){
            this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String toString() {
    return "\nAuthors Details: "+" \n FirstName :" +firstName+"\n lastname: "+lastName;
    }
    };

public class TestAuthor {
 public static void main(String args[]){
        Author a1=new Author("Chetan","Bhagat");
        Author a2=new Author("Rabindranath","Tagore");
        System.out.println("\ndetails of first auhor is : ");
        System.out.println("FirstName : "+a1.getFirstName());
        System.out.println("LastName : "+a1.getLastName());
        System.out.println(a2);
        Author a3=new Author();  //object with default constructor
         a3=a2;   // a2 is Reference variable;
         // now a3 is pointing to a2 object
         System.out.println("\nprinting the values using refenence varaible a3 which is pointing to a2 object: ");
         System.out.println(a3);
        
        
        

 }
    
}

