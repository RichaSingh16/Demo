import java.util.LinkedHashSet;

class Book1 {  
int id;  
String name;  
int quantity;  
public Book1(int id, String name, int quantity) {  
    this.id = id;  
    this.name = name;  
      
    this.quantity = quantity;  
}  
}  

public class LinkedHashSetExample {

	public static void main(String[] args) {
		  LinkedHashSet<Book1> hs=new LinkedHashSet<Book1>();  
		    //Creating Books  
		    Book1 b1=new Book1(101,"Let us C",2);  
		    Book1 b2=new Book1(102,"Data Communications & Networking",3);  
		    Book1 b3=new Book1(103,"Operating System",6);  
		    //Adding Books to hash table  
		    hs.add(b1);  
		    hs.add(b2);  
		    hs.add(b3);  
		    //Traversing hash table  
		    for(Book1 b:hs){  
		    System.out.println(b.id+" "+b.name+" "+b.quantity);  
		    }  
		}  
		}  