/**
 * @author Kevin Juan 1972002
 */
package com.kevinjuan.module1.entity;

public class UserStatistic {
    private int totalWin, totalDraw, totalLose;

    public void addWinStatistic(){
        this.totalWin += 1;

    }
    public void addDrawStatistic(){
        this.totalDraw += 1;
    }
    public  void addLoseStatistic(){
        this.totalLose +=1;
    }
    public String toString(){
        return "Win: " + this.totalWin + ", Draw: " + this.totalDraw + ", Lose: "+ this.totalLose;
    }
}
