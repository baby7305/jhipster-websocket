package com.mycompany.myapp.domain;

import java.io.Serializable;
import java.util.Date;

public class Stu implements Serializable {
    private String name;
    private int age;
    private Date date;

    public Stu() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Stu{" + "name='" + name + '\'' + ", age=" + age + ", date=" + date + '}';
    }
}
