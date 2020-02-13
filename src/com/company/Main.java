package com.company;

public class Main {

    static final double GRAVITY = -9.81;
    private static double x;

    public static void main(String[] args) {
        int fallingTime = args.length > 0 ? Integer.parseInt(args[0]) : 0;
        double initialPosition = args.length > 1 ? Double.parseDouble(args[1]) : 0;
        double initialVelocity = args.length > 2 ? Double.parseDouble(args[2]) : 0;
        double finalPosition = calculateFinalPosition(fallingTime, initialVelocity, initialPosition);

        System.out.println("Position in " + fallingTime + " seconds :" +
                finalPosition);
        //  Hello World!!!

    }
    private static double calculateFinalPosition(int t, double v0, double x0){
        x = (t^2) * GRAVITY * 0.5 + v0 * t + x0;




        return v0;
    }
}
