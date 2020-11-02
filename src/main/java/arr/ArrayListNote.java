package main.java.arr;

import java.util.ArrayList;

/**
 * arrayList笔记
 */
public class ArrayListNote {

    /**
     * 属性说明：
     * capaciy 数组的容量 默认初始化大小为10
     *
     * @param args
     */
    public static void main(String[] args) {
        int num = 10;
        int newNUm = num >> 1;
        System.out.println(newNUm);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        arrayList.add(10);
        arrayList.add(11);

        boolean contains = arrayList.contains(10);


        System.out.println(arrayList.size());
    }

}
