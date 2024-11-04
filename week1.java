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

    public static void basamak(){
        Scanner s= new Scanner(System.in);
        int i=s.nextInt();
        System.out.printf("%d sayısı,  %d badamağa sahiptir.", i, (int)Math.log10(i)+1);
        System.out.println();
        String sayı=Integer.toString(i);
        for (int j = sayı.length()-1; !sayı.equals(""); j--) {
            if(sayı.charAt(0)=='0')
                continue;
            System.out.print((sayı.charAt(0)-48)*(int)Math.pow(10, j)+" + ");
            sayı=sayı.substring(1);
        }
        System.out.println();
        s.close();
    }

    public static void reverseNumber(int n){
        if(n<0)
            reverseNumber(0-n);
        if(n<10){
            System.out.print(n);
            return;
        }
        System.out.print(n%10);
        reverseNumber(n/10);
        System.out.println();
    }

}
