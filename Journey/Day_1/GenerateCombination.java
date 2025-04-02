import java.util.ArrayList;
import java.util.Scanner;

public class GenerateCombination {

    public static void generateCombination(String str) {
        ArrayList<String> list = new ArrayList<>();
        
        StringBuilder current = new StringBuilder();
        
        combine(str.toCharArray(), list, current, 0);
        
        System.out.println(list);
    }

    public static void combine(char[] str, ArrayList<String> list, StringBuilder current, int i) {
        if (i == str.length) {  // Stop when all characters are processed
            if (current.length() > 0) {
                list.add(current.toString()); // Add only non-empty combinations
            } else if(current.length() == 0) {
                list.add(null);
            }
            return;
        }

        // Include current character
        current.append(str[i]);
        combine(str, list, current, i + 1);

        // Backtrack (remove last character) and exclude current character
        current.deleteCharAt(current.length() - 1);
        combine(str, list, current, i + 1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        generateCombination(str);
        sc.close();
    }
}
