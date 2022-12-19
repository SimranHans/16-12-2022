/*
 2.	Write a Java class Book with following features:
•	Instance variables :
o	title for the title of book of type String.
o	author for the author’s name of type String.
o	price for the book price of type double.
•	Constructor:
o	public Book (String title, Author name, double price): A constructor with parameters, it creates the Author object by setting the the fields to the passed values.
•	Instance methods:
o	public void setTitle(String title): Used to set the title of book.
o	public void setAuthor(String author): Used to set the name of author of book.
o	public void setPrice(double price): Used to set the price of book.
o	public double getTitle(): This method returns the title of book.
o	public double getAuthor(): This method returns the author’s name of book.
o	public String toString(): This method printed out book’s details to the screen
*/

class Book{
    String title;
    String author_name;
    double price;

   public Book(String title,String a_name,double price){
        this.title=title;
        this.author_name=a_name;
        this.price=price;

    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author_name=author;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public  String getTitle(){
        return title;
    }
    public  String getAuthor(){
        return author_name;
    }
    public  double getPrice(){
        return price;
    }
    public String toString(){
        return "\nName : "+author_name+
               "\nTitle :"+title+
               "\nprice :"+price;
    }
}

public class BookDemo {
    public static void main(String args[]){
        Book b1=new Book("Developing java Software","Russel Winderand",79.75);
        System.out.println(b1);
    }
    
}
