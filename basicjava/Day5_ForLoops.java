package basicjava;

public class Day5_ForLoops {
    public static void main(String[] args) {

        // Program 1
        // Print Hello 3 times
        for(int i = 1; i <=3; i++){
            System.out.println("Hello");
        }
        System.out.println("---------");

        // Program 2
        // 1 to 3  // 1 // 2 // 3
        for(int i = 1; i <=3; i++){
            System.out.println(i);
        }
        System.out.println("---------");


        // Program 3
        // 1 to 5  // 1 // 2 // 3 // 4 // 5
        for(int i = 1; i <=5; i++){
            System.out.println(i);
        }
        System.out.println("---------");

        // Program 4
        // 5 to 1   // 5 // 4 // 3 // 2 // 1
        for(int i = 5; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println("---------");

        // Program 5
        // Table 2  // 2 // 4 ------------- 20
        for(int i = 2; i <=20; i=i+2){
            System.out.println(i);
        }
        System.out.println("---------");


        for(int i = 5; i <=50; i=i+5){
            System.out.println(i);
        }
        System.out.println("---------");


        // Program 6
        // Reverse Table 5  // 50 // 45  ------------5
        for(int i = 50; i >=5; i = i-5){
            System.out.println(i);
        }
    }
}
