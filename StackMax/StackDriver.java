public class StackDriver {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(12);
		stack.peek();
		stack.push(5);
		System.out.println(stack.max());
		stack.peek();
		stack.pop();
		stack.push(15);
		stack.pop();
		System.out.println(stack.max());
		stack.push(20);
		System.out.println(stack.max());
		stack.pop();
		System.out.println(stack.max());
	}
}
