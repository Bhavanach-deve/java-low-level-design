package com.learning.lld.oop.relationships.Composition;

class InternalAssembly{
    void initialize(){
        System.out.println("Assembly initialized");
    }
}
class Phone{
    private final InternalAssembly assembly;
     Phone(){
         this.assembly = new InternalAssembly();
         assembly.initialize();
     }
}

public class Composition
{
    public static void main(String[] args)
    {
        Phone p=new Phone();

    }
}
//The phone creates and retains its assembly. This represents strong ownership in our design.