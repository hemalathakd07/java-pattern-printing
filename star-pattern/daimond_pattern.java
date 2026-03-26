import java.util.Scanner;

public class daimond_pattern {
    public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=rows-1;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
