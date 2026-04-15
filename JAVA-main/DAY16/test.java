package DAY16;

import java.util.*;

public class test {
    public static void main(String[] args) {
        String s = "abcdzzzz";

        char[] result = compare(s);

        System.out.println(result);
    }

    public static char[] compare(String s) {
        char[] ch = s.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : ch) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        StringBuilder sb = new StringBuilder();

        for (char c : list) {
            for (int i = 0; i < map.get(c); i++) {
                if (sb.indexOf(String.valueOf(c)) != -1) {
                    continue;
                }
                sb.append(c);
            }
        }
        return sb.toString().toCharArray();
    }
}
