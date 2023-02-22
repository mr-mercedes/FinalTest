package org.example.animals;

import org.example.Command;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    private String name;
    private int age;
    List<Command> commands = new ArrayList<>();

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addCommand(Command command){
        this.commands.add(command);
    }

    public void showCommands(){
        for (Command command : this.commands) {
            System.out.println(command.getCommand());
        }
    }

}
