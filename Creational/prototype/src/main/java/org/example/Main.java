package org.example;

public class Main {
    public static void main(String[] args) {

        Entity entity = new Entity();
        entity.setId(100L);
        entity.setName("Yassine EL HANAFI");
        entity.setEmail("elhanafiyassine21@gmail.com");

        System.out.println("Hello Original Entity : " + entity);

        System.out.println("\n--------------------------------\n");

        try {
            Entity entityClone = entity.clone();
            System.out.println("Hello Clone Entity : " + entityClone);

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


    }
}