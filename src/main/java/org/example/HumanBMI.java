package org.example;
/* @author Sandoplay
 * @project lab1-refactoring
 * @class HumanBMI
 * @version 1.0.0
 * @since 22.03.2025 - 16.15
 */

/**
 * Calculates and categorizes Body Mass Index (BMI).
 */
public class HumanBMI {

    private static final double UNDERWEIGHT_THRESHOLD = 18.5;
    private static final double NORMAL_THRESHOLD = 25.0;
    private static final double OVERWEIGHT_THRESHOLD = 30.0;

    private final double weightInKilograms;
    private final double heightInMeters;

    /**
     * Constructs a HumanBMI object.
     *
     * @param weightInKilograms Weight in kilograms. Must be positive.
     * @param heightInMeters  Height in meters. Must be positive.
     * @throws IllegalArgumentException If weight or height is not positive.
     */
    public HumanBMI(double weightInKilograms, double heightInMeters) {
        if (weightInKilograms <= 0 || heightInMeters <= 0) {
            throw new IllegalArgumentException("Weight and height must be positive values.");
        }
        this.weightInKilograms = weightInKilograms;
        this.heightInMeters = heightInMeters;
    }

    /**
     * Gets the weight in kilograms.
     *
     * @return The weight in kilograms.
     */
    public double getWeightInKilograms() {
        return weightInKilograms;
    }

    /**
     * Gets the height in meters.
     *
     * @return The height in meters.
     */
    public double getHeightInMeters() {
        return heightInMeters;
    }

    /**
     * Calculates the Body Mass Index (BMI).
     *
     * @return The calculated BMI.
     */
    public double calculateBMI() {
        return weightInKilograms / (heightInMeters * heightInMeters);
    }

    /**
     * Gets the BMI category based on the calculated BMI.
     *
     * @return The BMI category.
     */
    public BMICategory getBMICategory() {
        double bmi = calculateBMI();

        if (bmi < UNDERWEIGHT_THRESHOLD) {
            return BMICategory.UNDERWEIGHT;
        } else if (bmi < NORMAL_THRESHOLD) {
            return BMICategory.NORMAL;
        } else if (bmi < OVERWEIGHT_THRESHOLD) {
            return BMICategory.OVERWEIGHT;
        } else {
            return BMICategory.OBESE;
        }
    }

    /**
     * Represents the BMI categories.  Could be expanded to include
     * additional information or methods.
     */
    public enum BMICategory {
        UNDERWEIGHT,
        NORMAL,
        OVERWEIGHT,
        OBESE
    }
}