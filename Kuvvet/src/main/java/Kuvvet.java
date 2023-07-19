import java.util.Scanner;
public class Kuvvet {
    public static void main(String[] args) {

        int var;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        var = input.nextInt();

        for(int k=1; k<=var; k*=4){
            System.out.println("4'ün kuvvetleri: " + k);
        }
        for(int j=1; j<=var; j*=5){
            System.out.println("5'in kuvvetleri: " + j);
        }

    }
}
