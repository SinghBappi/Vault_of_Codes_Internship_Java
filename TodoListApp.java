
import java.util.ArrayList;
import java.util.Scanner;

public class TodoListApp {

    public static class Task {
        private String description;
        private boolean isComplete;

        public Task(String description) {
            this.description = description;
            this.isComplete = false;
        }

        public void markComplete() {
            this.isComplete = true;
        }

        @Override
        public String toString() {
            // Displays "[DONE]" or "[TODO]" based on the status
            return (isComplete ? "[DONE] " : "[TODO] ") + description;
        }
    }

    // 2 Application

    private static ArrayList<Task> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            printMenu();
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        addTask();
                        break;
                    case 2:
                        displayTasks();
                        break;
                    case 3:
                        markTaskComplete();
                        break;
                    case 4:
                        deleteTask();
                        break;
                    case 5:
                        running = false;
                        System.out.println("Exiting To-Do List Application. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n------ To-Do List Menu ------");
        System.out.println("1. Add Task");
        System.out.println("2. Display Tasks");
        System.out.println("3. Mark Task as Complete");
        System.out.println("4. Delete Task");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void addTask() {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        tasks.add(new Task(description));
        System.out.println("Task added successfully.");
    }

    public static void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Your to-do list is empty! Time to relax or add a task.");
            return;
        }
        System.out.println("\n--- Current Tasks ---");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public static void markTaskComplete() {
        displayTasks();
        if (tasks.isEmpty())
            return;

        System.out.print("Enter the number of the task to mark as complete: ");
        if (scanner.hasNextInt()) {
            int taskNumber = scanner.nextInt();
            scanner.nextLine();

            if (taskNumber > 0 && taskNumber <= tasks.size()) {
                tasks.get(taskNumber - 1).markComplete();
                System.out.println("Task marked as complete.");
            } else {
                System.out.println("Invalid task number. Please try again.");
            }
        } else {
            System.out.println("Invalid input. Task number must be a digit.");
            scanner.nextLine();
        }
    }

    public static void deleteTask() {
        displayTasks();
        if (tasks.isEmpty())
            return;
        System.out.println("Enter the number of the task to delete:");
        if (scanner.hasNextInt()) {
            int taskNumber = scanner.nextInt();
            scanner.nextLine();

            if (taskNumber>0 && taskNumber<=tasks.size()) {
                tasks.remove(taskNumber-1);
                System.out.println("Task Deleted Successfully");

            }
            else{
                System.out.println("Invalid task number. Please try again !");

            }
        }
        else{
            System.out.println("Invalid input.Task number must be a digit");
            scanner.nextLine();

        }
    }   
}
