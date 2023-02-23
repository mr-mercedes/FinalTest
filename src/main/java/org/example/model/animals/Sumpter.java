package org.example.model.animals;

import java.util.List;

public abstract class Sumpter extends Animal {

    public Sumpter(String name, int age) {
        super(name, age);
    }

    public Sumpter(Integer id, String name, int age, List<String> commands) {
        super(id, name, age, commands);
    }
}
