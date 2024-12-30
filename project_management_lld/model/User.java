package model;
public class User{
    private String name;
    private String email;
    private String userid;
    public User(String name,String email,String userid){
        this.name=name;
        this.email=email;
        this.userid=userid;
    }
     // Getters and setters
    public String getUserId() { return userid; }
    public String getName() { return name; }
    public String getEmail() { return email; }
}