package com.example.dependencyinjection;

public class ATM implements Service{
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Office office;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSetting(Office office)
    {
        this.office=office;
    }

    @Override
    public String name() {
        return "Hello in the bank";
    }


}
