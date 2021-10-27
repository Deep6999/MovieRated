package com.devwonk.movierated.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Movimodel implements Parcelable {
    private String title,poster_path,released_date,movie_overview;
    private float vote_average;
    private int movie_id;

    protected Movimodel(Parcel in) {
        title = in.readString();
        poster_path = in.readString();
        released_date = in.readString();
        movie_overview = in.readString();
        vote_average = in.readFloat();
        movie_id = in.readInt();
    }

    public static final Creator<Movimodel> CREATOR = new Creator<Movimodel>() {
        @Override
        public Movimodel createFromParcel(Parcel in) {
            return new Movimodel(in);
        }

        @Override
        public Movimodel[] newArray(int size) {
            return new Movimodel[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public String getReleased_date() {
        return released_date;
    }

    public String getMovie_overview() {
        return movie_overview;
    }

    public float getVote_average() {
        return vote_average;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public Movimodel(String title, String poster_path, String released_date, String movie_overview, float vote_average, int movie_id) {
        this.title = title;
        this.poster_path = poster_path;
        this.released_date = released_date;
        this.movie_overview = movie_overview;
        this.vote_average = vote_average;
        this.movie_id = movie_id;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(poster_path);
        dest.writeString(released_date);
        dest.writeString(movie_overview);
        dest.writeFloat(vote_average);
        dest.writeInt(movie_id);
    }
}
