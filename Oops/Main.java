
class Book {
    String title;
    String author;

    // Parameterized Constructor
    Book(String t, String a) {
        title = t;
        author = a;
    }

    // Copy Constructor
    Book(Book c) {
        this.title = c.title;
        this.author = c.author;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

}

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Java Programming", "James Gosling");
        Book b2 = new Book(b1); // copy constructor b1

        b1.display();
        b2.display();

    }

}
