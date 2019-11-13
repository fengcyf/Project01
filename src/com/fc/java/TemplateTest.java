package com.fc.java;

import java.util.ArrayList;

/**
 * @author fc
 * @create 2019-11-13 11:30
 */
public class TemplateTest {
    /**
     * idea中模板所处的位置：settings -editor -live template /postfix compleation
     * 常用的模板
     */

    //模板六 prsf 可生成 private static final
    private static final String CUST = "fc";
    //变形 psf
    public static final int NUM =1;
    //变形 psfi
    public static final int NUM2 = 2;
    //变形 psfs
    public static final String NATION = "CHINA";
    //模板一 psvm
    public static void main(String[] args) {

        //模板二 sout
        System.out.println("hello");

        //变形：soutp/soutm/soutv/xxx.sout
        System.out.println("TemplateTest.main");
        int num1 =10;
        int num2=20;
        System.out.println("num2 = " + num2);
        System.out.println(num1);

        //模板三 fori
        String[] arr = new String[] {"tom","hanmeimei","libai"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形 iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形 itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }
        //模板4 list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(23);
        list.add(345);
        for (Object o : list) {

        }
        //变形 list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形 list.forr 倒叙遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }

    }

    public void method(){
        System.out.println("TemplateTest.method");
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(23);
        list.add(345);
        //模板 ifn
        if (list == null) {

        }
        //变形 inn
        if (list != null) {

        }

        //变形 xxx.null //xxx.nn
        if (list != null) {

        }

    }
}
