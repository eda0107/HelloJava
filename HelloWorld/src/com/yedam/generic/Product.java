package com.yedam.generic;

public class Product<T, M> {
	
	private T tea; //필드명
	private M model;
	public T getTea() {
		return tea;
	}
	public void setTea(T tea) {
		this.tea = tea;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	@Override //메소드 재정의
	public String toString() {
		return "Product [tea=" + tea + ", model=" + model + "]";
	}
	
	

}
