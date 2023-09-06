import java.util.Arrays;

public class Application {
    /**
     * You may use this main method to manually test your code in any way you like
     * This will not impact test results.
     * @param args
     */
    public static void main(String[] args) {
        Lab lab = new Lab();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 5, 7, 9, 11, 13, 17, 19, 23, 29, 31};
        int target1a = 2;
        int target1b = 6;
        int target2a = 23;
        int target2b = 8;
        System.out.println("Here is the first array: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Here is the second array: ");
        System.out.println(Arrays.toString(arr2));
        System.out.println("Here is the result of a search for "+target1a +" in arr1 (should be true):");
        System.out.println(lab.containsLogN(arr1, target1a));
        System.out.println("Here is the result of a search for "+target1b +" in arr1 (should be false):");
        System.out.println(lab.containsLogN(arr1, target1b));
        System.out.println("Here is the result of a search for "+target2a +" in arr1 (should be true):");
        System.out.println(lab.containsLogN(arr2, target2a));
        System.out.println("Here is the result of a search for "+target2b +" in arr1 (should be false):");
        System.out.println(lab.containsLogN(arr2, target2b));
    }
}
