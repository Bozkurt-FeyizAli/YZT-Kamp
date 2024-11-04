import java.util.Scanner;

public class week1{
    public static void main(String[] args) {
        reverseNumber(12);
    }

    public static void printEven(int n, int i){
        if(i>n)
            return;
        if(i%2==0)
            System.out.println(n);
        printEven(n, i++);
    }
    public static int printProduct(int n){
        if(n==1)
            return 1;
        return n*printProduct(n-1);
    }

}
