import java.lang.reflect.Array;
import java.util.*;

public class target {
    public static void main(String[] args) {

int [] nums= {9,7,2,15};

        System.out.println(Arrays.toString(twoSum(nums,9)));
    }


        //nums = [2,7,11,15], target = 9

        public static int[] twoSum(int[] nums, int target) {
            for (int i = 0; i <nums.length ; i++) {
                for (int j = 0; j < nums.length ; j++) {
                    if (nums[j]==target-nums[i]){
                    return new int[]{i,j};
                    }
                }
                }

            return null;
            }


        }









