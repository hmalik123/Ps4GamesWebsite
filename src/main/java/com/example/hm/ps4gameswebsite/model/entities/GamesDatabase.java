package com.example.hm.ps4gameswebsite.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "games_database")
public class GamesDatabase {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 147)
    @Column(name = "Column_1", length = 147)
    private String column1;

    @Size(max = 140)
    @Column(name = "Title", length = 140)
    private String title;

    @Size(max = 31)
    @Column(name = "Release_Date", length = 31)
    private String releaseDate;

    @Size(max = 72)
    @Column(name = "Team", length = 72)
    private String team;

    @Size(max = 96)
    @Column(name = "Rating", length = 96)
    private String rating;

    @Size(max = 76)
    @Column(name = "Times_Listed", length = 76)
    private String timesListed;

    @Size(max = 60)
    @Column(name = "Number_of_Reviews", length = 60)
    private String numberOfReviews;

    @Size(max = 95)
    @Column(name = "Genres", length = 95)
    private String genres;

    @Size(max = 3770)
    @Column(name = "Summary", length = 3770)
    private String summary;

    @Size(max = 7982)
    @Column(name = "Reviews", length = 7982)
    private String reviews;

    @Size(max = 48)
    @Column(name = "Plays", length = 48)
    private String plays;

    @Size(max = 127)
    @Column(name = "Playing", length = 127)
    private String playing;

    @Size(max = 114)
    @Column(name = "Backlogs", length = 114)
    private String backlogs;

    @Size(max = 4)
    @Column(name = "Wishlist", length = 4)
    private String wishlist;

    @Column(name = "Column_15")
    private Integer column15;

    @Column(name = "Column_16")
    private Integer column16;

    @Column(name = "Column_17")
    private Integer column17;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getTimesListed() {
        return timesListed;
    }

    public void setTimesListed(String timesListed) {
        this.timesListed = timesListed;
    }

    public String getNumberOfReviews() {
        return numberOfReviews;
    }

    public void setNumberOfReviews(String numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public String getPlays() {
        return plays;
    }

    public void setPlays(String plays) {
        this.plays = plays;
    }

    public String getPlaying() {
        return playing;
    }

    public void setPlaying(String playing) {
        this.playing = playing;
    }

    public String getBacklogs() {
        return backlogs;
    }

    public void setBacklogs(String backlogs) {
        this.backlogs = backlogs;
    }

    public String getWishlist() {
        return wishlist;
    }

    public void setWishlist(String wishlist) {
        this.wishlist = wishlist;
    }

    public Integer getColumn15() {
        return column15;
    }

    public void setColumn15(Integer column15) {
        this.column15 = column15;
    }

    public Integer getColumn16() {
        return column16;
    }

    public void setColumn16(Integer column16) {
        this.column16 = column16;
    }

    public Integer getColumn17() {
        return column17;
    }

    public void setColumn17(Integer column17) {
        this.column17 = column17;
    }

    @Override
    public String toString() {
        return "GamesDatabase{" +
                "id=" + id +
                ", column1='" + column1 + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", team='" + team + '\'' +
                ", rating='" + rating + '\'' +
                ", timesListed='" + timesListed + '\'' +
                ", numberOfReviews='" + numberOfReviews + '\'' +
                ", genres='" + genres + '\'' +
                ", summary='" + summary + '\'' +
                ", reviews='" + reviews + '\'' +
                ", plays='" + plays + '\'' +
                ", playing='" + playing + '\'' +
                ", backlogs='" + backlogs + '\'' +
                ", wishlist='" + wishlist + '\'' +
                ", column15=" + column15 +
                ", column16=" + column16 +
                ", column17=" + column17 +
                '}';
    }
}