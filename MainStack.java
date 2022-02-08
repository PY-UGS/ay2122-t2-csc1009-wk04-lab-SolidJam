public class MainStack {
    public static void main(String[] args) {
        StackIntegers stack = new StackIntegers();
        for(int i = 0; i < 10; i++) {
            stack.push(i);
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.print("\n");
    }
}
