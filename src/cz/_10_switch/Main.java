package cz._10_switch;

public class Main {
    public static void main(String[] args) {
        //switch =  statement that allows a variable to be tested for equality against a list of values
        // /-> better  than type many if, else if and so on...

        String day = "Friday";

        switch(day){
            case "Monday":
                System.out.println("It is Monday");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday!");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday!");
                break;
            case "Thursday":
                System.out.println("It is Thursday!");
                break;
            case "Friday":
                System.out.println("It is Friday!");
                break;
            case "Saturday":
                System.out.println("It is Saturday!");
                break;
            case "Sunday":
                System.out.println("It is Sunday!");
                break;
            default:
                System.out.println("This is not a day");
        }

    }
}
