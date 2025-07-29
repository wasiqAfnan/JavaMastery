import java.util.Scanner;
import java.util.ArrayList;

public class occuranceOfChar {
    public static void findOccurance(String s) {
        ArrayList<Integer> occurance = new ArrayList<>();
        ArrayList<Character> uniqueChar = new ArrayList<>();
        int count = 0;
        char[] str = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            count = 1;
            char curr = str[i];
            if (uniqueChar.indexOf(curr) == -1) {
                uniqueChar.add(curr);
                for (int j = i + 1; j < s.length(); j++) {
                    if (curr == str[j]) {
                        count++;
                    }
                }
                occurance.add(count);
            }
            else{
                continue;
            }
        }

        System.out.println(occurance);
        System.out.println(uniqueChar);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s1 = sc.nextLine();
        findOccurance(s1);
        sc.close();
    }
}
