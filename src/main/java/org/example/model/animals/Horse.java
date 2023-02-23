package org.example.model.animals;

import java.util.List;

public class Horse extends Sumpter {

    public Horse(String name, int age) {
        super(name, age);
    }

    public Horse(Integer id, String name, int age, List<String> commands) {
        super(id, name, age, commands);
    }
}
