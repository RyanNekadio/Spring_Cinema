package com.bnta.movies.models;

public class Reply {

    String message;
    private String title;
    private double rating;
    private int duration;

    public Reply(String message, String title, double rating, int duration){
        this.message = message;
        this.title = title;
        this.rating = rating;
        this.duration = duration;
    }

    public Reply(){
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
