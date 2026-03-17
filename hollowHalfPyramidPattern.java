import java.util.Scanner;


public class hollowHalfPyramidPattern{
    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                if(i==j || j==1| i==rows){ // if(i==1 &&j==1 || i==j || j==1 || i==rows)
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
