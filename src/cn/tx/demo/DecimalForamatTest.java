package cn.tx.demo;

import java.text.DecimalFormat;

public class DecimalForamatTest {

    public static void main(String[] args) {

        double sum = 0.0;
        for (int i = 1; i < 21; i += 2) {
            sum = sum + 1.0 / i;
        }

        double pi = -3.1415926;
        System.out.println(sum);
        System.out.println(pi);

        System.out.println("==================取一位整数======================");
        System.out.println(new DecimalFormat("0").format(sum));
        System.out.println(new DecimalFormat("0").format(pi));
        System.out.println("=================取一位整数和取两位小数=====================");
        System.out.println(new DecimalFormat("0.00").format(sum));
        System.out.println(new DecimalFormat("0.00").format(pi));
        System.out.println("=================取俩位整数和取三位小数，整数不足时用0填充=====================");
        System.out.println(new DecimalFormat("00.000").format(sum));
        System.out.println(new DecimalFormat("00.000").format(pi));
        System.out.println("=================取所有的整数部分=====================");
        System.out.println(new DecimalFormat("#").format(sum));
        System.out.println(new DecimalFormat("#").format(pi));
        System.out.println("=================以百分比计数，并取俩位小数=====================");
        System.out.println(new DecimalFormat("#.00%").format(sum));
        System.out.println(new DecimalFormat("#.00%").format(pi));

        System.out.println(new DecimalFormat("#.00%").format(0.01));
        System.out.println(new DecimalFormat("#.##%").format(0.001));




    }


}
