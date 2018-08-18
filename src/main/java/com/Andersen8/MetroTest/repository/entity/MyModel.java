package com.Andersen8.MetroTest.repository.entity;

public class MyModel {
    private String id;
    private String name;
    private String age;
    private String mobile_no;

    public MyModel() {
    }

    public MyModel(String id, String name, String age, String mobile_no) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobile_no = mobile_no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }
}
