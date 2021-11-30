package cz._18_wrapperClasses;

public class Main {
    public static void main(String[] args){
        // wrapper class =  provides a way to use primitive data types as reference data types
        // PRO
        //     reference data types contain useful methods
        //     can be used with collections (ex.ArrayList)
        // CONTRA-PRO
        //     slower to access

        //primitive  //wrapper
        //---------  //-------
        // boolean  Boolean
        // char     Character
        // int      Integer
        // ...      ...

        // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

        //autoboxing ... converting from primitive datatype
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Eda";

        //unboxing -> still behave as a primitive datatype even if it s not...
        if (a==true){
            System.out.println("This is true");
        }


    }
}
