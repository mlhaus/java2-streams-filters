package edu.kirkwood;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String givenName;
    private String surName;
    private int age;
    private Gender gender;
    private Role role;
    private String dept;
    private String email;
    private String phone;
//    private String address;
//    private String city;
//    private String state;
//    private String code;

    public Employee() {
    }

    public Employee(String givenName, String surName, int age, Gender gender
                    , Role role, String dept, String email, String phone
//                    , String address, String city, String state, String code
        ) {
        this.givenName = givenName;
        this.surName = surName;
        this.age = age;
        this.gender = gender;
        this.role = role;
        this.dept = dept;
        this.email = email;
        this.phone = phone;
//        this.address = address;
//        this.city = city;
//        this.state = state;
//        this.code = code;
    }

    public static List<Employee> getShortList() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", "Adams", 52, Gender.MALE, Role.MANAGER, "Sales", "john.adams@example.com", "112-111-1111"));
        employees.add(new Employee("Betty", "Jones", 65, Gender.FEMALE, Role.EXECUTIVE, "Sales", "betty.jones@example.com", "211-333-1234"));
        employees.add(new Employee("Marc", "Hauschildt", 40, Gender.MALE, Role.SALARIED, "Education", "Marc.Hauschildt@kirkwood.edu", "319-555-5555"));
        return employees;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getState() {
//        return state;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
//    public String getCode() {
//        return code;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "givenName='" + givenName + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}