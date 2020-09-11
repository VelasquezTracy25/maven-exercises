import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class ApacheTesting {


    public static void stringTests() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence.");
        String userInput = scanner.nextLine();

        System.out.println(StringUtils.isNumeric(userInput));
        System.out.println(StringUtils.swapCase(userInput));
        System.out.println(StringUtils.reverse(userInput));

    }

    public static void main(String[] args) {
        stringTests();
    }
}

