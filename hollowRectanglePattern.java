import java.util.Scanner;

public class hollowRectanglePattern {
    public static void main(String[] args) {
        System.out.println("Enter the row size:");
        Scanner scanner =new Scanner(System.in);
        int row=scanner.nextInt();
        System.out.println("Enter the column size:");
        int cols=scanner.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=cols;j++){
                if(i==1 || i== row || j==1 || j==cols){
                    System.out.print("*\t");
                }
                else{
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}
