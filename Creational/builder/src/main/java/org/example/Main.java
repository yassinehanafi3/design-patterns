package org.example;

public class Main {

    public static void main(String[] args) {

        Entity entity1 = Director.entityBuilder()
                .name("Yassine EL HANAFI")
                .email("elhanafiyassine21@gmail.com")
                .build();

        Entity entity2 = Entity.builder()
                .name("Yassine EL HANAFI")
                .email("elhanafiyassine21@gmail.com")
                .build();

        System.out.println("Hello 1 : " + entity1);
        System.out.println("Hello 2 : " + entity2);
    }
}