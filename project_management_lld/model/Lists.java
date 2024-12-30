package model;
import java.util.*;
public class Lists {
    private String listid;
    private String name;
    private ArrayList<Card> cards;
    public Lists(String listid,String name){
        this.listid=listid;
        this.name=name;
        this.cards=new ArrayList<>();
    }
    public String getlistid() {return listid;}
    public void setname(String name){this.name=name;}
    public String getname(){return name;}
    public ArrayList<Card> getcards() {return cards;}
}
