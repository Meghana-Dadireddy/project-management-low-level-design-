package model;

public class Card {
    private String cardid;
    private String name;
    private String description;
    private User assigneduser;
    public Card(String cardid,String name){
        this.cardid=cardid;
        this.name=name;
        this.description="";
        this.assigneduser=null;
    }
    //getter and setter methods
    public String getcardid(){return cardid;}
    public void setname(String name) {this.name=name;}
    public String getname(){return name;}
    public void setdescription(String description) {this.description=description;}
    public String getdescription() {return description;};
    public void setassigneduser(User user){
        this.assigneduser=user;
    }
    public User getassigneduser(){
        return assigneduser;
    }
}
