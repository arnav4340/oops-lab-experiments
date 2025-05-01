public class Book {
    private String title;
    private String author;
    private int publicationYear;

    
    public Book() {
        this.title = "Untitled";
        this.author = "Unknown Author";
        this.publicationYear = -1; 
    }

    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.publicationYear = -1;
    }

    
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    
    public void displayDetails() {
        if (publicationYear != -1) {
            System.out.println("Title: " + title + ", Author: " + author + ", Year: " + publicationYear);
        } else {
            System.out.println("Title: " + title + ", Author: " + author);
        }
    }

    public static void main(String[] args) {
        
        Book book1 = new Book(); 
        Book book2 = new Book("1984", "George Orwell"); 
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 1960); 

        
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
    }
 
} 
 
