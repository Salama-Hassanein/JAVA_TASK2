public class ArrayMinMax {

  public static void main(String[] args) {
    int[] array = new int[1000];
    int min = 0;
    int max = 0;
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 1000);
      if (i == 0) {
        min = array[0];
        max = array[0];
      }
      if (array[i] < min) {
        min = array[i];
      } else if (array[i] > max) {
        max = array[i];
      }
    }
    // Arrays.sort(array);
    // int min = array[0];
    // int max = array[array.length - 1];
    System.out.println("Minimum number of array is : " + min);
    System.out.println("Maximum number of array is : " + max);
  }
}
