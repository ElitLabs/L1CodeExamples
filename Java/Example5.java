public class Example5 { 
    public static void main(String[] args){
        //Some basic math with integers
        int a = 5;
        int b = 2;
        int c = a + b;
        int d = a - b;
        System.out.println(a + b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(d + b);

        System.out.println("Hello Integers! " + a);
        /*
         * Which of the following lines would cause errors?
         * 
         * System.out.println(a + "Hello Integers! ");
         * System.out.println(a - "Hello Integers! ");
         * System.out.println(a - b + "Hello Integers! ");
         */
    }
}