package OnTapChuong5;

public class Book extends Item{
    String author;
    int numberOfPages;
    String genre;

    public Book(String name, String description, String ID, int price, String author, int numberOfPages, String genre) {
        super(name, description, ID, price);
        this.author = author;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }

    @Override
    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Description: " + getDescription());
        System.out.println("ID: " + ID);
        System.out.println("Price: " + price);
        System.out.println("Author: " + author);
        System.out.println("NumberOfPages: " + numberOfPages);
        System.out.println("Genre: "  + genre);
    }
}
