package cn.lsal;

import cn.lsal.mydemo.Baskatball;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws InterruptedException {//中断的，打断的Interrupted
        System.out.println( "Hello World!" );
        System.out.println("Hello World!");
        System.out.println("Hello Git!");
        System.out.println("Hello XiaoMing!");
        Baskatball baskatball = new Baskatball();
        baskatball.wait();
        Date date = new Date();
        System.out.println(date + "学会多线程！");
    }
}
