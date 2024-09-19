package Abstrasct;

import java.sql.SQLOutput;

public class Media {
    public abstract static class Item{
        public String name;
        private String description;
        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
        protected String ID;
        int price;
        public  abstract  void showlnfo();
        public Item(String name, String description, String ID, int price) {
            this.name = name;
            this.description = description;
            this.ID = ID;
            this.price = price;
        }
    }
    public static class MP3 extends Item{
        private int duration;
        public MP3(String name, String description, String ID, int price, int duration) {
            super(name, description, ID, price);
            this.duration = duration;
        }
        @Override
        public void showlnfo() {
            System.out.println(name);
            System.out.println(getDescription());
            System.out.println(ID);
            System.out.println(price);
            System.out.println(duration);
        }
    }
    public static class Book extends Item{
        private String author;
        private int numberOfPages;
        private String genre;
        public Book(String name, String description, String ID, int price, String author, int numberOfPages, String genre) {
            super(name, description, ID, price);
            this.author = author;
            this.numberOfPages = numberOfPages;
            this.genre = genre;
        }

        @Override
        public void showlnfo() {
            System.out.println(name);
            System.out.println(getDescription());
            System.out.println(ID);
            System.out.println(price);
            System.out.println(numberOfPages);
            System.out.println(genre);
        }
    }

    public static void main(String[] args) {
        MP3 a = new MP3("hay trao cho anh", "Nhac", "1224", 20000, 12);
        Book b = new Book("Nhung ngay tho au", "Sach", "1234",
                50000, "Pham Mihh Quan", 34, "Kinh di");
        a.showlnfo();
        b.showlnfo();
    }
}
