package com.yedam.generic;

public class Box<T> {
	
	private T obj ; //최상위 클래스이기 때문에 어떤 객체든 만들 수 있음(모든 클래스들은 오브젝트를 상속함)

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) { //어떤 매개값이든 다 받을 수 있도록 하겠다
		this.obj = obj;
	}

}
