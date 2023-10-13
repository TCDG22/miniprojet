package com.example;

public class CalculatorModel implements CalculatorModelInterface {
    private double accu;  // Accumulateur pour stocker le résultat

    public CalculatorModel() {
        this.accu = 0;  // Initialisation de l'accumulateur
    }

    @Override
    public double add(double x, double y) {
        return x + y;
    }

    @Override
    public double subtract(double x, double y) {
        return x - y;
    }

    @Override
    public double multiply(double x, double y) {
        return x * y;
    }

    @Override
    public double divide(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            // Gérer l'erreur de division par zéro ici
            return Double.NaN;  // Ou une autre valeur d'erreur
        }
    }

    @Override
    public double opposite(double x) {
        return -x;
    }

    @Override
    public void push(double value) {
        // Implémentez la logique pour empiler la valeur sur la pile
    }

    @Override
    public double pop() {
        // Implémentez la logique pour dépiler la valeur de la pile
        return 0;  // Exemple, remplacez par la logique réelle
    }

    @Override
    public void drop() {
        // Implémentez la logique pour éliminer le dernier élément de la pile
    }

    @Override
    public void swap() {
        // Implémentez la logique pour échanger les deux derniers éléments de la pile
    }

    @Override
    public void clear() {
        // Implémentez la logique pour vider la pile et réinitialiser l'accumulateur
    }
}