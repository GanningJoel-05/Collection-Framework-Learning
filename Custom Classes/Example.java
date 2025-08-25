package customclassesinjava;

class Book {
    public String title;
    public String author;
    public Integer price;

    Book(String title, String author, Integer price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book Title = " + title + "\nAuthor Name = " + author + "\nPrice = ₹" + price + "\n";
    }
}

public class Example {
    public static void main(String[] args) {
        Book b1 = new Book("Hearts on Fire", "Joseph Vijay Kumar", 500);
        Book b2 = new Book("A Boy with a Big Dream", "Michael Robert", 1200);
        System.out.println(b1);
        System.out.println(b2);
    }
}
