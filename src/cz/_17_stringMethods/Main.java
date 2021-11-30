package cz._17_stringMethods;

public class Main {
    public static void main(String[] args){
        //STRING = a reference data type that can store one or more characters
        //         reference data types have access to useful methods

        String name=" Eda     ";

        //CHECK  IF STRING EQUALS SOMETHING *EXACTLY SAME*
        boolean result = name.equals("Eda");
        System.out.println(result);

        //CHECK  IF STRING EQUALS SOMETHING *case non-sensitive*
        boolean result2 = name.equalsIgnoreCase("eda");
        System.out.println(result2);

        //GET SIZE OF STRING
        int result3 = name.length();
        System.out.println(result3);

        //GET CHARACTER OF STRING FROM ANY POSITION
        char result4 = name.charAt(1);
        System.out.println(result4);

        //GET POSITION OF CHARACTER IN STRING
        int result5 = name.indexOf("a");
        System.out.println(result5);

        //CHECK  IF STRING IS EMPTY
        boolean result6 = name.isEmpty();
        System.out.println(result6);

        //REWRITE STRING TO UPPER-CASE
        String result7 = name.toUpperCase();
        System.out.println(result7);

        //REWRITE STRING TO LOWER-CASE
        String result8 = name.toLowerCase();
        System.out.println(result8);

        //REMOVE ALL SPACES FROM STRING
        String result9 = name.trim();
        System.out.println(result9);

        //REPLACE CHARACTERS
        String result10 = name.replace('d','b');
        System.out.println(result10);
    }
}
