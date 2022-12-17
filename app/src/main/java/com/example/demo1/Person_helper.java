package com.example.demo1;

import java.io.Serializable;
import java.util.ArrayList;

public class Person_helper implements Serializable {
    private String name,dob,gender,address,qualification,percentage,college;
    private ArrayList<String> techSkills;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public ArrayList<String> getTechSkills() {
        return techSkills;
    }

    public void setTechSkills(ArrayList<String> techSkills) {
        this.techSkills = techSkills;
    }
}
