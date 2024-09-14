//package ex01_generic;
//
//public class DataList<T> {
//	private Object[]data; // Object 타입의 배열
//	private int size ; // 배열의 크기
//	private int defaultSize = 10 ;// 기본 배열의 크기 
//	
//	//생성자를 호출하면 기본크기만큼의 배열을 생성
//	public DataList() {
//		data = new Object[defaultSize];
//	}
//	//생성자 오버로딩을 통해 내가 원하는 크기만큼의 배열을 생성한다 .
//	public DataList(int size) {
//		data = new Object[size];
//		
//	}
//	//매개변수에 전달된 값을 배열에 순차적으로 대입하는 add메서드
//	public void add(Object value) {
//		data[size++] = value ;
//	}
//	
//	//인덱스를 전달받아 배열에 들어있는 값을 반환받는 get 메서드
//	public Object get(int index) {
//		return data[index];
//	}
//	
//	//배열의 크기를 반환하는 size() 메서드
//	public int size() {
//		return size;
//	}
//	
//}
