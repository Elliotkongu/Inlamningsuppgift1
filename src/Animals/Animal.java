package Animals;

/**
 * Created by Elliot Åberg Fält
 * Date: 2020-09-25
 * Time: 09:41
 * Project: Inlamningsuppgift 1
 * Copyright: MIT
 */


public class Animal {
    // Enum för hund- och kattmat. Använder värdet toDivide för uträkningen av hur mycket mat
    // djuret ska ha.
    protected enum FoodType{DOGFOOD(100), CATFOOD(150);
        protected final int toDivide;
        FoodType(int i) {
            toDivide = i;
        }
    }
    // Alla variabler är protected och i ett eget paket för de får inte vara public (vi vill inte
    // att någon ändrar ett djurs namn eller vikt) men subklasserna får inte tillgång till name eller
    // weightInKg om de är private.
    protected String name;
    protected double weightInKg;

    public Animal(String name, double weightInKg) {
        this.name = name;
        this.weightInKg = weightInKg;
    }
}
