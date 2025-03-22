package org.example;
/* @author Sandoplay
 * @project lab1-refactoring
 * @class Main
 * @version 1.0.0
 * @since 22.03.2025 - 16.15
 */

public class Main {
    public static void main(String[] args) {
        // Example usage with different values
        HumanBMI person1 = new HumanBMI(80, 1.80);
        System.out.println("Person 1 BMI: " + person1.calculateBMI() + ", Category: " + person1.getBMICategory());

        HumanBMI person2 = new HumanBMI(60, 1.75);
        System.out.println("Person 2 BMI: " + person2.calculateBMI() + ", Category: " + person2.getBMICategory());

        HumanBMI person3 = new HumanBMI(100, 1.90);
        System.out.println("Person 3 BMI: " + person3.calculateBMI() + ", Category: " + person3.getBMICategory());

        // Example of handling invalid input
        try {
            HumanBMI invalidPerson = new HumanBMI(-70, 1.70); // Negative weight
        } catch (IllegalArgumentException e) {
            System.err.println("Error creating HumanBMI: " + e.getMessage());
        }
    }
}