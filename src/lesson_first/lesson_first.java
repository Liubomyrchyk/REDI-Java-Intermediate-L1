package lesson_first;

import java.util.Scanner;

class lesson_first {
    public static void main(String[] args) {
        print();
        reverse("The quick brown fox");
        getSumOfDigits(50);
    }
    public static void print() {
        System.out.println("   J    a  v      v  a");
        System.out.println("   J   a a  v    v  a a");
        System.out.println("J  J  aaaaa  v  v  aaaaa");
        System.out.println(" JJ  a     a  v   a     a");
    }
    public static void reverse(String str){
                String reverse = "";
                for(int i = str. length() - 1; i >= 0; i--){
                    reverse = reverse + str. charAt(i); }
                System.out.println(reverse);
    }
    private static void getSumOfDigits(int s) {
        int n = 0, sum = 0;
        
        System.out.println("Enter the number: ");

        while (s > 0){
            n = s % 10;
            sum = sum + n;
            s = s / 10;
        }
        System.out.println(sum);
    }
}