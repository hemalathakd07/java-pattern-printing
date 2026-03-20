  import java.util.Scanner;

public class RightAlignedIncreasingNumberTriangle {
    public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            int num=i;
            for(int k=1;k<=i;k++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}