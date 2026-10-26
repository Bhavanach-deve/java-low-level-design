package com.learning.lld.oop.relationships.Association;

class Earphones
{
    void playSound(){
        System.out.println("Playing music....");
    }
}
class Phone{
    void playMusic(Earphones earphones){
        earphones.playSound();
    }
}

public class Association
{
    public static void main(String[] args)
    {
        Phone p=new Phone();
        p.playMusic(new Earphones());

    }
}
//The phone uses the earphones passed to it. It doesn't need to create or own them