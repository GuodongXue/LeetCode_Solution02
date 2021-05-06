package ShuffleTheArray;

public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] newList = new int[nums.length];
        for(int i = 0; i<n;i++){
            newList[2*i] = nums[i];
            newList[2*i+1]= nums[i+n];
        }
        return newList;
    }
}
