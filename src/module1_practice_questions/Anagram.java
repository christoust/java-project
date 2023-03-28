package module1_practice_questions;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "sdsi";
        String str2 = "sdsi";

        if (str1.length() != str2.length()) {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
            return;
        }

        // Create arrays to store the frequency of each character in the two strings
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Iterate through each character in the two strings and update the frequency arrays
        for (int i = 0; i < str1.length(); i++) {
//        	System.out.println('a'-'a');
            freq1[str1.charAt(i) - 'a']++;
            freq2[str2.charAt(i) - 'a']++;
        }

        // Check if the frequency arrays are equal
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                System.out.println(str1 + " and " + str2 + " are not anagrams");
                return;
            }
        }

        System.out.println(str1 + " and " + str2 + " are anagrams");
        
        for(int i:freq1)
        {
        	System.out.print(i);
        
        }
        System.out.println("");
        for(int i:freq2)
        {
        	System.out.print(i);
        }
    }
}
