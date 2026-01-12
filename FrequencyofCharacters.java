import java.util.HashMap;

class FrequencyofCharacters {
    public static void main(String[] args) {
        String s = "AbcDA";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch =s.charAt(i);
            if(map.containsKey(ch)){
                int count = map.get(ch);
                map.put(ch, count+1);
            }
            else{
                map.put(ch, 1);
            }

            }
            System.out.println(map);
        }
}
