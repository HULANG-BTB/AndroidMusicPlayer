package com.example.hulang.testmusicplayer;

public class Music {
    private String info;
    private int imageId;
    public Music(String info, int imageId) {
        this.info = info;
        this.imageId = imageId;
    }
    public String getName() {
        return info;
    }
    public int getImageId() {
        return imageId;
    }
}
