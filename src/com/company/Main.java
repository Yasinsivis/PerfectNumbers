package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int control=0;

        System.out.print("Lütfen Bir Sayı Giriniz:");
        int number=input.nextInt();

        for(int i=1; i<=number; i++){
            if(number%i==0){
                control+=i;
            }
        }
        if(control==(number*2)){
            System.out.println(number+" "+"Mükemmel Bir Sayıdır...");
        }
        else System.out.println(number+" "+"Mükemmel Bir Sayı Değildir");
    }
}
