package LinearSearch;

public class Q1_EvenDigitElements {

    public static void main(String args[]) {

        int[] nums = {2, 34, 567, 1, 32};

        int ans = findEvenCountDigit(nums, 5);

        System.out.println(ans);
    }

    static int findEvenCountDigit(int[] nums, int n) {

        int count = 0;

        for (int i = 0; i < n; i++) {

            int dcount = 0;
            int temp = nums[i];

            while (temp > 0) {
                dcount++;
                temp = temp / 10;
            }

            if (dcount % 2 == 0) {
                count++;
            }
            
        }

        return count;
    }
}