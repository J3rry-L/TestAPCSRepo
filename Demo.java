
public class Demo{

    public static void main(String[] args) {
        int n = 5;
        if(args != null && args.length > 0){
          n = Integer.parseInt(args[0]);
        }
        printLoop(n);
    }

    public static void printLoop(int n){
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n - i; j++){
         System.out.print(i+1);
      }
      System.out.println("");
    }
  }

}
