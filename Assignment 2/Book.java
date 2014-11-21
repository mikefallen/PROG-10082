/*
    Name: Michael 
	Assignment 2
	Due Date: Due Date: Sunday September 28 @ 11:00 pm
	Description: Design and implement a Book class.

*/



public class Book {
	
	private String 		title;
	private String 		author;
	private double		price;
	private int	   		rating;
	private boolean 	hardcover;
	
	
	
	
		public Book() {
			
			title		=		"";
			author		=		"";
			price		=		0.0;
			rating		=		0;
			hardcover	=		false;
		}
		
		public Book(String t,String a,double p,int r,boolean h){
			title		=		t;
			author		=		a;
			price		=		p;
			rating		=		r;
			hardcover	=		h;
		}
		
		//Method accepts discount % as double (eg 0.75 =75%)
		public double discountCalc(double d){		 
			double discountAmount = price*d;
			double discountPrice = price - discountAmount;
			return discountPrice;
			
		}
		//Method prints description of book object
		public void description(){
			System.out.println("Book Description:");
			System.out.println(title+" by "+author);
			System.out.println("Suggested Retail Price: $"+price);
			System.out.println("User Rating: "+rating+"/10");
			System.out.println("Hardcover Version? "+hardcover);
			System.out.println();
			
		}
		// Getter & Setter methods
		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public int getRating() {
			return rating;
		}

		public void setRating(int rating) {
			this.rating = rating;
		}

		public boolean isHardcover() {
			return hardcover;
		}

		public void setHardcover(boolean hardcover) {
			this.hardcover = hardcover;
		}

		
}
