package org.example.model.animals;

import java.util.List;

public class Hamster extends Pet {

    public Hamster(String name, int age) {
        super(name, age);
    }

    public Hamster(Integer id, String name, int age, List<String> commands) {
        super(id, name, age, commands);
    }
}
