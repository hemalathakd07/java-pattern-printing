import java.util.Scanner;

public class RightAlignedInvertedNumberTriangle {
    public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();

        for(int i=rows;i>=1;i--){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
