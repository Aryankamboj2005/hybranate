package com.Aryan;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class alien {
  
  @Id
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
