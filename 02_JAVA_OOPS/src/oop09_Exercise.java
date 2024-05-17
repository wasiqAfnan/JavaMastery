// create a class as "Books" in which 3 attributes are there 'book_name','book_author' and 'book_price'. then create a function that sets all these attributes and also create a fucntion that prints these attributes. After this create a object and set the variables and then display the values of the variables

class Books{
    String book_name;
    String book_author;
    double book_price;

    void setDetails(String name,String author,double price){
        book_name = name;
        book_author = author;
        book_price = price;
    }

    void displayDetails(){
        System.out.println("BOOK Name: "+book_name);
        System.out.println("BOOK Author: "+book_author);
        System.out.println("BOOK Price: "+book_price);
    }
}



public class oop09_Exercise {
    public static void main(String[] args) {
        // First Object
        Books b1 = new Books();
        b1.setDetails("Game Of Thrones","John R.R.Martin",3050.00);
        b1.displayDetails();

        //Second Object
        Books b2 = new Books();
        b2.setDetails("Rich Dad Poor Dad", "Robert Kiyosaki", 350.25);
        b2.displayDetails();
    }    
}
