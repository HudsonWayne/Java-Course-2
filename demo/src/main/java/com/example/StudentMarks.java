package com.example;

public class StudentMarks {
    public static void main(String[] args) {
        int math = 80;
        int science = 70;
        
        int total = math + science;
        double average = (double) total / 2.0;

        System.out.println("Math marks: " + math);
        System.out.println("Science marks: " + science);
        System.out.println("Total marks: " + total);
        System.out.println("Average: " + average);


        if (average >= 50){
            System.out.println("Student passed");
        }else{
            System.out.println("Student failed");
        }

    }
    
}
