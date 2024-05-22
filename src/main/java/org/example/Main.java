package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter width of rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("enter height of rectangle: ");
        double height = scanner.nextDouble();
        System.out.println("area of rectangle: " + area(width, height));

        System.out.println("enter radius of circle: ");
        double radius = scanner.nextDouble();
        System.out.println("area of circle: " + area(radius));

    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23 || !isBarking) {
            return false;
        }
        return clock >= 20 || clock < 8;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (13 < firstAge && firstAge <= 19) || (13 < secondAge && secondAge <= 19) || (13 < thirdAge && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int lowestTemp = 25;
        int highestTemp = isSummer ? 45 : 35;

        return temp <= highestTemp && temp > lowestTemp;
    }


    public static double area(double width, double height) {
       if(width<0 || height<0){
           System.out.println("width veya height sıfırdan küçük olamaz!");
           return -1;
       }
       return width*height;
    }

    public static double area(double radius) {
       if(radius<0){
           System.out.println("Radius cannot be less than zero!");
           return -1;
       }
       return Math.PI*Math.pow(radius,2);
    }
}
