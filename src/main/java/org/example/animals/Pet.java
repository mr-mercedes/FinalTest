package org.example.animals;


public abstract class Pet extends Animal {

    private String type;

    public Pet(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", " +
                "name = " + this.getName() + ", " +
                "age = " + this.getAge() + ", " +
                "type = " + this.getType();
    }
}
