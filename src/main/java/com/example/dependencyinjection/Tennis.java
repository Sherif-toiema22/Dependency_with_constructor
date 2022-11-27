package com.example.dependencyinjection;

public class Tennis implements Sport{

    @Override
    public String name() {
        return "tennis ";
    }

    @Override
    public String GetMessage() {
        return "Today is your lucky day^_^";
    }

}
