package com.Jsoup.src.code;

/**
 * @author Tang A Biao
 * @create 2021/1/4 - 21:13
 */
public class songs {
    private String author;
    private String song;
    private String img;

    @Override
    public String toString() {
        return "songs{" +
                "author='" + author + '\'' +
                ", song='" + song + '\'' +
                ", img='" + img + '\'' +
                '}';
    }

    public songs() {
    }

    public songs(String author, String song, String img) {
        this.author = author;
        this.song = song;
        this.img = img;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
