package com.yedam.generic;

public class Util {

	public static <T> Box<T> boxing(T t) { // boxing T 라는 값을 Box<T>에 리턴
		// return타입 앞에다가 제너릭값을 적어두기: <T> 라는 걸 적어줌으로써 타입형 정의
		Box<T> box = new Box<T>(); // 인스턴스 만들고
		box.setObj(t); // 매개값을 받는 t
		return box;
	}

	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean boo1 = p1.getKey().equals(p2.getKey());
		boolean boo2 = p1.getValue().equals(p2.getValue());
		return boo1 && boo2;
		
		
	}
	static <K, V> boolean compareValue(Pair<K, V> x1, Pair <K, V> x2) {
		boolean boo3 = x1.getValue().equals(x2.getValue());
		return boo3;
	}

	public static <T extends Number> int compare(Double t1, Double t2) {
		double d1 = t1.doubleValue();
		double d2 = t2.doubleValue();
		return Double.compare(d1, d2);
		
	}

}
