import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;

class day3 {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            // char[] charA = (strs[i].toCharArray());
            // Arrays.sort(charA);

            // String sortedStr = new String(charA);
            int[] count = new int[26];
            for (char c : strs[i].toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int in : count) {
                sb.append('#');
                sb.append(in);

            }
            String key = sb.toString();
            // System.out.println(key);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);

        }

        return new ArrayList<List<String>>(map.values());
    }
}
