package helloworld;
import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> S = new ArrayList<Integer>();
		S.add(1);
		S.add(0);
		S.add(2);
		S.add(3);
		Solution sol = new Solution();
		ArrayList<ArrayList<Integer>> answer = new ArrayList<ArrayList<Integer>>();
		answer = sol.permute(S);
		System.out.println(answer);
	}

}
class Solution {
    /**
     * @param nums: A list of integers.
     * @return: A list of permutations.
     */
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
        // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(nums == null || nums.size() == 0){
            return result;
        }
        result.add(new ArrayList<Integer>());
        for(int j = 0; j < nums.size(); j++){
            result = permuteHelper(result, nums, j);
        }
        //result.remove(0);
        return result;
    }
    public ArrayList<ArrayList<Integer>> permuteHelper(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> nums, int pos){
        ArrayList<ArrayList<Integer>> result2 = new ArrayList<ArrayList<Integer>>(result);
        for(ArrayList<Integer> element : result){
            for(int i = 0; i < element.size() + 1; i++){
                ArrayList<Integer> element2 = new ArrayList<Integer>(element);
                element2.add(i, new Integer(nums.get(pos)));
                result2.add(element2);
                
            }
            result2.remove(0);
        }
        return result2;
    }
}
