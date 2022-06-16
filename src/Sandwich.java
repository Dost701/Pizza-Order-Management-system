public class Sandwich {
    private int id;
    private String sandwich_type;
    private double sandwich_price;

    public Sandwich(int id, String sandwich_type, double sandwich_price) {
        this.id = id;
        this.sandwich_type = sandwich_type;
        this.sandwich_price = sandwich_price;
    }

    public String getSandwich_type() {
        return sandwich_type;
    }
    public double getSandwich_price() {
        return sandwich_price;
    }
    public int getId() {
        return id;
    }

}
