package basicjava;

import java.awt.*;

public class Day4_SwitchCase {

    public static void main(String[] args) {

//        // Program 1
//        String city = "pune";
//        switch (city) {
//            case "pune":
//                System.out.println("MH");
//            case "indore":
//                System.out.println("MP");
//            case "jaipur":
//                System.out.println("RJ");
//            default:
//                System.out.println("Incorrect City Name...!!!");
//        }
////

////        // Program 2
//        String city2 = "jaipur";
//        switch (city2) {
//            case "pune":
//                System.out.println("MH");
//                break;
//            case "indore":
//                System.out.println("MP");
//                break;
//            case "jaipur":
//                System.out.println("RJ");
//                break;
//            default:
//                System.out.println("Incorrect City Name...!!!");
//        }
//
//
//        // Program 3
//        String city3 = "bhopal";
//        switch (city3) {
//            case "pune":
//            case "nagpur":
//                System.out.println("MH");
//                break;
//            case "indore":
//            case "bhopal":
//                System.out.println("MP");
//                break;
//            case "jaipur":
//            case "udaipur":
//                System.out.println("RJ");
//                break;
//            default:
//                System.out.println("Incorrect City Name...!!!");
//        }
//
//
////        // Program 4
//        int a = 10;
//        int b = 20;
//        int c = 30;
//
//        if (a > b && a > c) {
//            System.out.println("A is grater");
//        } else if (b > a && b > c) {
//            System.out.println("B is grater");
//        } else {
//            System.out.println("C is grater");
//        }
//
//        // Program 5
//
////        boolean flag = true;
////        switch (flag) {
////            case a > b && a > c:
////                System.out.println("A is grater");
////            case b > a && b > c:
////                System.out.println("B is grater");
////            default:
////                System.out.println("C is grater");
////        }
//
//
        int num1 = 10;
        int num2 = 25;
        int num3 = 15;

        int greaterNumber = findGreater(num1, num2, num3);

            switch (greaterNumber) {
                case 1:
                    System.out.println(num1 + " is the greatest.");
                    break;
                case 2:
                    System.out.println(num2 + " is the greatest.");
                    break;
                case 3:
                    System.out.println(num3 + " is the greatest.");
                    break;
                default:
                    System.out.println("All numbers are equal.");
                    break;
            }
        }

        public static int findGreater(int num1, int num2, int num3) {
            if (num1 > num2 && num1 > num3) {
                return 1;
            } else if (num2 > num1 && num2 > num3) {
                return 2;
            } else if (num3 > num1 && num3 > num2) {
                return 3;
            } else {
                return 0; // If all numbers are equal
            }

        }
}
