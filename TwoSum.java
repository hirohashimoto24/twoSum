public class TwoSum {

    public static void main(String[] args) {

        // Test case 1
        int[] result = twoSum(new int[]{2, 7, 11, 15}, 9);
        if (result != null) {
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("target not found");
        }

        // Test case 2
        result = twoSum(new int[]{3, 2, 4}, 6);
        if (result != null) {
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("target not found");
        }

        // Test case 3
        result = twoSum(new int[]{2, 3, 6, 6}, 20);
        if (result != null) {
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("target not found");
        }
    }

    public static int[] twoSum(int[] num, int target) {

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    return new int[]{i, j}; 
                }
            }
        }
        // If no pair is found that adds up to the target, return null
        return null;
    }
}
