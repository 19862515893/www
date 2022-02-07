package com.syr.java;

import java.util.ArrayList;

public class HelloWord {
    public static final int INITIAL_SIZE=10;
    private static int num;

    public static void main(String[] args){
        //region Description
        System.out.println("helloword");
        //endregion
        //ctrl+d 删除一行
        //shift+回车 直接转到下一行
        //shift+回车 直接转到下一行
        /*执行(run)  alr+r
        提示补全  alt+/
        多行注释 ctrl+shift+/
        单行注释 CTRL+/
        向下复制一行 ctrl+alt+down
        删除一行或选中行  ctrl+d
        向下移动行 alt+down
        向上移动行 alt+up
        向下开始新的一行 shift + enter
        向上开始新的一行 ctrl+shift+enter
        如何查看源码 ctrl+选中指定的结构 或 ctrl+shift+t
        万能解错/生成返回值变量 alt+enter
        退回到前一个编辑的页面 alt + left
        进入到下一个编辑的页面 alt+right
        查看继承关系 f4
        格式化代码 ctrl+shift + F
        提示方法参数类型  ctrl+alt+/
        复制代码 ctrl+c
        撤销     ctrl+z
        反撤销   ctrl+y
        剪切     ctrl+x
        粘贴     ctrl+v
        保存     ctrl+s
        全选     ctrl+a
        选中数行，整体往后移动  tab
        选中数行，整体往前移动  shift+tab
        查看类的结构  ctrl+o
        重构：（修改变量名与方法名） alt+shift+r
        大写转小写/小写转大写 ctrl+shift+y
        生成构造/get/set/toString alt+shift+s
        查看文档说明  f2
        收起所有的方法  alt+shift+c
        打开所有的方法  alt+shift+x
        打开代码所在硬盘文件夹 ctrl+shift+x
        生成try-catch等  alt+shift+z
        局部变量抽取为成员变量  alt+shift+f
        查找/替换(当前) ctrl+f
        查找全局    ctrl+h
        查找文件  double shift
        查找类的继承结构图 ctrl+shift+u
        查看方法的多层重写结构 ctrl+alt+h
        添加到收藏 ctrl+alt+f
        抽取方法  ctrl + shift + m
        打开最近修改的文件  ctrl+e
        关闭当前打开的代码栏 ctrl+w
        关闭打开的所有的代码栏  ctrl+shift+w
        快速搜索类中的错误  ctrl+shift+q
        选择要粘贴的内容   ctrl+shift+v
        查找方法在哪里被调用  ctrl+shift+h
        */



        ArrayList list1 = new ArrayList();

        list1.add(0,123);
        //method1();
        System.out.println(list1);
        System.out.println();//sout+tab 出来这句
    }
    public static void method1(){
        num = 10;
        /*try {
            FileInputStream file = new FileInputStream("hello.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }*/

    }
}
