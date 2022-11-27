package com.example.dependencyinjection;

public class Office implements Service{

    @Override
    public String name() {
        return "Employee name";
    }


    public String ID_employee(){
        return "the id of employee";
    }
}
