package basicjava;

public class Day2_Operators {
    public static void main(String[] args) {

        // Comparison ======> true or false

        // < , > , <= , >= , != , ==
        System.out.println("------ Comparison Operators ------");
        System.out.println(4 > 5); // false
        System.out.println(4 < 5);  // true
        System.out.println(4 <= 5);  // true
        System.out.println(4 >= 5); // false
        System.out.println(5 <= 5); // true
        System.out.println(5 != 5); // false
        System.out.println(5 == 5); // true


        // Logical operator
        System.out.println("------ Logical And Operators ------");

        // && - AND

        // True && True =========> True
        // False && True =========> False
        // True && False =========> False
        // False && False =========> False

        System.out.println(4 == 4 && 6 == 6); // true
        System.out.println(4 != 4 && 6 == 6); // false
        System.out.println(4 == 4 && 6 != 6); // false
        System.out.println(4 != 4 && 6 != 6); // false


        System.out.println("------ Logical OR Operators  ------");

        // || - OR

        // True || True =========> True
        // False || True =========> True
        // True || False =========> True
        // False || False =========> False

        System.out.println(4 == 4 || 6 == 6); // true
        System.out.println(4 != 4 || 6 == 6); // true
        System.out.println(4 == 4 || 6 != 6); // true
        System.out.println(4 != 4 || 6 != 6); // false

        System.out.println("------ Logical NOT Operators  ------");

        // ! - NOT
        System.out.println(!(14 == 14)); // false
        System.out.println(!(14 != 14)); // true
    }


}
