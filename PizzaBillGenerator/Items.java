import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Items {

        List<String> itemsName = new ArrayList<>();


        public void showItemsName() throws Exception {
            itemsName.add("Pizza");
            itemsName.add("DeluxPizza");
            System.out.println(itemsName);
            Scanner sc = new Scanner(System.in);
            String itemsNameUserInput = sc.next();

            if(itemsNameUserInput.equals("Pizza")){
                Pizza pizza = new Pizza(true);
                pizza.addExtraToppings();
                pizza.addExtraCheese();
                pizza.takeAway();
                pizza.getBill();
            }
            else if(itemsNameUserInput.equals("DeluxPizza")){
                DeluxPizza dp = new DeluxPizza(true);
                dp.addExtraToppings();
                dp.addExtraCheese();
                dp.getBill();
            }
            else{
                throw new Exception("we don't have a item like that");
            }

            System.out.println();
        }
    }
