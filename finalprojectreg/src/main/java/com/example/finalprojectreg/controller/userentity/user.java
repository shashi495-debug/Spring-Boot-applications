package com.example.finalprojectreg.controller.userentity;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class user {
    @Id
    @GeneratedValue()
    private String fname;
    private String lname;
    private String fatname;
    private String gender;
    private String uname;
    private String pwd;
    private String addr;
    private String state;
    private String num;
    private String dob;
    private Integer id;
    private String ad_uname;
    private String ad_pwd;
    private String cli_uname;
    private String cli_pwd;
    private String emp_unmae;
    private String emp_pwd;
    private String cont;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAd_uname() {
        return ad_uname;
    }

    public void setAd_uname(String ad_uname) {
        this.ad_uname = ad_uname;
    }

    public String getAd_pwd() {
        return ad_pwd;
    }

    public void setAd_pwd(String ad_pwd) {
        this.ad_pwd = ad_pwd;
    }

    public String getCli_uname() {
        return cli_uname;
    }

    public void setCli_uname(String cli_uname) {
        this.cli_uname = cli_uname;
    }

    public String getCli_pwd() {
        return cli_pwd;
    }

    public void setCli_pwd(String cli_pwd) {
        this.cli_pwd = cli_pwd;
    }

    public String getEmp_unmae() {
        return emp_unmae;
    }

    public void setEmp_unmae(String emp_unmae) {
        this.emp_unmae = emp_unmae;
    }

    public String getEmp_pwd() {
        return emp_pwd;
    }

    public void setEmp_pwd(String emp_pwd) {
        this.emp_pwd = emp_pwd;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    @Override
    public String toString() {
        return "user{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", fatname='" + fatname + '\'' +
                ", gender='" + gender + '\'' +
                ", uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                ", addr='" + addr + '\'' +
                ", state='" + state + '\'' +
                ", num='" + num + '\'' +
                ", dob='" + dob + '\'' +
                ", id=" + id +
                ", ad_uname='" + ad_uname + '\'' +
                ", ad_pwd='" + ad_pwd + '\'' +
                ", cli_uname='" + cli_uname + '\'' +
                ", cli_pwd='" + cli_pwd + '\'' +
                ", emp_unmae='" + emp_unmae + '\'' +
                ", emp_pwd='" + emp_pwd + '\'' +
                ", cont='" + cont + '\'' +
                '}';
    }
}
