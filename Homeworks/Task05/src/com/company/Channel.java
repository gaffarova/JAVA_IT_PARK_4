package com.company;

import java.time.LocalTime;

public class Channel {
    private final int PROGRAM_COUNT = 3;
    private Program programs[];
    private String name;
    private int count;

    public Channel(String name) {
        this.name = name;
        this.programs = new Program[PROGRAM_COUNT];
        this.count = 0;
    }

    public void addProgram(Program program) {
        this.programs[count++] = program;
    }

    public String getProgramName() {
        LocalTime currentTime = LocalTime.now();
        for (Program program : programs) {
            if (currentTime.isAfter(program.getBeginTime()) && currentTime.isBefore(program.getEndTime())) {
                return "You are watching " + program.getName() + " program now";
            }
        }
        return null;
    }


}

