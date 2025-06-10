package com.example;

public class Loops {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            System.out.println("Count: " + i);
        }

        int i = 0;
        while(i < 5){
            System.out.println("Count: " + i);
            i++;
        }

        //Do while
        int j = 0;
        do{
            System.out.println("Count: " + j);
            j++;
        } while(j < 5);


    }
    
}
