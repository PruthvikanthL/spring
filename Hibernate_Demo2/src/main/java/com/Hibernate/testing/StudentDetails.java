package com.Hibernate.testing;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentDetails {
    @Id
    private int sid;
    private String sname;
    private String tech;

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public int getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public String getTech() {
        return tech;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
