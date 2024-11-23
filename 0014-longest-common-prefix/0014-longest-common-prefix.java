public class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        List<Character> finalList = new ArrayList<>();
        
        for (int i = 0; i < strs[0].length(); i++) {
            if (strs[0].charAt(i) != strs[strs.length - 1].charAt(i)) {
                break;
            }
            finalList.add(strs[0].charAt(i));
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : finalList) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}