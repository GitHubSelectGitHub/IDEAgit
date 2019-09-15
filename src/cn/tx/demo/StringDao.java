package cn.tx.demo;

public class StringDao {

    public static void main(String[] args) {

        String string = "HelloWorld";
        char[] toCharArray = string.toCharArray();
        for (int i = 0; i < toCharArray.length / 2; i++) {
            char a = toCharArray[i];
            toCharArray[i] = toCharArray[toCharArray.length - 1 - i];
            toCharArray[toCharArray.length - 1 - i] = a;
        }
        System.out.println(new String(toCharArray));


    }


}
