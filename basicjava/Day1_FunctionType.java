package basicjava;

public class Day1_FunctionType {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        addA();  // 16
        addA();
        addA();
        System.out.println("------------");
        addB(12, 6);  // 18
        System.out.println("------------");
        int z = addC(10, 15);
        System.out.println(z);  // 25
        System.out.println(z + 10);  // 35
        System.out.println(z * 0.10);  // 2.5
    }

    //Function without parameter and without return type
    public static void addA() {
        System.out.println(8 + 8);
    }

    // Function with parameter and without return type
    public static void addB(int a, int b) {
        System.out.println(a + b);
    }
    // 100 - show
    // 100 - given

    // Function with parameter and with return type
    public static int addC(int x, int y) {
        return x + y;
    }
}
