package com.syr.java.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author syr
 *
 */
//练习thread，实现多线程同步下载图片
public class TestThread2 extends Thread{

     String url1;//网络图片地址
     String name1;//保存的文件名

    public TestThread2(String url,String name){
        this.url1 = url;
        this.name1 = name;
    }



    @Override
    public void run() {
        WebDownLoader webDownLoader = new WebDownLoader();
        webDownLoader.downLoader(url1,name1);
        System.out.println("下载了文件名为："+name1);
    }

    public static void main(String[] args) {
        TestThread2 testThread2 = new TestThread2("https://p1.ssl.qhimg.com/t017ad3eddf8eacdfeb.png","2.png");
        TestThread2 testThread22 = new TestThread2("https://p1.ssl.qhimg.com/t017ad3eddf8eacdfeb.png","3.png");
        TestThread2 testThread222= new TestThread2("https://p1.ssl.qhimg.com/t017ad3eddf8eacdfeb.png","4.png");
        testThread2.start();
        testThread222.start();
        testThread22.start();

    }
}



//下载器
class WebDownLoader{
    //下载方法
    public void downLoader(String url1,String name1){
        try {
            FileUtils.copyURLToFile(new URL(url1),new File(name1));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现问题");
        }
    }
}