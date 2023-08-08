package basicjava;

public class Day6_BreakContinue {
    public static void main(String[] args) {

        // break statement with for loop

        // Program 1

        for (int i = 0; i <= 5; i++) {  // 1 // 2 //3
            if (i == 3) {
                break;
            }
            System.out.println(i);  //0 // 1 // 2
        }
        System.out.println("---------");


        // Program 2
        for(int i = 5; i >= 1; i--){  // 4 // 3
            System.out.println(i);   // 5 // 4 // 3
            if (i == 3){
                break;
            }
        }
        System.out.println("---------");

        // Program 3
        // continue with for
        for (int i = 1; i <= 5; i++) {  // 2 // 3 // 4 // 5
            if (i == 3) {
               continue;
            }
            System.out.println(i);    // 1 // 2 // 4 // 5
        }



    }
}
