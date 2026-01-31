import java.util.Arrays;
import java.util.Scanner;

public class test {
    static void main(String[] args) {
        Solution tester = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i=0;i<n;i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(Arrays.toString(tester.twoSum(nums, target)));

    }
}
