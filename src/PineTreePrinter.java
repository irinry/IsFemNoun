import java.util.Scanner;

public class PineTreePrinter {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int heigh = scan.nextInt();

            System.out.println("I");

            for (int i=2;i<heigh;i++){
            for (int u=0;u<i;u++){
                if (u%2==0){
                    System.out.print("X");
                }else {
                    System.out.print("Y");
                }
            }
            System.out.println();
        }
        System.out.print("M");
    }
}
