package org.example;

public class Main3 {

    public static void main(String[] args) {

        int[] array = {18, -3, 5, -7, 6, 89, 13, 0, -89};

        for (int i = 0; i < array.length; i++) { // შემოვიტანე გარე ციკლი, რომელიც გადაუვლის თითოეულ ელემენტს
            for (int j = i + 1; j < array.length; j++) { // შიდა ციკლი, რომელიც ადარებს მიმდინარე ელემენტს შემდეგ ელემენტთან
                if (array[i] > array[j]) { // შემოგვაქვს პირობა,თუ მიმდინარე ელემენტი მეტია მომდევნოზე, უნდა მოხდეს ელემენტებოს გაცვლა
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}