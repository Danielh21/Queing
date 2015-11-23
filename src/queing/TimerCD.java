/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queing;

import javax.swing.Timer;

public class TimerCD {

    String time;
    Timer timer = new Timer(1000, null);

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }
    
    
    
    public void run() {
        
        timer.start();
        timer.toString();

    }
}
