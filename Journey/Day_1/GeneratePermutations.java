import java.util.ArrayList;
import java.util.Scanner;

public class GeneratePermutations {

    public static void generatePermutations(String str) {
        ArrayList<String> list = new ArrayList<>();
        permute(str, list, 0, str.length() - 1);
        System.out.println(list);

    }

    public static void permute(String str, ArrayList<String> list, int start, int end) {
        if (start == end) {
            list.add(str);
            return;
        }

        for (int i = start; i <= end; i++) {
            String perm = swap(str, start, i);
            permute(perm, list, start + 1, end);
        }
    }

    public static String swap(String str, int i, int j) {
        StringBuilder sb = new StringBuilder(str);
        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
        return sb.toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        generatePermutations(str);
        sc.close();
    }
}