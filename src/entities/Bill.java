package entities;

public class Bill {
    private char gender;
    private int beer;
    private int barbecue;
    private int softDrink;

    private static final double BEER_PRICE = 5.0;
    private static final double BARBECUE_PRICE = 7.0;
    private static final double SOFT_DRINK_PRICE = 3.0;
    private static final double COVER_CHARGE = 4.0;
    private static final double MALE_TICKET = 10.0;
    private static final double FEMALE_TICKET = 8.0;
    private static final double COVER_THRESHOLD = 30.0;

   
    public Bill(char gender, int beer, int softDrink, int barbecue) {
        this.gender = gender;  
        this.beer = beer;
        this.barbecue = barbecue;
        this.softDrink = softDrink;
    }

    public double cover() {
        if (feeding() > COVER_THRESHOLD) {
            return 0.0;
        } else {
            return COVER_CHARGE;  
        }
    }

    public double feeding() {
        double total = (beer * BEER_PRICE) + (barbecue * BARBECUE_PRICE) + (softDrink * SOFT_DRINK_PRICE);
        return total;
    }

    public double ticket() {
        if (gender == 'M') {
            return MALE_TICKET; 
        } else {
            return FEMALE_TICKET;  
        }
    }

    public double total() {
        double total = ticket() + feeding() + cover();
        return total;
    }
}