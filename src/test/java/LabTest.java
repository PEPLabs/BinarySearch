
import org.junit.Assert;
import org.junit.Test;

public class LabTest {
    Lab lab = new Lab();

    /**
     * If we search for a number that exists, both search algorithms should return true. The logN solution should
     * be much faster.
     */
    @Test
    public void searchExistingNumberTest(){
        int[] nums = generateMillionNumbers();
        int target = 123456;

        long benchmarkTime = System.nanoTime();
        lab.containsN(nums, target);
//        get total elapsed time of algorithm
        benchmarkTime = System.nanoTime() - benchmarkTime;
        long algorithmTime = System.nanoTime();
        boolean expected = true;
        boolean actual = lab.containsLogN(nums, target);
        algorithmTime = System.nanoTime() - algorithmTime;
        Assert.assertEquals(expected, actual);
        System.out.println("Benchmark time: "+benchmarkTime +" nanoseconds");
        System.out.println("Your time: "+algorithmTime+" nanoseconds");
        Assert.assertTrue(algorithmTime<benchmarkTime/10);
    }

    /**
     * Not a test - just a method to generate many numbers.
     * @return a million numbers from 0 to 1000000
     */
    public int[] generateMillionNumbers(){
        int[] nums = new int[Integer.MAX_VALUE/3];
        for(int i = 0; i < nums.length; i++){
            nums[i] = i;
        }
        return nums;
    }
}
