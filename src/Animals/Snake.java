package Animals;

/**
 * Created by Elliot Åberg Fält
 * Date: 2020-09-25
 * Time: 09:42
 * Project: Inlamningsuppgift 1
 * Copyright: MIT
 */
public class Snake extends Animal implements ICalculateFood {
    public Snake(String name, double weightInKg) {
        super(name, weightInKg);
    }

    @Override
    public String calculateFood() {
        return "Ormen " + name + " ska äta 20g ormpellets";
    }
}
