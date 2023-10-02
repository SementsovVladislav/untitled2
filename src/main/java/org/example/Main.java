package org.example;
import java.util.Scanner;

 public class Main
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a ");
        int a = sc.nextInt();
        System.out.println("Введите b ");
        int b = sc.nextInt();
        System.out.println("Введите c ");
        int c = sc.nextInt();
        int d = b*b - 4 * a * c;

        if(d > 0){
            int x1 = (int)(-b + Math.sqrt(d)) / 2*a;
            int x2 = (int)(-b - Math.sqrt(d)) / 2*a;
            System.out.println("Два Корня: Х1 = " + x1 + ", X2 = " + x2);
        }
        if(d == 0){
            int x = (int)(-b/2*a);
            System.out.println("Один Корень: Х = " + x);
        }
        if(d < 0){
            System.out.println("Нет Корней");
        }

    }
}