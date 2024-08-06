import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskManager {
    
    private ExecutorService executor;

    public TaskManager() {
        // Initialize the executor service with a fixed thread pool of size 10
        this.executor = Executors.newFixedThreadPool(10);
    }

    public ExecutorService getExecutor() {
        return executor;
    }

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        ExecutorService executor = manager.getExecutor();

        // Submit a task to the executor for execution
        executor.submit(() -> System.out.println("Task executed"));
        
        // Shutdown the executor after tasks are completed
        executor.shutdown();
    }
}
