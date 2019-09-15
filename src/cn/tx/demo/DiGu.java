package cn.tx.demo;

import java.util.Scanner;

public class DiGu {

    static int anInt = 0;
    static int sum = 0;
    static int pos = -1;
    static int[] result;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入:");
        anInt = scanner.nextInt();
        result = new int[anInt];
        DFS(1);
    }

    public static void DFS(int x) {
        if (sum == anInt) {
            for (int i = 0; i < pos; i++) {
                System.out.print(result[i] + "+");
            }
            System.out.println(result[pos]);
            return;
        }
        if (sum > anInt) {
            return;
        }
        for (int i = x; i < anInt + 1; i++) {
            result[++pos] = i;
            sum += i;
            DFS(i);
            pos--;
            sum -= i;
        }
    }
}
