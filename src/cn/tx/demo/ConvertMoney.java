package cn.tx.demo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConvertMoney {

    private final static String[] STR_NUMBER = {"零", "壹", "贰", "叁", "肆",
            "伍", "陆", "柒", "捌", "玖"};
    private final static String[] STR_UNIT = {"", "拾", "佰", "仟", "万",
            "拾", "佰", "仟", "亿", "拾", "佰", "仟"};
    private final static String[] STR_UNIT2 = {"分", "角"};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入:");
        String convert = convert(scanner.nextDouble());
        System.out.println(convert);
    }

    public static String convert(double d) {

        DecimalFormat decimalFormat = new DecimalFormat("#0.##");
        String format = decimalFormat.format(d);
        if (format.indexOf(".") != -1) {
            String substring = format.substring(0, format.indexOf("."));
            if (substring.length() > 12) {
                System.out.println("数据太大，不能转换");
                return "";
            }
        } else {
            if (format.length() > 12) {
                System.out.println("数据太大，不能转换");
                return "";
            }
        }
        String point = "";
        if (format.indexOf(".") != -1) {
            point = "元";
        } else {
            point = "元整";
        }

        String result = getInteger(format) + point + getDecimal(format);
        if (result.startsWith("元")) {
            result = result.substring(1);
        }

        return result;
    }

    public static String getInteger(String num) {
        System.out.println(num);
        if (num.indexOf(".") != -1) {
            num = num.substring(0, num.indexOf("."));
        }
        num = new StringBuffer(num).reverse().toString();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < num.length(); i++) {
            buffer.append(STR_UNIT[i]);
            buffer.append(STR_NUMBER[num.charAt(i) - 48]);
        }
        num = buffer.reverse().toString();
        num = numReplace(num, "零拾", "零");
        num = numReplace(num, "零佰", "零");
        num = numReplace(num, "零仟", "零");
        num = numReplace(num, "零万", "万");
        num = numReplace(num, "零亿", "亿");
        num = numReplace(num, "零零", "零");
        num = numReplace(num, "亿万", "亿");

        if (num.lastIndexOf("零") == num.length() - 1) {
            num = num.substring(0, num.length() - 1);
        }
        System.out.println(num);

        return num;

    }

    public static String getDecimal(String num) {

        if (num.indexOf(".") == -1) {
            return "";
        }
        num = num.substring(num.indexOf(".") + 1);
        num = new StringBuffer(num).reverse().toString();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < num.length(); i++) {
            stringBuffer.append(STR_UNIT2[i]);
            stringBuffer.append(STR_NUMBER[num.charAt(i) - 48]);
        }
        num = stringBuffer.reverse().toString();

        num = numReplace(num, "零角", "零");
        num = numReplace(num, "零分", "零");
        num = numReplace(num, "零零", "零");

        if (num.lastIndexOf("零") == num.length() - 1) {
            num = num.substring(0, num.length() - 1);
        }
        System.out.println(num);
        return num;
    }


    public static String numReplace(String num, String target, String repl) {
        while (true) {
            if (num.indexOf(target) == -1) {
                break;
            }
            num = num.replace(target, repl);
        }
        return num;
    }

}
