public class Demo{

  public static void main(String[] args) {
    //Start printLoop main
      int n = 5;
      if(args != null && args.length > 0){
        n = Integer.parseInt(args[0]);
      }
      printLoop(n);
    //End printLoop main
  }

//Start printLoop
  public static void printLoop(int n){
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n - i; j++){
         System.out.print(i+1);
      }
      System.out.println("");
    }
  }
//End printLoop

//Start HW 10; Arrays to Strings, 2D Arrays
  //Start Part A
  public static String arrToString(int[] arr){
    String result = "{";
    for (int i = 0; i < arr.length; i++){
      result += arr[i];
      if (i != arr.length - 1){
        result += ", ";
      }
    }
    result += "}";
    return result;
  }

  public static String arrToString(String[] arr){
    String result = "{";
    for (int i = 0; i < arr.length; i++){
      result += arr[i];
      if (i != arr.length - 1){
        result += ", ";
      }
    }
    result += "}";
    return result;
  }

  public static String arrayDeepToString(int[][] arr){
    String[] elements;
    elements = new String[arr.length];
    for (int i = 0; i < arr.length; i++){
      elements[i] = arrToString(arr[i]);
    }
    return arrToString(elements);
  }
    //End Part A

    //Start Part B
  public static int[][] create2DArray(int rows, int cols, int maxValue){
    int[][] result;
    result = new int[rows][cols];
    for (int i = 0; i < rows; i++){
      for (int j = 0; j < cols; j++){
        result[i][j] = (int) (Math.random() * (maxValue + 1));
      }
    }
    return result;
  }

  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
    int[][] result;
    result = new int[rows][];
    for (int i = 0; i < rows; i++){
      int len = (int) (Math.random() * (cols + 1));
      result[i] = new int[len];
      for (int j = 0; j < len; j++){
        result[i][j] = (int) (Math.random() * (maxValue + 1));
      }
    }
    return result;
  }
    //End Part B
  //End HW 10; Arrays to Strings, 2D Arrays

}
