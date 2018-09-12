package fck2068.example.loginpage.model;
/*
    CLASS to create a USER with get and set methods to be used to enter a USER into the DB from the DatabaseHelper CLASS
 */
public class User {
    private int id;
    private String userId;
    private String email;
    private String password;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getUserId(){
        return userId;
    }
    public void setUserId(String userId){
        this.userId = userId;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
