package com.rbk4.day1;

import java.util.TimerTask;
import java.util.Timer;

public class MyTimer {

    public void hiEveryXSec(int times, int seconds1, String msg ){
        Timer t = new Timer();
        for (int i = 0; i < times; i++) {
            t.scheduleAtFixedRate(
                    new TimerTask()
                    {
                        public void run()
                        {
                            System.out.println("hello");
                        }
                    },
                    0,      // run first occurrence immediatetly
                    seconds1*1000);
        }

    }
}
//new java.util.Timer().schedule(
//        new java.util.TimerTask() {
//@Override
//public void run() {
//        System.out.println(msg);
//        }
//        },
//        seconds1
//        );