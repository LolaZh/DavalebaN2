package org.example;

public class Subclass extends Abstract {


    public void countVowel(String text) {
        int count = 0;  //შემოვიტანოთ ხმოვნების მთვლელიi

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i); //დავატრიალოთ ციკლი რომ გადაუაროს ყველა სიმბოლოს ტექსტში


            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') { //შევამოწმოთ თითოეული სიმბოლო ხომ არ არის ხმოვანი
                count++;
            }
        }

        System.out.println("ამ სტრიქონში არის " + count + " ხმოვანი");
    }
}
