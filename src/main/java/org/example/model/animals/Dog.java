package org.example.model.animals;

import java.util.List;

public class Dog extends Pet {

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog(Integer id, String name, int age, List<String> commands) {
        super(id, name, age, commands);
    }
}
