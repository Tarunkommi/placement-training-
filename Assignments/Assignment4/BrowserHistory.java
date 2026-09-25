// Create a simple browser history. 
// Suppose the user visits: Google, YouTube, Instagram, Amazon, GitHub — in that order. 
// Store the visited pages in a stack. 
// When the user presses BACK, the previous page should appear.
package Assignments.Assignment4;
import java.util.Stack;
public class BrowserHistory {
    static Stack<String> backStack = new Stack<>();
    static Stack<String> forwardStack = new Stack<>();
    static String currentPage;
    static void visit(String page) {
        if (currentPage != null) {
            backStack.push(currentPage);
        }

        currentPage = page;
        forwardStack.clear();
        System.out.println("Visited: " + currentPage);
    }

    static void back() {
        if (backStack.empty()) {
            System.out.println("No previous page.");
            return;
        }
        forwardStack.push(currentPage);
        currentPage = backStack.pop();
        System.out.println("Current Page: " + currentPage);
    }

    static void forward() {
        if (forwardStack.empty()) {
            System.out.println("No forward page.");
            return;
        }
        backStack.push(currentPage);
        currentPage = forwardStack.pop();
        System.out.println("Current Page: " + currentPage);
    }

    public static void main(String[] args) {
        visit("Google");
        visit("YouTube");
        visit("Instagram");
        visit("Amazon");
        visit("GitHub");
        System.out.println("Current Page: " + currentPage);
        System.out.println("BACK");
        back();
        System.out.println("FORWARD");
        forward();
        System.out.println("BACK");
        back();
        System.out.println("FORWARD");
        forward();
    }
}