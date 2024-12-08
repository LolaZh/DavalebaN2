package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Subclass subclass = new Subclass();

        subclass.countVowel("Hello"); // უნდა დაბეჭდოსგ "ამ სტრიქონში არის 2 ხმოვანი"
        subclass.countVowel("I love testing"); // უნდა დაბეჭდოს: "ამ სტრიქონში არის 5 ხმოვანი"
    }
}
