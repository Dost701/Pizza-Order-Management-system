import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static Order order = new Order();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu.wellcome_menu();
        int menu_choise = sc.nextInt();
        chose_menu(menu_choise);
    }

    public static void chose_menu(int selectet_menu){
        switch (selectet_menu){
            case 1:
                Menu.pizza_menu();
                chose_pizza();
                break;
            case 2:
                Menu.sandwich_menu();
                chose_sandwich();
                break;
            default:
                Menu.repeat_main_menu();
                break;
        }
    }

    public static void chose_pizza(){
        Scanner sc = new Scanner(System.in);
        int select_pizza = sc.nextInt();

        while (select_pizza > 10 || select_pizza < 1) {
            System.out.println("Empty Menu, please select another pizza");
            select_pizza = sc.nextInt();
            if (select_pizza > 0 && select_pizza < 11){
                continue;
            }
            break;
        }

        System.out.println("Enter the quantity: ");
        int quantity = sc.nextInt();

        for (int i = 0; i <= order.pizza_list.size(); i++) {
            if (select_pizza == order.pizza_list.get(i).getId()) {
                    /*order.add_pizza(order.pizza_list.get(i), quantity);*/

                order.amount_of_pizza(order.pizza_list.get(i), quantity);
                order.get_cost();

                String client_oreder = "Your order is: " + order.pizza_list.get(i).getPizza_type() + "  quantity: " + quantity
                        + "    product price: " + order.pizza_list.get(i).getPizza_price() + "   price: " + order.getPizzaCost() + " Lek";

                order.add_element_in_diplay_list(client_oreder);
                order.setPizzaCost(0);
                break;
            }
        }
        Menu.go_back();
    }

    public static void chose_sandwich(){
        Scanner sc = new Scanner(System.in);
        int select_sandwich = sc.nextInt();

        while (select_sandwich > 6 || select_sandwich < 1) {
            System.out.println("Empty Menu, please select another sandwich");
            select_sandwich = sc.nextInt();
            if (select_sandwich > 0 && select_sandwich < 7){
                continue;
            }
            break;
        }

        System.out.println("Enter the quantity: ");
        int quantity = sc.nextInt();

        for (int i = 0; i <= order.sandwiche_list.size(); i++){
            if (select_sandwich == order.sandwiche_list.get(i).getId()){
                /*order.add_sandwich(order.sandwiche_list.get(i), quantity);*/

                order.amount_of_sandwich(order.sandwiche_list.get(i), quantity);
                order.get_cost();

                String client_order = "Your order is: " + order.sandwiche_list.get(i).getSandwich_type() + "  quantity: " + quantity
                        + "    product price: " + order.sandwiche_list.get(i).getSandwich_price() + "   price: " + order.getSandwichCost() + " Lek";

                order.add_element_in_diplay_list(client_order);
                order.setSandwichCost(0);
                break;
            }
        }
        Menu.go_back();
    }

    public static void display_list_of_client(){

        for (int i = 0; i< order.list_of_orders.size(); i++){
            System.out.println(order.list_of_orders.get(i));
        }

        System.out.println("Total cost is: " + order.getTotalCost() + " Lek");
        Menu.bye();
    }

}
