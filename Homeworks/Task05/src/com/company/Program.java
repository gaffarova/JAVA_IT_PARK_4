package com.company;

import java.time.LocalTime;

public class Program {
    private LocalTime beginTime;
    private LocalTime endTime;
    private String name;

    public Program(String name, LocalTime beginTime, LocalTime endTime) {
        this.name = name;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public LocalTime getBeginTime() {
        return beginTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
}
