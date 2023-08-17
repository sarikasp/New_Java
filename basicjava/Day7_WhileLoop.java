package basicjava;

public class Day7_WhileLoop {
    public static void main(String[] args) {

        // Program 1

        //  print hello 3 times
        // initialization
        int a1 = 1;
        while (a1 <=3){
                System.out.println("Hello");
                a1++;
        }
        System.out.println("---------");

        // 1 2 3
        // Program 2
        int a2 = 1;
        while (a2 <=3){
            System.out.println(a2);
            a2++;
        }
        System.out.println("---------");


        // Program 3
        int a3 = 1;
        while (a3 <=5){
            System.out.println(a3);
            a3++;
        }
        System.out.println("---------");


         // Program 4
        int a4 = 5;
        while (a4 >= 1){
            System.out.println(a4);
            a4--;
        }
        System.out.println("---------");


        // Program 5
        // table 2
        int a5 = 2;
        while (a5 <= 20){
            System.out.println(a5);
            a5 += 2;
        }
        System.out.println("---------");


        // Program 6
        // reverse table 5
        int a6 = 50;
        while (a6 >= 5){
            System.out.println(a6);
            a6 = a6 - 5;
        }
        System.out.println("---------");


        // Program 7
        // while with break
        int a7 = 1;
        while (a7 <= 5){
            if (a7 == 3){
                break;
            }
            System.out.println(a7);  // 1  // 2
            a7++;  // 2 // 3
        }
        System.out.println("---------");


        // Program 7
        // continue with for
        int a8 = 1;
        while(a8 <= 5) {
            if(a8 == 3) {
                a8 ++; // 4
                continue;
            }
            System.out.println(a8); // 1 // 2 // 4 // 5
            a8 ++; // 2 // 3 // 5 // 6
        }
        System.out.println("---------");


    }
}
