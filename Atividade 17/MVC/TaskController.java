package MVC;

import java.util.ArrayList;
import java.util.List;

public class TaskController {
    private List<Task> tasks;
    private TaskView view;

    public TaskController(TaskView view) {
        this.tasks = new ArrayList<>();
        this.view = view;
    }

    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
        }
    }

    public void displayTasks() {
        view.displayTasks(tasks);
    }

    public void run() {
        while (true) {
            displayTasks();
            String choice = view.getInput("Escolha uma opção (1: Adicionar, 2: Completar, 3: Sair): ");

            switch (choice) {
                case "1":
                    String description = view.getInput("Digite a descrição da tarefa: ");
                    addTask(description);
                    break;
                case "2":
                    String indexStr = view.getInput("Digite o número da tarefa a ser completada: ");
                    try {
                        int index = Integer.parseInt(indexStr) - 1;
                        completeTask(index);
                    } catch (NumberFormatException e) {
                        view.displayMessage("Número inválido.");
                    }
                    break;
                case "3":
                    view.displayMessage("Encerrando o programa.");
                    return;
                default:
                    view.displayMessage("Opção inválida.");
            }
        }
    }
}