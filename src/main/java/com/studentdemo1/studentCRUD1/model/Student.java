package com.studentdemo1.studentCRUD1.model;

import com.fasterxml.jackson.annotation.JsonProperty;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import lombok.AllArgsConstructor;
// import lombok.Data;
// import lombok.NoArgsConstructor;

//@NoArgsConstructor
//@AllArgsConstructor
//@Data
// @Entity
public class Student {
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@JsonProperty("id")
    private Long id;
    //@JsonProperty("name")
    private String name;
    //@JsonProperty("age")
    private int age;
    public Student() {
    }
    public Student(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", id=" + id + ", name=" + name + "]";
    }
}
