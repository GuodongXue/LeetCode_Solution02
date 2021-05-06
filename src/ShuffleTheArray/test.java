package ShuffleTheArray;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] newlist = ShuffleTheArray.shuffle(nums, n);
        System.out.println(Arrays.toString(newlist));
    }
}
