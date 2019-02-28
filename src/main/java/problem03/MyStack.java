package problem03;

public class MyStack {
	
	private String[] buffer;
	private int cur = -1;
	private int _size;
	private int stack_size = 0;

	public MyStack( int size ) {
		buffer = new String[size];
		_size = size;
	}
	
	public void push(String item) {
		if (stack_size + 1 > _size) {
			String[] newBuffer = new String[stack_size * 2];
			for (int i = 0; i < buffer.length; i++) {
				newBuffer[i] = buffer[i];
			}
			buffer = newBuffer;
			_size = stack_size * 2;
		}
		buffer[++cur] = item;
		stack_size++;
	}

	public String pop() {
		if (!isEmpty()) {
			stack_size--;
			return buffer[cur--];
		} else {
			return null;
		}
	}

	public boolean isEmpty() {
		return stack_size == 0;
	}
	
	public int size() {
		return stack_size;
	}
}