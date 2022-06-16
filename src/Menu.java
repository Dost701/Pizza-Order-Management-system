import java.util.Scanner;

public class Menu {
    public static void pizza_menu(){
        System.out.println("    PIZZA MENU    ");
        System.out.println(" 1 - Cheese Pizza");
        System.out.println(" 2 - Veggie Pizza");
        System.out.println(" 3 - Pepperoni Pizza");
        System.out.println(" 4 - Meat Pizza");
        System.out.println(" 5 - Margherita Pizza");
        System.out.println(" 6 - BBQ Chicken Pizza");
        System.out.println(" 7 - Hawaiian Pizza");
        System.out.println(" 8 - Buffalo Pizza");
        System.out.println(" 9 - Supreme Pizza");
        System.out.println(" 10 - Chicken Pizza");
    }

    public static void sandwich_menu(){
        System.out.println("    SANDWICH MENU    ");
        System.out.println(" 1 - Chicken Sandwich");
        System.out.println(" 2 - Egg Sandwich");
        System.out.println(" 3 - Seafood Sandwich");
        System.out.println(" 4 - Roast Beef Sandwich");
        System.out.println(" 5 - Ham Sandwich");
        System.out.println(" 6 - Spicy Sandwich");
    }

    public static void wellcome(){
        System.out.println("");
        System.out.println("   press 1 for Pizza");
        System.out.println("   press 2 for Sandwich");
    }
    public static void wellcome_menu(){
        System.out.println("");
        System.out.println("    WellCome to Albanian Pizza");
        System.out.println("");
        System.out.println("   What can we serve you today!");
        wellcome();
    }

    public static void bye(){
        System.out.println("");
        System.out.println("Thank you for choosing Andi's Pizza shop !");
        System.out.println("           Enjoy your meal!");
    }

    public static void repeat_main_menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Empty Menu, please enter another menu");
        System.out.println("   press 1 for Pizza");
        System.out.println("   press 2 for Sandwich");
        int nr = sc.nextInt();
        if (nr == 1 || nr == 2){
            Main.chose_menu(nr);
        }else {
            repeat_main_menu();
        }
    }
    public static void go_back(){
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("  Press 1 to go back and take other orders");
        System.out.println("  Press 2 to finish the order");

        int nr = sc.nextInt();
        switch (nr){
            case 1:
                wellcome();
                int num = sc.nextInt();
                Main.chose_menu(num);
                System.out.println("");
                break;
            case 2:
                Main.display_list_of_client();
                break;
            default:
                repeat_main_menu();
                break;
        }
    }

}
