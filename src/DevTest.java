import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Testing getNonZeroLenString:");
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("You entered: " + name);

        System.out.println("Testing getInt:");
        int age = SafeInput.getInt(in, "Enter your age");
        System.out.println("You entered: " + age);

        System.out.println("Testing getDouble:");
        double wage = SafeInput.getDouble(in, "Enter your wage");
        System.out.println("You entered: " + wage);

        System.out.println("Testing getRangedInt:");
        int dieRoll = SafeInput.getRangedInt(in, "Roll a d6", 1, 6);
        System.out.println("You rolled: " + dieRoll);

        System.out.println("Testing getRangedDouble:");
        double price = SafeInput.getRangedDouble(in, "Enter price", 0.50, 10.00);
        System.out.println("Price: " + price);

        System.out.println("Testing getYNConfirm:");
        boolean confirm = SafeInput.getYNConfirm(in, "Are you sure?");
        System.out.println("Choice was: " + confirm);

        System.out.println("Testing getRegExString:");
        String ssn = SafeInput.getRegExString(in, "Enter SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN: " + ssn);
    }
}