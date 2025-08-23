public class linearSearch {
    public static void display(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void linearSearchfn(int[] nums) {
    }

    public static void main(String[] args) {
        int[] nums = { 20, 30, 40, 90, 1, 5, 8 };
        int target = 90; // Element to search

        int result = linearSearchfn(nums, target);
        
        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found.");
        }

        // Display array
        display(nums);
    }
}
