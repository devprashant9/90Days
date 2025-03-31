package Journey.Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringPermutation1 {  // generate all permutation when elements are distinct

    public static void generatePermutation(String str) {
        List<String> list = new ArrayList<>();
        permute(str.toCharArray(), 0, str.length() - 1, list);
        System.out.println(list);
        ;
    }

    public static void permute(char[] str, int start, int end, List<String> list) {
        if (start > end) {
            String res = new String(str);
            list.add(res);
            return;
        }
        for (int i = start; i <= end; i++) {
            swap(str, start, i);
            permute(str, start + 1, end, list);
            swap(str, start, i);
        }
    }

    public static void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to Generate Permutations: ");
        String str = sc.nextLine();
        System.out.println("==================");
        generatePermutation(str);
        sc.close();
    }
}