package com.yedam.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 80);
		map.put("이길동", 70);
		map.put("박길동", 60);
		map.put("홍길동", 50);
		System.out.println("Entry 갯수: " + map.size());
		System.out.println("방법 1");
		Set<String> keyset = map.keySet();
		Iterator<String> iter = keyset.iterator(); // 반복자를 통해서 데이터를 가지고 옴
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println("key: " + key + ", value: " + map.get(key));
		}
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> mapIter = entrySet.iterator();
		while (mapIter.hasNext()) {
			Map.Entry<String, Integer> ent = mapIter.next();
			System.out.println("ket: " + ent.getKey() + ", value: " + ent.getValue());
		}
		
//		for(Map.Entry<String, Integer> mapEmt : entrySet) {
//			System.out.println(mapEnt.getKey()+ ", "+mapEnt.getValue());
		}
//		for(Entry<String,Integer> ent: map) {
//			System.out.println();
//		}

	}


