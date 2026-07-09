class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> numeros = new HashSet<>();

        for(int num : nums){
            if(numeros.contains(num)){
                return true;
            }

            numeros.add(num);
        }

        return false;
    }
}
