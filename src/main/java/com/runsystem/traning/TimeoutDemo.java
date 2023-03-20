package com.runsystem.traning;
 
import java.util.concurrent.TimeUnit;
 
public class TimeoutDemo {
 
    public static int doNormalTask() {
        try {
            // Do heavy task
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 1;
    }
 
    public static int doHeavyTask() {
        try {
            // Do heavy task
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 1;
    }
}