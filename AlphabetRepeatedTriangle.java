import java.util.Scanner;

public class AlphabetRepeatedTriangle {
  public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        char ch='A';
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
    }
}
