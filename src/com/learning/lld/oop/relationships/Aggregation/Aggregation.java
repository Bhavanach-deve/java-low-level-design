package com.learning.lld.oop.relationships.Aggregation;

class Simcard{
    String number;

    Simcard(String number){
        this.number=number;
    }
}
class Phone{
    private Simcard simcard;
    Phone(Simcard simcard){
        this.simcard=simcard;
    }
    void print(){
        System.out.println(simcard.number);
    }
}

public class Aggregation
{
    static void main(String[] args)
    {
        Phone p=new Phone(new Simcard("12345"));
        p.print();

    }
}
//The SIM card is created independently and supplied to the phone. The same SIM object can be reassigned to another phone in our model.
