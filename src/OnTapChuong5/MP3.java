package OnTapChuong5;

public class MP3 extends Item{
    int duration;


    public MP3(String name, String description, String ID, int price, int duration) {
        super(name, description, ID, price);
        this.duration = duration;
    }

    @Override
    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Description: " + getDescription());
        System.out.println("ID: " + ID);
        System.out.println("Price: " + price);
        System.out.println("Duration: "  + duration);
    }
}
