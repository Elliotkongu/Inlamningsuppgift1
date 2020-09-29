package Animals;

/**
 * Created by Elliot Åberg Fält
 * Date: 2020-09-25
 * Time: 09:42
 * Project: Inlamningsuppgift 1
 * Copyright: MIT
 */
public class Dog extends Animal implements ICalculateFood {
    public Dog(String name, double weightInKg) {
        super(name, weightInKg);
    }

    @Override
    public String calculateFood() {
        double gToEat = (weightInKg * 1000) / FoodType.DOGFOOD.toDivide;
        return String.format("Hunden " + name + " ska äta %.2f" + "g hundmat", gToEat);
    }
}
