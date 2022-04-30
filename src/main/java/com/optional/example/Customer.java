package com.optional.example;

import java.util.List;

public class Customer {

    private int id;
    private String cName;
    private String addr;
    private List<String> phoneNumber;

    public Customer(int id, String cName, String addr, List<String> phoneNumber) {
        this.id = id;
        this.cName = cName;
        this.addr = addr;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
