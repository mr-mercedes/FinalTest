package org.example.model.animals;

import java.util.List;

public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat(Integer id, String name, int age, List<String> commands) {
        super(id, name, age, commands);
    }
}
