package com.bjpowernode.domain;

public class School {
    private Integer id;
    private Integer stuid;
    private Integer age;

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", stuid=" + stuid +
                ", age=" + age +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
