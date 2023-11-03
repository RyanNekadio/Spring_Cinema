package com.bnta.movies.models;

public class Reply {
    private String title;
    private double rating;
    private int duration;

    public Reply(String title, double rating, int duration){
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

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
