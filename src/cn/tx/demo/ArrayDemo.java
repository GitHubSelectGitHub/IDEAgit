package cn.tx.demo;

public class ArrayDemo {

    public static void main(String[] args) {
        int t = 0;
        char[] arr = {'a', 'c', 'c', 'a', 'b', 'b'};
        char[] arr2 = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arr2[t] = arr[i];
                t++;
            }
        }

        char[] arr3 = new char[t];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr2[i];
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }


    }

}




