package com.company;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        TV tv = TV.getInstance();

        Channel[] BBC = new Channel[0];
        tv.addChannel(new Channel("BBC"));
        Program NEWS = new Program("NEWS", LocalTime.parse("00:00"), LocalTime.parse("08:00"));
        Program LIVE = new Program("LIVE", LocalTime.parse("08:00"), LocalTime.parse("16:00"));
        Program CULTURE = new Program("CULTURE", LocalTime.parse("16:00"), LocalTime.parse("00:00"));



    }
}
