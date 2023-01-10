package com.sharadshakya2005.myproject;

public class storingdata {

    public storingdata() {
    }

    String name,user,email,mobile,dob,aadhar,pass;

    public storingdata(String name, String user, String email, String mobile, String dob, String aadhar, String pass) {
        this.name = name;
        this.user = user;
        this.email = email;
        this.mobile = mobile;
        this.dob = dob;
        this.aadhar = aadhar;
        this.pass = pass;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
