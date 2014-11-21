/*
    Name: Michael
	Assignment 2
	Due Date: Due Date: Sunday September 28 @ 11:00 pm
	Description: Design and implement a Book class.

*/
public class TestBook {

	public static void main(String[] args) {
	//Creates new instance of Book using argument constructor 
	Book mockingbird;
	
	mockingbird = new Book("To Kill a Mockingbird","Harper Lee",21.95,9,true);
	
	
	mockingbird.description();
	System.out.println("The Price of the book after a 20% discount is applied: $" + mockingbird.discountCalc(0.20));	
	
	}

}
