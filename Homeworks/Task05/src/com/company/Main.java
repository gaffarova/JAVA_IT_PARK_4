package com.company;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        Channel BBC = new Channel("BBC");
        Program NEWS = new Program("NEWS", LocalTime.parse("00:00"), LocalTime.parse("08:00"));
        Program LIVE = new Program("LIVE", LocalTime.parse("08:00"), LocalTime.parse("16:00"));
        Program CULTURE = new Program("CULTURE", LocalTime.parse("16:00"), LocalTime.parse("00:00"));
        BBC.addProgram(NEWS);
        BBC.addProgram(LIVE);
        BBC.addProgram(CULTURE);

        Channel CNN = new Channel("CNN");
        Program FINANCE = new Program("FINANCE", LocalTime.parse("00:00"), LocalTime.parse("08:00"));
        Program HEALTH = new Program("HEALTH", LocalTime.parse("08:00"), LocalTime.parse("16:00"));
        Program CINEMA = new Program("CINEMA", LocalTime.parse("16:00"), LocalTime.parse("00:00"));
        CNN.addProgram(FINANCE);
        CNN.addProgram(HEALTH);
        CNN.addProgram(CINEMA);

        Channel EURONEWS = new Channel("EURONEWS");
        Program BREAKING_NEWS = new Program("BREAKING_NEWS", LocalTime.parse("00:00"), LocalTime.parse("08:00"));
        Program SCIENCE = new Program("SCIENCE", LocalTime.parse("08:00"), LocalTime.parse("16:00"));
        Program BRIEF = new Program("BRIEF", LocalTime.parse("16:00"), LocalTime.parse("00:00"));
        EURONEWS.addProgram(BREAKING_NEWS);
        EURONEWS.addProgram(SCIENCE);
        EURONEWS.addProgram(BRIEF);

        TV tv = TV.getInstance();
        tv.addChannel(BBC);
        tv.addChannel(CNN);
        tv.addChannel(EURONEWS);

        Panel panel = new Panel(tv);
        panel.showTV();


    }
}
