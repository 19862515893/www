package com.syr.java.thread;

/**
 * @author syr
 *
 */
//创建线程方式2：实现runnable接口，重写run方法，
// 执行线程需要丢入runnable接口实现类，调用start方法
public class TestThread3 implements Runnable{
    @Override
    public void run() {
        //run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码---"+i);
        }
    }

    public static void main(String[] args) {
        /*//main线程，主线程

        //创建一个对象
        //TestThread1 testThread1 = new TestThread1();

        //调用start（）方法开启线程
       // testThread1.start();
*/
        TestThread3 testThread3 = new TestThread3();
       // Thread thread = new Thread(testThread3);
        //thread.start();

        new Thread(testThread3).start();

        for (int i = 0; i < 20; i++) {
            System.out.println("我在学习多线程---"+i);
        }
    }
}
