import java.util.Scanner;

public class hollowSqaurePattern {
    public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                if(j==1|| i==1 || i==rows || j==rows){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
