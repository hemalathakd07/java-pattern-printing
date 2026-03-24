import java.util.Scanner;

public class BinaryTrianglePattern {
    public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                if(j%2==0){
                    System.out.print(0+" ");
                }
                else{
                    System.out.print(1+" ");
                }

            }
            System.out.println();
        }
    }
}
