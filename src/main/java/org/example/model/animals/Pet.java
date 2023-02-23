package org.example.model.animals;

import java.util.List;

public abstract class Pet extends Animal {

    public Pet(String name, int age) {
        super(name, age);
    }

    public Pet(Integer id, String name, int age, List<String> commands) {
        super(id, name, age, commands);
    }
}
