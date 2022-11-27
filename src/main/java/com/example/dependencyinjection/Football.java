package com.example.dependencyinjection;

public class Football implements Sport{

    private Tennis tennis;

    public Football(Tennis tennis){
        this.tennis=tennis;
    }


    @Override
    public String name() {

        return "Football";
    }
    public String GetMessage(){
        return "Just Do It: "+tennis.GetMessage();
    }
}
