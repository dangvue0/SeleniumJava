package com.dangvue0.testme;

public class employee {
    String firstName, lastName;
    int id, pay;
    int birthday;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", pay=" + pay +
                ", birthday=" + birthday +
                '}';
    }

    public employee(String firstName, String lastName, int id, int pay, int birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.pay = pay;
        this.birthday = birthday;
    }
}

