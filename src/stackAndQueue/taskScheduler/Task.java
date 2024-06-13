package stackAndQueue.taskScheduler;

public class Task {

    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public String toString() {
        return String.format("%s - %d", this.name, this.priority);
    }

}
