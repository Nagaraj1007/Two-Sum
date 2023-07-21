import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static int[] twoSum(int[] array, int target){
        int left = 0, right = array.length - 1;
        while (left < right){
            int sum = array[left] + array[right];
            if (sum == target){
                return new int[]{left, right};
            }
            if (sum > target){
                right--;
            }
            else {
                left++;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1,4,5,7,9},1)));
    }
}