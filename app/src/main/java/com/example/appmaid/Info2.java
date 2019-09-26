package com.example.appmaid;



public class Info2 {
    String email;
    String name;
    String mobile;
    String city;
    String locality;
    String street;

    public Info2(){

    }

    public Info2(String email, String name, String mobile, String city,String locality,String street) {
        this.email = email;
        this.name = name;
        this.mobile = mobile;
        this.city = city;
        this.locality=locality;
        this.street=street;
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

    public String city() {
        return city;
    }
    public String locality() {
        return locality;
    }
    public String street(){return  street;}
}
