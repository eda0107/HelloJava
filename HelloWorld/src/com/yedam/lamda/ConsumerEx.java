package com.yedam.lamda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx {

	public static void main(String[] args) {
		Consumer<String> consumer = (t) -> { // 매개값 t를 consumer-accept를 구현
			System.out.println(t + "8");
		};

		consumer.accept("java"); // 매개값으로 String t를 받음

		BiConsumer<String, String> biConsumer = (t, u) -> {
			System.out.println(t + u);
		};

		biConsumer.accept("java", "8");

		DoubleConsumer dbConsumer = (d) -> {
			System.out.println("java" + d);
		};

		dbConsumer.accept(8);

		ObjIntConsumer<String> objConsumer = (t, o) -> {
			System.out.println(t + o);
		};
		objConsumer.accept("java", 8);

	}
}
