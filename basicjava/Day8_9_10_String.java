package basicjava;

public class Day8_9_10_String {
    public static void main(String[] args) {

        // String
        // Properties and methods
        // Data type
        // loop
        // retrive
        // delete
        // update
        // add

       String firstName = new String("Sarika");
       String lastName = "Pansare";
       System.out.println(firstName);
       System.out.println(lastName);
       System.out.println("---------");

       String city = "Malaysia";
       System.out.println(city);
       System.out.println("---------");


//       // 0 1 2 3 4 5 6 7
//       // M a l a y s i a


        // charAt -  return character of given index
        System.out.println(city.charAt(0));
        System.out.println(city.charAt(1));
        System.out.println(city.charAt(2));
        System.out.println(city.charAt(3));
        System.out.println(city.charAt(4));
        System.out.println(city.charAt(5));
        System.out.println(city.charAt(6));
        System.out.println(city.charAt(7));
        System.out.println("---------");

        // printing every character of string

        String city2 = "Jaipur";
        for (int i = 0; i < city2.length(); i++) {
           //System.out.println(i);
            System.out.println(city2.charAt(i)); // J // a // i // p // u // r
        }
        System.out.println("---------");

        // print the characters in reverse
        // length -1 is always the last index

        for(int i = city2.length()-1  ; i >= 0 ; i--) {
            System.out.println(city2.charAt(i));  // r // u // p // i // a // J
        }
        System.out.println("---------");

        // program 2

    //         int + int            =====> int
    //         int + string         =====> string
    //         string + int         =====> string
    //         string + string      ======> string

            int a = 10;
            int b = 50;
            String c = "Hello";
            System.out.println(a+b+c);  // 60Hello
            System.out.println("---------");
            System.out.println(b+c+a);  // 50Hello10
            System.out.println("---------");
            System.out.println(c+a+b); // Hello1050
            System.out.println("--------------------------------------------------");

            String firstName1 = "Sarika";
            String lastName1 = "Pansare";

            System.out.println("My firstname is "+firstName1 +" my lastName name is "+lastName1);
            System.out.println("--------------------------------------------------");

            String greeting = "Hello ";
            String greet = greeting.concat("World !");
            System.out.println(greet);  // Hello World !
            System.out.println("-------------------");

//             charAt()
//             length()
//             contact()

            // program 3

            String firstName2 = "Sumit";
            String upperCase = firstName2.toUpperCase();
            System.out.println(upperCase); // SUMIT
            System.out.println("-------------------");

            // program 4

            String firstName3 = "SUMIT";
            String lowerCase = firstName3.toLowerCase();
            System.out.println(lowerCase);  // sumit
            System.out.println("-------------------");


            // Method
            // Action
            // Return type

            // CharAt()
            String firstName4 = "Sarika";
            char q  = firstName4.charAt(1);
            System.out.println(q);
            System.out.println("-------------------");

            // length()
            String lastName2 = "Pansare";
            int j = lastName2.length();
            System.out.println(j);
            System.out.println("-------------------");


            // substring()
            String info = "javascript";

            // 0   1   2   3  4  5  6   7   8    9
            // j   a   v   a  s  c  r   i   p    t

            String q2 = info.substring(2);
            System.out.println(q2);  // vascript
            String q3 = info.substring(2,7);
            System.out.println(q3); // vascr
            System.out.println("----------------");


            // toUpperCase()
            String city3 = "pune";
            String q4 = city3.toUpperCase();
            System.out.println(q4);
            System.out.println("---------------");


            // toLowerCase()

            String city4 = "UDAIPUR";
            String q5 = city4.toLowerCase();
            System.out.println(q5);
            System.out.println("---------------");

            //trim()
            String city5 = " Goa ";
            System.out.println(city5.length());  // 5
            String q6 = city5.trim();  // Goa
            System.out.println(q6.length()); // 3
            System.out.println("---------------");

             // startsWith()
            String city6 = "Nashik";
            boolean q7 = city6.startsWith("Na");
            System.out.println(q7);
            System.out.println("---------------");

            boolean q8 = city6.startsWith("N");
            System.out.println(q8);
            System.out.println("--------------");

            // endsWith()
            String city7 = "jaipur";
            boolean q9 = city7.endsWith("r");
            System.out.println(q9);
            System.out.println("---------------");

            boolean q10 = city7.endsWith("par");
            System.out.println(q10);
            System.out.println("---------------");

         // replace()
            String info2 = "I am learning javascript and javascript is great";
            String q11 =  info2.replace("I", "J");
            System.out.println(q11);
            System.out.println("--------------------------------------------------");


           // replaceFirst()
            String q12 = info2.replaceFirst("javascript","java");
            System.out.println(q12);
            System.out.println("--------------------------------------------------");


            // replaceAll()
            String q13 = info2.replaceAll("javascript", "java");
            System.out.println(q13);
            System.out.println("--------------------------------------------------");

            // charAt()
            String firstName6 = "Sarika";
            char a1 = firstName6.charAt(2);
            System.out.println(a1);
            System.out.println("--------------------------------------------------");

            // length()
            String lastName6 = "Pansare";
            int a2 = lastName6.length();
            System.out.println(a2);
            System.out.println("--------------------------------------------------");

            // substring()
            String info3 = "javascript";

            // 0   1   2   3  4  5  6   7   8    9
            // j   a   v   a  s  c  r   i   p    t

            String a3 = info3.substring(2);
            System.out.println(a3);
            String a4 = info3.substring(2,7);
            System.out.println(a4);
            System.out.println("--------------------------------------------------");

            // toUpperCase()
            String city8 = "pune";
            String a5 = city8.toUpperCase();
            System.out.println(a5);
            System.out.println("--------------------------------------------------");


            // toLowerCase()
            String city9 = "MALAYSIA";
            String a6 = city9.toLowerCase();
            System.out.println(a6);
            System.out.println("--------------------------------------------------");

            //trim()
            String city10 = " Goa ";
            System.out.println(city10.length());
            String a7 = city10.trim();
            System.out.println(a7.length());
            System.out.println("--------------------------------------------------");


            // startsWith()
            String city11 = "Chandrapur";
            boolean a8 = city11.startsWith("Ch");
            System.out.println(a8);

            boolean a9 = city11.startsWith("C");
            System.out.println(a9);

            // endsWith()

            String city12 = "jaipur";
            boolean a10 = city12.endsWith("r");
            System.out.println(a10);

            boolean a11 = city12.endsWith("pur");
            System.out.println(a11);

            // replace()
            String info4 = "I am learning javascript and javascript is great";
            String a12 =  info4.replace("I", "J");
            System.out.println(a12);

            // replaceFirst()
            String a13 = info4.replaceFirst("javascript","java");
            System.out.println(a13);

            // replaceAll()
            String a14 = info4.replaceAll("javascript", "java");
            System.out.println(a14);

            // contains

            String q14 = "I am learning js";
            boolean b1 = q14.contains("learning");
            System.out.println(b1);


            // indexOf()

            String city33 = "pune";
            // 0    1   2   3
            // p    u   n   e

            int b2 =  city33.indexOf("p");
            System.out.println(b2);

            // lastIndexOf()

            String city44 = "chandrapur";
            // 0  1  2  3  4  5  6  7  8  9
            // C  h  a  n  d  r  a  p  u  r

            int b3 =  city44.indexOf("a");
            System.out.println(b3);  // 2

            int b4 = city44.lastIndexOf("a");
            System.out.println(b4);  //  6


            // split()

            String infoa = "sarika-pansare-9322580270";
            String [] vl = infoa.split("-");  // {"sarika","pansare","9322580270"}
            System.out.println(vl);

            for(int i = 0 ; i < vl.length ; i++) {
             System.out.println(vl[i]);
            }

            // isEmpty()

            String h = "";
            System.out.println(h.isEmpty()); // true

            String g = " ";
            System.out.println(g.isBlank());  // true
            System.out.println(g.isEmpty()); // false

            //isEqual()

        String n= "hello";
        String m = "Hello";

        System.out.println(n.equals(m));
        System.out.println(n.equals(m));
        System.out.println(n.equalsIgnoreCase(m));

    }

}
