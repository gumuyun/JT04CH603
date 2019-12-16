package com.zcbdqn.pojo;

public class Master {

    public Pet delivery(String type){
        Pet pet=null;
        switch (type){
            case "dog":
                pet=new Dog();
                break;
            case "penguin":
                pet=new Penguin();
                break;
        }
        return pet;
    }
}
