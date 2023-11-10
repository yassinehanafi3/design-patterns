package org.example;

public class Entity {

    private Entity() {
    }

    public static final Entity entity;

    static {
        entity = new Entity();
    }

    public static Entity getInstance() {
        return entity;
    }

    public void hello() {
        System.out.println("Hello World !");
    }


}
