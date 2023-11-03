package com.bnta.movies.models;

public class Reply {
    private String title;
    private int rating;
    private int duration;

    public Reply(String title, int rating, int duration){
        this.title = title;
        this.rating = rating;
        this.duration = duration;
    }

    public Reply(){
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
