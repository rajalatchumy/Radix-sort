package radix;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RadixSortTest {

  @Test
  public void testRadixSort() {
    int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
    int[] expected = {2, 24, 45, 66, 75, 90, 170, 802};
    RadixSortTest.radixSort(arr);
    assertArrayEquals(expected, arr);
  }

  private static void radixSort(int[] arr) {
	// TODO Auto-generated method stub
	
}

@Test
  public void testRadixSortWithSingleElement() {
    int[] arr = {};
    int[] expected = {};
    RadixSortTest.radixSort(arr);
    assertArrayEquals(expected, arr);
  }

  @Test
  public void testRadixSortWithEmptyArray() {
    int[] arr = {42};
    int[] expected = {42};
    RadixSortTest.radixSort(arr);
    assertArrayEquals(expected, arr);
  }
  
  @Test
  public void testRadixSortWithSinglearray() {
	    int[] arr = {66};
	    int[] expected = {66};
	    RadixSortTest.radixSort(arr);
	    assertArrayEquals(expected, arr);
	  }
  @Test
  public void testRadixSortWithvector() {
	    int[] arr = {66};
	    int[] expected = {66};
	    RadixSortTest.radixSort(arr);
	    assertArrayEquals(expected, arr);
	  }
	  

}
