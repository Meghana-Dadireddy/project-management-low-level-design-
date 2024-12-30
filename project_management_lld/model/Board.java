package model;
import java.util.*;
public class Board {
    private String boardid;
    private String name;
    private String privacy;
    private String url;
    private List<User> userlist;
    private List<Lists> list;
    public Board(String boardid,String name){
        this.boardid=boardid;
        this.name=name;
        this.privacy="PUBLIC"; //DEFALUT VALUE ASSIGNED
        this.url="/boards/"+boardid;
        this.userlist=new ArrayList<>();
        this.list=new ArrayList<>();
    }
public String getboardid(){return boardid;}
public String getname() { return name; }
public void setname(String name) { this.name = name; }
public void setprivacy(String privacy){this.privacy=privacy;}
public String getprivacy(){return privacy;}
public String geturl(){return url;}
public List<User> getusers(){return userlist;}
public List<Lists> getlists(){return list;}

}
