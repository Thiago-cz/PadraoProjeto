package DAO;

import java.util.List;

public interface TaskDAO {
    void addTask(Task task);
    void updateTask(Task task);
    void deleteTask(int id);
    Task getTask(int id);
    List<Task> getAllTasks();
}
