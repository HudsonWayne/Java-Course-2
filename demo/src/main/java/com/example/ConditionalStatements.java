package com.example;

public class ConditionalStatements {
    public static void main(String[] args) {
        int age = 18;
        if(age>=18){
            System.out.println("You are an adult");
        }

        int marks = 45;
        if(marks>=50){
            System.out.println("You passed");
        }else{
            System.out.println("You failed");
        }

        int score = 75;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }


        //SWITCH

        int day = 2;
        switch(day){
            case 1:
                System.err.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default :
                System.out.println("Unknown day");
        }


      
                
            
      



    }
}
