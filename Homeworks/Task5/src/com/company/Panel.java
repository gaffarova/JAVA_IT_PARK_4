package com.company;

public class Panel {
    private TV tv;

    public Panel(TV tv){
        this.tv = tv;
    }

    public void showTV(String name) {
        tv.showProgram(name);
    }
}
