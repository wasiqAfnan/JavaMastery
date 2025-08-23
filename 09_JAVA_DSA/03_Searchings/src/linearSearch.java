public class linearSearch {
    public static void display(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    // Linear Search Implementation
    public static void linearSearchfn(int[] nums) {
        int key = 90; // the element we want to search
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                System.out.println("Element " + key + " found at index " + i);
                found = true;
                break; // stop after finding
            }
        }

        if (!found) {
            System.out.println("Element " + key + " not found in the array.");
        }

    }

    public static void main(String[] args) {
        int[] nums = { 20, 30, 40, 90, 1, 5, 8 };
        linearSearchfn(nums);
        display(nums);
    }
}
