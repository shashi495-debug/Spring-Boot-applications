package com.example.connectingsqlproj.entites;

import javax.persistence.*;

@Table
@Entity
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="first name")
    private String fname;
    @Column(name="last name")
    private String lname;
    @Column(name="father name")
    private String fatname;
    @Column(name="Gender")
    private String gender;
    @Column(name="username")
    private String uname;
    @Column
    private String pwd;
    @Column(name="Address")
    private String addr;
    @Column(name="State of which")
    private String state;
    @Column(name="Number")
    private String num;
    @Column(name="date of birth")
    private String dob;
public user(){

}

    public user(String fname, String lname, String fatname, String gender, String uname, String pwd, String addr, String state, String num, String dob) {
        this.fname = fname;
        this.lname = lname;
        this.fatname = fatname;
        this.gender = gender;
        this.uname = uname;
        this.pwd = pwd;
        this.addr = addr;
        this.state = state;
        this.num = num;
        this.dob = dob;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFatname() {
        return fatname;
    }

    public void setFatname(String fatname) {
        this.fatname = fatname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", fatname='" + fatname + '\'' +
                ", gender='" + gender + '\'' +
                ", uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                ", addr='" + addr + '\'' +
                ", state='" + state + '\'' +
                ", num='" + num + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }

}
