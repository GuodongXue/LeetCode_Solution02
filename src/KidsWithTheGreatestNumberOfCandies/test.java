package KidsWithTheGreatestNumberOfCandies;

import java.util.List;

public class test {
    public static void main(String[] args) {
       int[] candies = {2,3,5,1,3};
       int extraCandies= 3;
       List<Boolean> list = KidsWithTheGreatestNumberOfCandies.KidsWithCandies(candies, extraCandies);
        System.out.println(list);
    }
}
