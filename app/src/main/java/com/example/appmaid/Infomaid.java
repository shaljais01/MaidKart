package com.example.appmaid;

public class Infomaid {
    String email;
    String name;
    String mobile;
    String city;
    String locality;
    String street;
    String type;
    String currentowner;
    String previousowner;

    public Infomaid(){

    }

    public Infomaid(String email, String name, String mobile, String city,String locality,String street, String type, String currentowner, String previousowner)
    {
        this.email = email;
        this.name = name;
        this.mobile = mobile;
        this.city = city;
        this.locality=locality;
        this.street=street;
        this.type=type;
        this.currentowner=currentowner;
        this.previousowner=previousowner;
    }

    public String getemail() {
        return email;
    }

    public String getname() {
        return name;
    }

    public String getmobile() {
        return mobile;
    }

    public String getcity() {
        return city;
    }
    public  String getType()
    {
        return type;
    }
    public String getlocality() {
        return locality;
    }
    public String getstreet(){return  street;}

    public String getPreviousowner() {
        return previousowner;
    }
    public String getCurrentowner() {
        return currentowner;
    }
    public void setPreviousowner(String previousowner)
    {
        this.previousowner = previousowner;
    }
}
