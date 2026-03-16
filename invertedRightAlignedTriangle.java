import java.util.Scanner;

public class invertedRightAlignedTriangle {
  public static void main(String[] args) {
    System.out.println("Enter number of rows:");
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();

       for(int i=0;i<rows;i++){
           for(int j=0;j<i;j++){
               System.out.print(" ");
           }
           for(int k=0;k<rows-i;k++){
               System.out.print("*");
           }
           System.out.println();
  }
}
}