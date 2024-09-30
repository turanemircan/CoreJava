package d15arraylist_methodcreation;

public class Socrative01 {
    public static void main(String[] args) {
        String s = "Marra";
        for (int i = s.length() - 1; i >= 0; i--) {
            String c = s.substring(i, i + 1);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.println(c);
            }
        }

        System.out.println("-----------------");

        String result = "";

        for (int i = 1; i < 4; i++) {
            for (int j = (5 - i); j > 1; j--) {
                result = result + (i + j);
            }
            System.out.println(result);
            result = "";
        }
    }
}
