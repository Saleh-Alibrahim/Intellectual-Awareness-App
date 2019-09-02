package com.example.intellectual_awareness;

public class Data {
    private String Title;
    private int Body;
    private String link;

    public Data(String Title, int Body)
    {
        this.Title=Title;
        this.Body = Body;

    }

    public Data(String Title, int Body,String link)
    {
        this.Title=Title;
        this.Body = Body;
        this.link=link;

    }
    public String getTitle(){ return Title;}
    public int getBody(){ return Body;}
    public String getLink(){return link;}

}

