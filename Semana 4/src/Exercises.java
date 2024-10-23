import java.util.Scanner;

public class Exercises {
    public void buildPyramid(){
        System.out.println("Ingrese el numero de filas que tendrá la piramide: ");
        String s = new Scanner(System.in).nextLine();
        int num = Integer.parseInt(s);
        for(int i=1; i<=num; i++){
            for(int j=num; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
