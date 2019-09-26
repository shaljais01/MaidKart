package com.example.appmaid;

public class mymaidinfo  {
    String email;
    String name;
    String mobile;

    public mymaidinfo (){

    }

    public mymaidinfo (String email, String name, String mobile) {
        this.email = email;
        this.name = name;
        this.mobile = mobile;

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


}
