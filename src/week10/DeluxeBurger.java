package week10;

public class DeluxeBurger extends Hamburger{
    private static final String Name = "Deluxe";
    private static final String Meat = "Sausage & Bacon";
    private static final double Price = 14.54;
    private static final String BreadRollType = "White";
    public DeluxeBurger() {
        super(Name, Meat, Price, BreadRollType);
        System.out.println("Added Chips for an extra 2.75");
        System.out.println("Added Drink for an extra 1.81");
        this.price+=2.75+1.81;
    }

}