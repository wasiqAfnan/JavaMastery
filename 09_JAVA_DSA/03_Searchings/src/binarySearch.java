class binarySearch {
    // Binary search function
    public static int binarySearchFn(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2; // Find middle index

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50, 60, 70 }; // Sorted array (important for binary search)
        int target = 40;

        int result = binarySearchFn(nums, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found.");
        }
    }
}
