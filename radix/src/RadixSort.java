import java.util.*;

public class RadixSort {

  public static void radixSort(int[] arr) {
    int maxDigit = getMaxDigit(arr);
    for (int i = 0; i < maxDigit; i++) {
      countSort(arr, i);
    }
  }

  private static int getMaxDigit(int[] arr) {
    int maxDigit = 0;
    for (int i = 0; i < arr.length; i++) {
      int numDigit = 0;
      int num = arr[i];
      while (num > 0) {
        num /= 10;
        numDigit++;
      }
      if (numDigit > maxDigit) {
        maxDigit = numDigit;
      }
    }
    return maxDigit;
  }

  private static void countSort(int[] arr, int digit) {
    int[] count = new int[10];
    int[] output = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      int num = arr[i];
      int digitVal = getDigitValue(num, digit);
      count[digitVal]++;
    }
    for (int i = 1; i < count.length; i++) {
      count[i] += count[i - 1];
    }
    for (int i = arr.length - 1; i >= 0; i--) {
      int num = arr[i];
      int digitVal = getDigitValue(num, digit);
      output[count[digitVal] - 1] = num;
      count[digitVal]--;
    }
    for (int i = 0; i < arr.length; i++) {
      arr[i] = output[i];
    }
  }

  private static int getDigitValue(int num, int digit) {
    for (int i = 0; i < digit; i++) {
      num /= 10;
    }
    return num % 10;
  }

  public static void main(String[] args) {
    int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
    radixSort(arr);
    System.out.println(Arrays.toString(arr));
  }

}
