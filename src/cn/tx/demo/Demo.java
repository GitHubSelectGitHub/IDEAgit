package cn.tx.demo;

import java.text.DecimalFormat;

public class Demo {

    public static void main(String[] args) {
        decimalFormat(00.1f);
    }

    public static void decimalFormat(float value){
        DecimalFormat format = new DecimalFormat();
        format.applyPattern("0.##");
        String format1 = format.format(value);
        System.out.println(format1);
        System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
        
    }

}
