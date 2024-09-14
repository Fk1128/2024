package ex04_generic;

import java.util.ArrayList;
import java.util.List;

interface Readable{};
interface Closeable{};

class BoxType implements Readable,Closeable{};
class Box <T extends Readable & Closeable>{
	List<T> list = new ArrayList<>();
	
	public void add(T item) {
		list.add(item);
	}
}
public class Ex03_Generic {
	public static void main(String[] args) {
		Box<BoxType> box = new Box<>();
		//Box<Object> box2 = new Box<>();
		//심지어 최상위 클래스인 Object도 사용할 수 없다 .
		//Readable과 Closeable 를 동시에 구현한 클래스만이 타입할당이 가능하다 .
		
		box.add(null);
		
		
	}
}
