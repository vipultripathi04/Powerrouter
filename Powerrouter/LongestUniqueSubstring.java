import java.util.HashMap;

public class LongestUniqueSubstring {
    public static String findLongestUniqueSubstring(String s) {
        int n = s.length(),st = 0, e = 0, length = 0,currLength = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        while (e < n) {
            char currentChar = s.charAt(e);

            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= st) {
                st = charIndexMap.get(currentChar) + 1;
                currLength = e - st;
            }

            charIndexMap.put(currentChar, e);
            currLength++;
            e++;

            if (currLength > length) {
                length = currLength;
            }
        }

        return s.substring(st, st + length);
    }

    public static void main(String[] args) {
        String input = "Welcome to PowerRouter.";
        System.out.println("Longest unique substring: " + findLongestUniqueSubstring(input));
    }
}