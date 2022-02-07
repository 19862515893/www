package com.syr.java;

import com.syr.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author syr
 * @date 2022/2/5 - 10:36
 */

/*
* 1.IDEA中代码模板所处位置：settings -Editor -live Templates / postfix completion
* 2.常用的模板
* */
public class TemplatesTest {

    //模板六：prsf : 可生成private static final
    private static final Customer CUST = new Customer();
    //变形：psf
    public static final int NUM=1;
    //变形 psfi
    public static final int NUM2=2;
    //变形 psfs
    public static final String NATION="china";

    //模板一: psvm
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("hello");
        //变形: soutp/soutm/soutv/xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        int num1=10;
        System.out.println("num1 = " + num1);
        System.out.println(num1);

        //模板三：fori
        String[] arg = new String[]{"tom","jerry","huhf"};
        for (int i = 0; i < arg.length; i++) {
            System.out.println(arg[i]);
        }
        //变形 iter
        for (String s : arg) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arg.length; i++) {
            String s = arg[i];
            System.out.println(s);
        }
        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(222);
        list.add(333);
        list.add(555);
        for (Object o : list) {

        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形：list.forr  倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }

    }
    public void method(){
        System.out.println("Templates.method");
        //模板五：ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(222);
        list.add(333);
        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }
        //变形：xxx.nn / xxx.null
        if (list != null) {

        }
        if (list == null) {

        }

    }

}
