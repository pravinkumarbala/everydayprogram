package com.everyday;

import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

class SystemTimer {
    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
    public SystemTimer() {
        final Timer tmr = new Timer();
        tmr.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                System.out.print("\r"+sdf.format(System.currentTimeMillis()));
            }
        },0,1000);
    }
    public static void main(String args[]){
        new SystemTimer();
    }
}