package org.example.animals;


public abstract class Sumpters extends Animal {

    private String work;
    public Sumpters(String name, int age, String work) {
        super(name, age);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", " +
                "name = " + this.getName() + ", " +
                "age = " + this.getAge() + ", " +
                "type = " + this.getWork();
    }
}
