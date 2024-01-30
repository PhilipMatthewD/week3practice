import java.util.Scanner;
import java.lang.Math;

import static java.lang.Double.parseDouble;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to do?");
        String userInput = input.nextLine();
        if (userInput == "circle"){
            Scanner inputNum = new Scanner(System.in);
            System.out.println("What is the radius?");
            double radius = parseDouble(inputNum.nextLine());
            System.out.println(areaCircle(radius));
        }

        /*
        int a;
        String b;
        System.out.println("What do you want to square?");
        a = input.nextInt();
        System.out.println(squareNum(a));
        System.out.println("What is your name?");
        b = input.nextLine();
        hello(b);
        helloWorld();
        hello("makima", "brett");
        */

    }
    static int areaSquare(int a, int b){ // a = sideA, b = sideB
        int areaSquare = a*b;
        return areaSquare;
    }
    static double areaTriangle(double a, double b){ // a = height, b = base
    double areaTriangle = (a*b)/2;
    return areaTriangle;
    }
    static double areaCircle(double a){ // a = radius
        double areaCircle = (a*a*Math.PI);
        return areaCircle;
    }
    /*
    static void helloWorld(){
        System.out.println(">w<");
    }
    static void hello(String b){
        System.out.println("Hello " + b);
    }
    static int squareNum(int a){
        a = a*a;
        return a;
    }
     */
}