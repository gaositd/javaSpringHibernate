package com.cursojava.cursojavaspringboot.models;

public class UsersDataTemp {
    private Long id;
    private String name;
    private String lastNames;
    private String address;
    private int age;
    private String phoneNumber;

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

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void clearUserdata(){
        name = null;
        lastNames = null;
        age = 0;
        address = null;
        address = null;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", lastNames='" + lastNames + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
