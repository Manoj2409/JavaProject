import org.junit.Test;
import static org.junit.Assert.*;
public class test {


    public class RotatedSortedArrayTest {

        @Test
        public void testValueInLeftSortedPart() {
            int[] arr = {4, 5, 6, 1, 2, 3};
            assertTrue(rotatedSortedArray(arr, 0, arr.length - 1, 5));
        }

        @Test
        public void testValueInRightSortedPart() {
            int[] arr = {4, 5, 6, 1, 2, 3};
            assertTrue(rotatedSortedArray(arr, 0, arr.length - 1, 2));
        }

        @Test
        public void testValueNotPresent() {
            int[] arr = {4, 5, 6, 1, 2, 3};
            assertFalse(rotatedSortedArray(arr, 0, arr.length - 1, 7));
        }

        @Test
        public void testValueAtMidpoint() {
            int[] arr = {6, 7, 1, 2, 3, 4, 5};
            assertTrue(rotatedSortedArray(arr, 0, arr.length - 1, 2));
        }

        @Test
        public void testFullySortedArray() {
            int[] arr = {1, 2, 3, 4, 5};
            assertTrue(rotatedSortedArray(arr, 0, arr.length - 1, 3));
        }

        @Test
        public void testSingleElementPresent() {
            int[] arr = {5};
            assertTrue(rotatedSortedArray(arr, 0, arr.length - 1, 5));
        }

        @Test
        public void testSingleElementAbsent() {
            int[] arr = {5};
            assertFalse(rotatedSortedArray(arr, 0, arr.length - 1, 3));
        }

        @Test
        public void testDuplicatesWithFalsePositive() {
            int[] arr = {2, 2, 2, 2};
            // The code incorrectly returns `true` here due to the final `return true` statement.
            // This test will fail, exposing the logical error.
            assertFalse(rotatedSortedArray(arr, 0, arr.length - 1, 3));
        }

        @Test
        public void testValueInDuplicateArray() {
            int[] arr = {3, 3, 3, 1, 2, 3};
            // The code may return `true` even if the value exists, but for the wrong reason.
            // This test passes coincidentally but hides the underlying bug.
            assertTrue(rotatedSortedArray(arr, 0, arr.length - 1, 1));
        }
    }
}
