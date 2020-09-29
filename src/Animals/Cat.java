package Animals;

/**
 * Created by Elliot Åberg Fält
 * Date: 2020-09-25
 * Time: 09:42
 * Project: Inlamningsuppgift 1
 * Copyright: MIT
 */
public class Cat extends Animal implements ICalculateFood {
    public Cat(String name, double weightInKg) {
        super(name, weightInKg);
    }

    @Override
    public String calculateFood() {
        double gToEat = (weightInKg * 1000) / FoodType.CATFOOD.toDivide;
        return String.format("Katten " + name + " ska äta %.2f" + "g kattmat", gToEat);
    }
}
