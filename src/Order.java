import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Order {
    private double pizzaCost;
    private double sandwichCost;
    private double totalCost;
    List<String> list_of_orders = new ArrayList<>();

    public Pizza[] pizzas= {
            new Pizza(1,"Cheese Pizza",  350),
            new Pizza(2,"Veggie Pizza",  350),
            new Pizza(3, "Pepperoni Pizza",  350),
            new Pizza(4,"Meat Pizza",  350),
            new Pizza(5,"Margherita Pizza", 350),
            new Pizza(6,"BBQ Chicken Pizza",  350),
            new Pizza(7,"Hawaiian Pizza",  350),
            new Pizza(8,"Buffalo Pizza",  350),
            new Pizza(9,"Supreme Pizza",  350),
            new Pizza(10,"Chicken Pizza",  350)
    };
    List<Pizza> pizza_list = Arrays.asList(pizzas);


    public Sandwich[] sandwiches = {
            new Sandwich(1, "Chicken Sandwich", 200),
            new Sandwich(2, "Egg Sandwich", 200),
            new Sandwich(3, "Seafood Sandwich", 200),
            new Sandwich(4, "Roast Beef Sandwich", 200),
            new Sandwich(5, "Ham Sandwich", 200),
            new Sandwich(6, "Spicy Sandwich", 200)
    };
    List<Sandwich> sandwiche_list = Arrays.asList(sandwiches);



    public Order() {
    }



//    List<String> order_list = new ArrayList<>();

//    public void add_pizza(Pizza pizza, int quantity){
//        order_list.add(quantity, pizza.getPizza_type());
//    }

//    public void add_sandwich(Sandwich sandwich, int quantity){
//        order_list.add(sandwich_quantity, sandwich.getSandwich_type());
//    }

//    public List<String> getOrder_list() { return order_list; }
//    public void setOrder_list(List<String> order_list) { this.order_list = order_list; }



    public Double amount_of_pizza(Pizza pizza, int pizza_quantity) {
         pizzaCost = 0.0;
        if (pizza.getPizza_price() > 0 && pizza_quantity > 0) {
            pizzaCost = pizza.getPizza_price() * pizza_quantity;
        }
        return pizzaCost;
    }
    public Double amount_of_sandwich(Sandwich sandwich, int sandwich_quantity) {
        sandwichCost = 0.0;
        if (sandwich.getSandwich_price() > 0 && sandwich_quantity > 0) {
            sandwichCost = sandwich.getSandwich_price() * sandwich_quantity;
        }
       return sandwichCost;
    }
    public Double get_cost(){
        this.totalCost += pizzaCost + sandwichCost;
        return totalCost;
    }
    public void add_element_in_diplay_list( String element){
        list_of_orders.add(element);
    }



    public double getPizzaCost() {
        return pizzaCost;
    }
    public void setPizzaCost(double pizzaCost) {
        this.pizzaCost = pizzaCost;
    }

    public double getSandwichCost() {
        return sandwichCost;
    }
    public void setSandwichCost(double sandwichCost) {
        this.sandwichCost = sandwichCost;
    }

    public double getTotalCost() {
        return totalCost;
    }
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }



}
