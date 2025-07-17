public class Day1 {
    public static void main(String [] args){

        //Day 1

        //Write a string name and retrieve output
        String sample = "SomeString";
        System.out.println(sample);

        //Data Types
        int a = 25;
        char b = 'C';
        long c = 123456789000L;
        float f = 3.14f;
        double d =9874563210000D;
        byte e = 123;
        short g = 789;
        System.out.println(a+"\n"+b+"\n"+c+"\n"+f+"\n"+d+"\n"+e+"\n"+g);


        // String Operations

        String name = "SomeSmallString";
        String newString = "NewString";

        //1. Length
        System.out.println(name.length());

        //2. charAt
        System.out.println(name.charAt(2));

        //3.Concatenate
        System.out.println(name+newString);

        //4.Replace
        System.out.println(name.replace('S','R'));

        //5.Substring
        System.out.println(name.substring(0,9));

        //Day 2..

    }
}
