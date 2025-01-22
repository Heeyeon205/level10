package _07제네릭클래스;

class MyArrayList<T> {
	private T[] arr;
	private static final int DEFAULT_CAPACITY = 10;
	private int capacity = 10;
	private int size;

	MyArrayList() {
//		arr = new T[capacity]; // 제네릭 클래스는 배열 선언을 할 수 없다.
		arr = (T[]) new Object[10];
		size = 0;
	}

	@Override
	public String toString() {
		if (size == 0) {
			return "[ ]";
		} else {
			String data = "[";
			for (int i = 0; i < size; i++) {
				data += arr[i] + ", ";
			}
			data = data.substring(0, data.length() - 2);
			data += "]";
			return data;
		}
	}

	public void extentionCapacity() {
		if (size == capacity) {
			capacity += DEFAULT_CAPACITY;
			int idx = 0;
			T[] temp = (T[]) new Object[capacity];
			for (int i = 0; i < size; i++) {
				temp[idx++] = arr[i];
			}
			arr = temp;
		}
	}
	
	public void reductionCapacity() {
		 if(capacity - size == DEFAULT_CAPACITY) {
			capacity -= DEFAULT_CAPACITY;
		}
	}
	
	public int capacity() {
		return capacity;
	}

//	 1. 추가: add(value)
	public boolean add(T value) {
		extentionCapacity();
		arr[size] = value;
		size++;
		return true;
	}

//	 2-1. 삭제: remove(idx)
	public T remove(int idx) {
		if(idx < 0 || idx >= size) {
			throw new ArrayIndexOutOfBoundsException("방 길이를 초과했습니다.");
		}
		T t = arr[idx]; 
		for (int i = idx; i < size - 1; i++) {
			arr[i] = arr[i + 1];
		}
		size--;
		reductionCapacity();
		return t;
	}
	
//	 2-2. 삭제: remove(value)
	public boolean remove(T value) {
		int idx = -1;
		for(int i = 0; i < size; i++) {
			if(value.equals(arr[i])) {
				idx = i;
				break;
			}
		}
		if(idx == -1) {
			return false;
		}
		for(int i = idx; i < size-1; i++) {
			arr[i] = arr[i+1];
		}
		size--;
		reductionCapacity();
		return true;
	}
	
//	 3. 삽입: add(idx, value)
	public void add(int idx, T value) {
		if (idx < 0 || idx > size) {
			throw new ArrayIndexOutOfBoundsException("방 길이를 초과했습니다.");
		}
		extentionCapacity();
		for(int i = size; i > idx; i--) {
			arr[i] = arr[i-1];
		}
		arr[idx] = value;
		size++;
	}
//	 4. 수정: set(idx, value)
	public T set(int idx, T value) {
		if (idx < 0 || idx > size) {
			throw new ArrayIndexOutOfBoundsException("방 길이를 초과했습니다.");
		}
		T t = value;
		arr[idx] = value;
		return t;
	}
//	 5. 갯수: size()
	public int size() {
		return size;
	}
//	 6. 값 읽기: get(idx)
	public T get(int idx) {
		if (idx < 0 || idx >= size) {
			throw new ArrayIndexOutOfBoundsException("방 길이를 초과했습니다.");
		}
		return arr[idx];
	}

//	 7. 전체 삭제: clear()
	public void clear() {
		capacity = DEFAULT_CAPACITY;
		arr = (T[]) new Object[capacity];
		size = 0;
	}
}

public class _02ArrayList구현2 {

	public static void main(String[] args) {

		MyArrayList<Double> list1 = new MyArrayList<>();
		for(int i = 0; i < 5; i++) {
			list1.add((i+1) * 10*1.0);
		}
		System.out.println(list1);
		list1.remove(0);
		System.out.println(list1);
		list1.remove((Double) 13.0);
		System.out.println(list1);
		list1.add(1, 11.5);
		System.out.println(list1);
		System.out.println(list1.size());
		System.out.println(list1.capacity());
		System.out.println(list1.get(0));
		System.out.println(list1.set(3, 12.5));
		System.out.println(list1);
		list1.clear();
		System.out.println(list1);

		System.out.println("=====list2=====");
		MyArrayList<Integer> list2 = new MyArrayList<>();
		for(int i = 0; i < 11; i++) {
			list2.add((i+1)*10);
		}
		System.out.println(list2);
		System.out.println(list2.capacity());
		System.out.println(list2.size());
		list2.remove(10);
		System.out.println(list2);
		System.out.println(list2.capacity());
		System.out.println(list2.size());
	}

}
