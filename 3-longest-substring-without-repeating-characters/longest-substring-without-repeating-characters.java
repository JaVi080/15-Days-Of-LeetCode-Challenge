class Solution {
    public int lengthOfLongestSubstring(String s) {
 ArrayList<Character> arr1 = new ArrayList<>();
        int largest_substr = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If the character already exists in arr1, remove everything up to and including that character
            while (arr1.contains(ch)) {
                arr1.remove(0);  // remove the first element
            }

            arr1.add(ch);  // add the new character
            if (arr1.size() > largest_substr) {
                largest_substr = arr1.size();
            }
        }

        return largest_substr;
    }
}