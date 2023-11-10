package org.example;



public class Entity {

    private Long id;
    private String name;
    private String email;

    public static EntityBuilder builder() {
        return new EntityBuilder();
    }


    public static class EntityBuilder {

        private Entity entity = new Entity();

        public EntityBuilder id(Long id) {
            entity.id = id;
            return this;
        }

        public EntityBuilder name(String name) {
            entity.name = name;
            return this;
        }

        public EntityBuilder email(String email) {
            entity.email = email;
            return this;
        }

        public Entity build() {
            return this.entity;
        }

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
