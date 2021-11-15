package com.example.springbootproject;


public class Entities {
    private int id;
    private String bloodGrp;
    private String name;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBloodGrp() {
        return bloodGrp;
    }

    public void setBloodGrp(String bloodGrp) {
        this.bloodGrp = bloodGrp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Entities(int id, String bloodGrp, String name, String address) {
        this.id = id;
        this.bloodGrp = bloodGrp;
        this.name = name;
        this.address = address;
    }

    public Entities() {
    }

    @Override
    public String toString() {
        return "Entities{" +
                "id=" + id +
                ", bloodGrp='" + bloodGrp + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
