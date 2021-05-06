package KidsWithTheGreatestNumberOfCandies;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static List<Boolean> KidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> list = new LinkedList<>();
        int max = 0;
        for(int i = 0; i<candies.length; i++){
            if(max<candies[i]){
                max = candies[i];
            }
        }
        for(int i = 0; i<candies.length; i++){
            if(candies[i]+extraCandies>=max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}
