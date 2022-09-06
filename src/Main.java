import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x,n1,n2;
        System.out.print("1. sayıyı giriniz: ");
        n1=input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        n2=input.nextInt();
        System.out.print("Toplma için 1\'e basın.\nÇıkarma için 2\'e basın.\nÇarpma için 3\'e basın.\nBölme için 4\'e basın ");
        x = input.nextInt();

        switch  (x) {
            case 1:
                System.out.print("Toplam:" + (n1+n2));
                break;
            case 2:
                System.out.print("Çıkarma:" + (n1-n2));
                break;
            case 3:
                System.out.print("Çarpma:"+(n1*n2));
                break;
            case 4:
                if(n2==0){
                    System.out.print("Bölen sıfır olamaz");
                } else{
                    System.out.print("Bölme:"+(n1/n2));
                }
                break;
            default:
                System.out.print("Geçersiz sayı girildi.");
                break;

        }
    }
}