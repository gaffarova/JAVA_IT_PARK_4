package com.company;

public class TV {
    private static final TV instance;
    private final int CHANNEL_COUNT = 3;
    private Channel channels[];
    private int count;

    private TV() {
        this.channels = new Channel[CHANNEL_COUNT];
        this.count = 0;
    }

    static {
        instance = new TV();
    }

    public static TV getInstance() {
        return instance;
    }

    public void addChannel(Channel channel) {
        channels[count++] = channel;
    }

    public void showProgram(int number) {
        System.out.println(channels[number].getProgramName());
    }
}





