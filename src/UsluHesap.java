import java.util.Scanner;

public class UsluHesap {
    public static void main(String[] args){
        int n,r,top = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("n: ");
        n = sc.nextInt();
        System.out.println("r: ");
        r = sc.nextInt();
        for(int i = 0;i<r;i++){
            top *= n;
        }
        System.out.println("Sonuc: "+top);
    }
}
