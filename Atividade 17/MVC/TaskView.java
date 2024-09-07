package MVC;

import java.util.List;
import java.util.Scanner;

public class TaskView {
    private Scanner scanner;

    public TaskView() {
        scanner = new Scanner(System.in);
    }

    public void displayTasks(List<Task> tasks) {
        System.out.println("Lista de Tarefas:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}