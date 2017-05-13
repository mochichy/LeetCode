public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Stack<Integer> s = new Stack<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            int n = nums[i];
            while(!s.isEmpty() && s.peek() < n) {
                map.put(s.pop(), n);
            }
            s.push(n);
        }
        
        int[] result = new int[findNums.length];
        for(int i = 0; i < findNums.length; i++) {
            if(map.containsKey(findNums[i])) {
                result[i] = map.get(findNums[i]);
            } else {
                result[i] = -1;
            }
        }
        return result;
    }
}
