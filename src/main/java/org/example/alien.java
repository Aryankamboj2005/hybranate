package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // for the hybernate
public class alien {
    private String name;
    @Id // entity kee priya key
    private int mobile;
    private int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }
}
