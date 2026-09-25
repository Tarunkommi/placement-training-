// Create a simple text editor. 
// Suppose the user enters the following text progressively:
//  "Hello", "Hello World", "Hello World Java", "Hello World Java Developer". 
// Every change should be stored in a stack. 
// When the user selects UNDO, restore the previous version.
package Assignments.Assignment5;
import java.util.Stack;

public class UndoRedo {
    static Stack<String> undoStack = new Stack<>();
    static Stack<String> redoStack = new Stack<>();
    static String currentText = "";
    static void write(String text) {
        undoStack.push(currentText);
        currentText = text;
        redoStack.clear();
        System.out.println("Current: " + currentText);
    }
    static void undo() {
        if (undoStack.empty()) {
            System.out.println("Nothing to undo.");
            return;
        }
        redoStack.push(currentText);
        currentText = undoStack.pop();
        System.out.println("UNDO");
        System.out.println("Current: " + currentText);
    }
    static void redo() {
        if (redoStack.empty()) {
            System.out.println("Nothing to redo.");
            return;
        }
        undoStack.push(currentText);
        currentText = redoStack.pop();
        System.out.println("REDO");
        System.out.println("Current: " + currentText);
    }
    public static void main(String[] args) {
        write("Java");
        write("Java Full");
        write("Java Full Stack");
        write("Java Full Stack Developer");
        undo();
        redo();
        undo();
        redo();
    }
}