package romans;

import java.util.Map;
import java.util.Scanner;

public class RomansNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(getNumberFromRoman(input));
    }

    public static int getNumberFromRoman(String input) {
        Map<String, Integer> romans = Map.of("I", 1,
                "V", 5,
                "X", 10,
                "L", 50,
                "C", 100,
                "D", 500,
                "M", 1000);
        int result = 0;
        if (input.isEmpty()) {
            return -1;
        }
        String[] letters = input.split("");
        for (int i = 0; i < letters.length; i++) {
            if (!romans.containsKey(letters[i])) {
                return -1;
            }
            if (i != letters.length - 1 && romans.get(letters[i + 1]) > romans.get(letters[i])) {
                result += romans.get(letters[i + 1]) - romans.get(letters[i]);
                i++;
            } else {
                result += romans.get(letters[i]);
            }
        }
        return result;
    }
}
