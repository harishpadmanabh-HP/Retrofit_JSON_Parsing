package com.hp.hp.retrofit_json_parsing;

public class Hero
{
    //1.create string for storing json objects fields
    private String name;
    private String realname;
    private String team;
    private String firstappearence;
    private String createdby;
    private String publisher;
    private String imageuri;
    private String bio;
//2.right click-generate-constructors for all strings for the class hero
    public Hero(String name, String realname, String team, String firstappearence, String createdby, String publisher, String imageuri, String bio) {
        this.name = name;
        this.realname = realname;
        this.team = team;
        this.firstappearence = firstappearence;
        this.createdby = createdby;
        this.publisher = publisher;
        this.imageuri = imageuri;
        this.bio = bio;
    }
//3.Generate getter for all strings (rt click generate getters)
    public String getName() {
        return name;
    }

    public String getRealname() {
        return realname;
    }

    public String getTeam() {
        return team;
    }

    public String getFirstappearence() {
        return firstappearence;
    }

    public String getCreatedby() {
        return createdby;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getImageuri() {
        return imageuri;
    }

    public String getBio() {
        return bio;
    }
    //4.create new interface for api
}
