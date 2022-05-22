package com.example.playlist_vitalii_tsoy;

import java.io.Serializable;

public class Song implements Serializable {
    private String name;
    private String singer;
    private String  time;
    private String number;

    public Song(String singer, String name, String time, String number) {
        this.name = name;
        this.singer = singer;
        this.time = time;
        this.number = number;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
