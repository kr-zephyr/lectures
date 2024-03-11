package com.sz21c.lecture.java.steam.model;

public class Score {
    private String name;
    private int point;

    public Score(String name, int point) {
        this.name = name;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }
}
