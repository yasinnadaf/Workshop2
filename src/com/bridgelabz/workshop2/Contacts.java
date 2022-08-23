package com.bridgelabz.workshop2;

public class Contacts {
    private String name;
    private String age;
    private String city;
    private String state;
    private long phoneNumber;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
