package com.yedam.lamda;

import java.util.function.IntBinaryOperator;

public class OperatorEx {

	static int[] scores = { 92, 95, 87 };

	static int minOrMax(IntBinaryOperator oper) {
		int rs = scores[0];
		for (int score : scores) {
			rs = oper.applyAsInt(rs, score); // 둘 중에서 큰 값을 리턴하겠다
		}
		return rs;

	}

	public static void main(String[] args) {

		int result = 0;
		IntBinaryOperator oper = (a, r) -> {
			return (a >= r ? a : r);
			

		};System.out.println("max: "+oper);

		result = minOrMax((e, f) -> {
			return (e >= f ? f : e);

		});
		System.out.println("min: "+result);

	}
}
