import java.util.Stack;

public class StackAddTheMiddle {
        public static void main(String args[]){
            Stack<String> stack = new Stack<String>();

            stack.add("1");
            stack.add("2");
            stack.add("3");
            stack.add("4");
            stack.add("5");
            stack.add("6");

            System.out.println(" Stack quyidagicha :  " + stack);
            stack.insertElementAt("Man qo'shildim  ", middle(stack));
            System.out.println("Element qo'shilgandan keyingi holat 🔜  " + stack);
        }

    private static int middle(Stack<String> stack) {
        return stack.size() / 2;
    }
}
