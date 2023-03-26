package com.example.hm.ps4gameswebsite.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "playstation_4_games")
public class Playstation4Game {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_2", nullable = false)
    private Long id2;

    @Column(name = "ID")
    private Integer id;

    @Column(name = "GamePSID")
    private Integer gamePSID;

    @Lob
    @Column(name = "GameName")
    private String gameName;

    @Lob
    @Column(name = "Publisher")
    private String publisher;

    @Column(name = "ReleaseYear")
    private Double releaseYear;

    @Lob
    @Column(name = "ReleaseDate")
    private String releaseDate;

    @Lob
    @Column(name = "Developer")
    private String developer;

    @Lob
    @Column(name = "Genre")
    private String genre;

    @Lob
    @Column(name = "Features")
    private String features;

    @Lob
    @Column(name = "Size")
    private String size;

    @Lob
    @Column(name = "Medium")
    private String medium;

    @Lob
    @Column(name = "Hardware")
    private String hardware;

    @Lob
    @Column(name = "`CompletionTime(Hours)`")
    private String completionTimeHours;

    @Column(name = "is_Digital_game")
    private Integer isDigitalGame;

    @Column(name = "is_Physical_game")
    private Integer isPhysicalGame;

    @Lob
    @Column(name = "OfficialWebsite")
    private String officialWebsite;

    public Long getId2() {
        return id2;
    }

    public void setId2(Long id2) {
        this.id2 = id2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGamePSID() {
        return gamePSID;
    }

    public void setGamePSID(Integer gamePSID) {
        this.gamePSID = gamePSID;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Double getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Double releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getHardware() {
        return hardware;
    }

    public void setHardware(String hardware) {
        this.hardware = hardware;
    }

    public String getCompletionTimeHours() {
        return completionTimeHours;
    }

    public void setCompletionTimeHours(String completionTimeHours) {
        this.completionTimeHours = completionTimeHours;
    }

    public Integer getIsDigitalGame() {
        return isDigitalGame;
    }

    public void setIsDigitalGame(Integer isDigitalGame) {
        this.isDigitalGame = isDigitalGame;
    }

    public Integer getIsPhysicalGame() {
        return isPhysicalGame;
    }

    public void setIsPhysicalGame(Integer isPhysicalGame) {
        this.isPhysicalGame = isPhysicalGame;
    }

    public String getOfficialWebsite() {
        return officialWebsite;
    }

    public void setOfficialWebsite(String officialWebsite) {
        this.officialWebsite = officialWebsite;
    }

    @Override
    public String toString() {
        return "Playstation4Game{" +
                "id2=" + id2 +
                ", id=" + id +
                ", gamePSID=" + gamePSID +
                ", gameName='" + gameName + '\'' +
                ", publisher='" + publisher + '\'' +
                ", releaseYear=" + releaseYear +
                ", releaseDate='" + releaseDate + '\'' +
                ", developer='" + developer + '\'' +
                ", genre='" + genre + '\'' +
                ", features='" + features + '\'' +
                ", size='" + size + '\'' +
                ", medium='" + medium + '\'' +
                ", hardware='" + hardware + '\'' +
                ", completionTimeHours='" + completionTimeHours + '\'' +
                ", isDigitalGame=" + isDigitalGame +
                ", isPhysicalGame=" + isPhysicalGame +
                ", officialWebsite='" + officialWebsite + '\'' +
                '}';
    }
}