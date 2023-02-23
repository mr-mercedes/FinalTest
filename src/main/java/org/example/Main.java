package org.example;


import org.example.controller.AnimalController;
import org.example.controller.CountController;
import org.example.model.FileOperation;
import org.example.model.FileWork;
import org.example.model.Repository;
import org.example.model.RepositoryFile;
import org.example.view.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileWork("Animals.txt");
        Repository repository = new RepositoryFile(fileOperation);
        AnimalController controller = new AnimalController(repository);
        CountController countController = new CountController();
        ViewUser view = new ViewUser(controller, countController);
        view.run();
    }
}
