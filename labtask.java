import java.util.Scanner;
public class labtask {

public static final int PASSWORD_LENGTH = 10;

public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(
                "1. A password must have at least ten characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n" +
                "4. A password must contain a whitespace \n" +        
                "Input a password (You are agreeing to the above Terms and Conditions.): ");
        String s = input.nextLine();

        if (is_Valid_Password(s)) {
            System.out.println("Password is valid: " + s);
        } else {
            System.out.println("Not a valid password: " + s);
        }

    }

    public static boolean is_Valid_Password(String password) {

        if (password.length() < PASSWORD_LENGTH) return false;

        int charCount = 0;
        int numCount = 0;
        int whitespace =0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else if (Character.isWhitespace(ch)){
                whitespace++;
            }
            else return false;
        }


        return (charCount >= 2 && numCount >= 2 &&whitespace>=1);
    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }

}

  

