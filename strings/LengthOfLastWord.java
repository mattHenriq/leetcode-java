class Solution {
    public int lengthOfLastWord(String s) {
        String ultimaPalavra = s.replaceAll("\\s+$", "").replaceAll(".*\\s", "");
        return ultimaPalavra.length();
    }
}
