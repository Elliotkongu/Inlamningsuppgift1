import Animals.Cat;
import Animals.Dog;
import Animals.Snake;

import javax.swing.*;

/**
 * Created by Elliot Åberg Fält
 * Date: 2020-09-25
 * Time: 09:50
 * Project: Inlamningsuppgift 1
 * Copyright: MIT
 */

public class Main {
    public static void main(String[] args) {
        Dog sixten = new Dog("Sixten", 5);
        Dog dogge = new Dog("Dogge", 10);
        Cat venus = new Cat("Venus", 5);
        Cat ove  = new Cat("Ove", 3);
        Snake hypno = new Snake("Hypno", 1);
        String s = JOptionPane.showInputDialog("Vilket djur ska få mat?");
        // Anropning av samma metod leder till olika meddelande eftersom calculateFood skickar ett meddelande
        // som innehåller djurets ras och namn samt gram mat dem bör få.
        switch (s.toLowerCase()) {
            case "sixten" -> JOptionPane.showMessageDialog(null, sixten.calculateFood());
            case "dogge" -> JOptionPane.showMessageDialog(null, dogge.calculateFood());
            case "venus" -> JOptionPane.showMessageDialog(null, venus.calculateFood());
            case "ove" -> JOptionPane.showMessageDialog(null, ove.calculateFood());
            case "hypno" -> JOptionPane.showMessageDialog(null, hypno.calculateFood());
            default -> JOptionPane.showMessageDialog(null, "Vi har inget djur med det namnet.");
        }
    }
}
