package com.company;

public class Main {

    public static void main(String[] args) {
	int temp = 5;
    int age = 20;
        System.out.println(nameofmetod(temp,age));
        System.out.println(nameofmetod(20,6));
        System.out.println(nameofmetod(20,7));
        System.out.println(nameofmetod(- 40,6));
        System.out.println(nameofmetod(25,54));
        System.out.println(nameofmetod(23,45));


    }

    private static String nameofmetod(int temp, int age) {
        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30 ){
            return "Можно идти гулять";
        }else  if (age > 0 && age <= 20 && temp >= 0 && temp <=28 ){
            return "можно идти гулять";
        }else if (age >= 45 && temp >= -10 && temp <=25){
            return "Можно идти гулять";
        }else
            return "остовайся дома";
    }
}
