package d6if_switch;

public class Homework02 {
    public static void main(String[] args) {

        // Example 1: Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz
        // Sunday ==> 1  . . .  Saturday ==> 7

        String dayName = "MONDAY";

        switch (dayName.toLowerCase()) {
            case "monday":
                System.out.println(1);
                break;
            case "tuesday":
                System.out.println(2);
                break;
            case "wednesday":
                System.out.println(3);
                break;
            case "thursday":
                System.out.println(4);
                break;
            case "friday":
                System.out.println(5);
                break;
            case "saturday":
                System.out.println(6);
                break;
            case "sunnday":
                System.out.println(7);
                break;
            default:
                System.out.println("Invalid Day Number...");
        }
    }
}
