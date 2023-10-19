package com.example.demo.api.model;

import java.util.Date;

public class User {
    private int id;
    private String Team_A;

    private String Team_B;
    private Date match_date;

    public User(int id,String Team_A,String Team_B,Date match_date)
    {
        this.id=id;
        this.Team_A=Team_A;
        this.Team_B=Team_B;
        this.match_date=match_date;

    }
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public String getTeam_A(){
        return Team_A;
    }
    public void setTeam_A(String Team_A){
        this.Team_A=Team_A;
    }
    public String getTeam_B(){
        return Team_B;
    }
    public void setTeam_B(String Team_B){
        this.Team_B=Team_B;
    }
    public Date getMatch_date(){
        return match_date;
    }
    public void setMatch_date(Date match_date){
        this.match_date=match_date;
    }

}
