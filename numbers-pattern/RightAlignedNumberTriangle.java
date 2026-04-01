import java.util.Scanner;

public class RightAlignedNumberTriangle {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        for(int i=rows;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<=rows;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
