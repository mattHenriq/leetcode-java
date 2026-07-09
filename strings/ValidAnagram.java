class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> contador = new HashMap<>();

        for(char letra : s.toCharArray()){
            contador.put(letra, contador.getOrDefault(letra, 0) + 1);
        }

        for(char letra : t.toCharArray()){
            if(!contador.containsKey(letra)){
                return false;
            }

            contador.put(letra, contador.get(letra) - 1);

            if(contador.get(letra) < 0){
                return false;
            }
        }

        return true;

    }
}
