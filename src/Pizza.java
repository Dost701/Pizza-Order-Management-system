import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Pizza {
    private int id;
    private String pizza_type;
    private double pizza_price;

    public Pizza() {
    }


    public Pizza(int id, String pizza_type, double pizza_price) {
        this.id = id;
        this.pizza_type = pizza_type;
        this.pizza_price = pizza_price;
    }


    public String getPizza_type() {
        return pizza_type;
    }
    public double getPizza_price() {
        return pizza_price;
    }
    public int getId() {
        return id;
    }
}
