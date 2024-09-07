package MVC;

public class Main {
    public static void main(String[] args) {
        TaskView view = new TaskView();
        TaskController controller = new TaskController(view);
        controller.run();
    }
}