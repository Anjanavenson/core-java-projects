public class Pizza {
    private int Price;
    private Boolean Veg;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backPackrice = 20;
    private int pizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isTakeAwayDone = false;

    public Pizza(Boolean veg) {
        this.Veg = veg;
        if (this.Veg) {
            this.Price = 300;
        } else {
            this.Price = 400;
        }
        pizzaPrice = this.Price;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.Price += extraToppingsPrice;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.Price += extraCheesePrice;
    }

    public void takeAway() {
        isTakeAwayDone = true;
        this.Price += backPackrice;
    }

    public void getBill() {
        String bill = " ";
        System.out.println("Price: " + pizzaPrice);
        if (isExtraToppingsAdded) {
            bill += "Extra toppings added: " + extraToppingsPrice + "\n";
        }
        if (isExtraCheeseAdded) {
            bill += "Extra cheese added: " + extraCheesePrice + "\n";
        }
        if (isTakeAwayDone) {
            bill += "Extra back pack added: " + backPackrice + "\n";
        }
        bill += "Bill: " + this.Price + "\n";
        System.out.println(bill);
    }
}
