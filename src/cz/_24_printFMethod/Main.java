package cz._24_printFMethod;

public class Main {
    public static void main(String[] args){
        // printf() = 	an optional method to control, format, and display text to the console window
        //				two arguments = format string + (object/variable/value)
        //              System.out.printf("This is a format string",123);
        //				% [flags] [precision] [width] [conversion-character]

        //EXAMPLES
        System.out.printf("This is a format string",123);
        System.out.println();
        //%d -> show value
        //in beginning of printf -> value in front
        System.out.printf("%d This is a format string",123);
        System.out.println();
        System.out.printf("This is a format string %d",123);
        System.out.println();


        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Eda";
        int myInt = 50;
        double myDouble = 1000;

        // [conversion-character]
        System.out.printf("%b", myBoolean);
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d",myInt);
        System.out.printf("%f",myDouble);

        //[width]
        // minimum number of characters to be written as output
        // ==> do 10 spaces
        System.out.printf("Hello %10s",myString);

        //[precision]
        // sets number of digits of precision when outputting floating-point values
        // => limit digits afte,
        System.out.printf("You have this much money %.1f",myDouble);

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        System.out.printf("You have this much money %,f",myDouble);





    }
}
