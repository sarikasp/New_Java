package basicjava;

public class Day3_IfElse {
    public static void main(String[] args) {

        // numT > 0 && numT <= 5 =======> 10 % discount
        // numT > 5 && numT <= 10 =======> 20 % discount
        // numT > 10 =======> 30 % discount

        // Program 1
        int num = 11;
        if(num>=0 && num<= 5){
            System.out.println("10 % discount");
        }
        if(num>5 && num<= 10){
            System.out.println("20 % discount");
        }
        if(num>10){
            System.out.println("30 % discount");
        }

        // Program 2
//        int num = -16;
        if(num>=0 && num<= 5){
            System.out.println("10 % discount");
        }
        else if(num>5 && num<= 10){
            System.out.println("20 % discount");
        }
        else if(num>10){
            System.out.println("30 % discount");
        }
        else {
            System.out.println("Incorrect Output");
        }

        // Program 3
        int marks = 85;
        if(marks>90){
            System.out.println("Grade - A");
        }
        if(marks>80){
            System.out.println("Grade - B");
        }
        if(marks>60){
            System.out.println("Grade - C");
        }

        // Program 4
//        int marks = 54;
        if(marks>90){
            System.out.println("Grade - A");
        }
        else if(marks>80){
            System.out.println("Grade - B");
        }
        else if(marks>60){
            System.out.println("Grade - C");
        }
        else{
            System.out.println("Fail Please try again....!!!");
        }

        // Program 5
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println("A is greater than B");
        } else {
            System.out.println("B is greater than A");
        }

        // Program 6
        int x = 10;
        int y = 20;
        int z = 30;
        if (x > y && x > z) {
            System.out.println("X is greater than the other two");
        } else if (y > x && y > z) {
            System.out.println("Y is greater than the other two");
        } else {
            System.out.println("Z is greater than the other two");
        }

        // Program 7
        int n = 8;
        int m = 20;
        if (n > m) {
            System.out.println("N is greater than M");
        } else {
            System.out.println("M is greater than N");
        }
//      condition ? true : false
        String res = n>m ? "N is greater than M" : "M is greater than N";
        System.out.println(res);

        // Program 8
        int age = 24;
        String result = age > 18 ? "You can Drive..!!" : "You can't Drive..!!";
        System.out.println(result);
    }
}
