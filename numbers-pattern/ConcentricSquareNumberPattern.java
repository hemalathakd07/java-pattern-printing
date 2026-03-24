import java.util.Scanner;

public class ConcentricSquareNumberPattern{
    public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();

        for(int i=0;i<2*rows-1;i++){
            for(int j=0;j<2*rows-1;j++){
                System.out.print(rows-Math.min((Math.min(j,2*rows-2-j)),Math.min(i,2*rows-2-i))+" ");
            }
            System.out.println();
        }
    }
}
