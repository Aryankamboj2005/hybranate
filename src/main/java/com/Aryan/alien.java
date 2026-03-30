package com.Aryan;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "Alien_Table")
public class alien {

  @Id
  @Column(name = "Mobile") // used to change the column name form the database
  private int mobile;
  private String name;
  private int marks;

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

  public int getMarks() {
    return marks;
  }

  public void setMarks(int marks) {
    this.marks = marks;
  }

  @Override
  public String toString() {
    return "alien [name=" + name + ", mobile=" + mobile + ", marks=" + marks + "]";
  }
}
