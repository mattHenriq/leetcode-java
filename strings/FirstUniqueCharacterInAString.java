class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> contador = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char letra = s.charAt(i);

            contador.put(letra, contador.getOrDefault(letra, 0) +1);
        }

        for(int i = 0; i < s.length(); i++){
            char letra = s.charAt(i);

            if(contador.get(letra) == 1){
                return i;
            }
        }

        return -1;
    }
}
