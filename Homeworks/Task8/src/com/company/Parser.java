package com.company;

public class Parser implements Observable {

    private Observer observers[];
    private int count = 0;

    private Parser(Builder builder) {
        this.observers = builder.observers;
        this.count = builder.count;
    }

    public String[] parse(String text) {
        char chars[] = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            notifyAll(chars[i]);
        }
        return null;
    }

    public void notifyAll(char a) {
        for (int i = 0; i < observers.length; i++) {
            observers[i].count(a);
        }
    }

    public static class Builder {
        private Observer observers[] = new Observer[5];
        private int count = 0;

        public Builder addObserver(Observer observer) {
            this.observers[count++] = observer;
            return this;
        }

        public Parser build() {
            return new Parser(this);
        }
    }

        public static Builder builder() {
            return new Builder();
        }

    }


