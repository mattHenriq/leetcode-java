class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int length = 0;

        // pula os espaços do final
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // conta as letras da última palavra
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}
