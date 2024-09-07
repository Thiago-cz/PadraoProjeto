package DAO;

public class Main {
    public static void main(String[] args) {
        TaskDAO taskDAO = new TaskDAOImpl();

        taskDAO.addTask(new Task(1, "Tarefa 1"));
        taskDAO.addTask(new Task(2, "Tarefa 2"));
        taskDAO.addTask(new Task(3, "Tarefa 3"));

        
        System.out.println("\nMostrando todas as tarefas:");
        for (Task task : taskDAO.getAllTasks()) {
            System.out.println(task);
        }
        
        System.out.println("\nAtualizando tarefa");
        Task taskToUpdate = taskDAO.getTask(2);
        taskToUpdate.setCompleted(true);
        taskDAO.updateTask(taskToUpdate);

        System.out.println("\nRecuperando tarefas por id:");
        System.out.println(taskDAO.getTask(2));
        System.out.println(taskDAO.getTask(1));

        taskDAO.deleteTask(3);

        System.out.println("\nMostrando tarefas apos deleção");
        for (Task task : taskDAO.getAllTasks()) {
            System.out.println(task);
        }
    }
}
