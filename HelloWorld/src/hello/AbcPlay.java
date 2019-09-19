package hello;

public class AbcPlay {
	public static void main(String[] args) {
		char alp = 'A';
		int num = alp;
		for (int i = 0; i < 26; i++) {
			// System.out.println(num);
			// for(int a=65; a<i; a++) {
			System.out.println(alp++ + "," + num++);
		}

		String[] strAry = { "Hello", "How", "are", "you?" }; // 배열이 가지고 있는 주소가 들어감
		String[] copyAry = new String[strAry.length]; // strAry와 크기가 같은 배열이 만들어짐
		//for (int i = 0; i < strAry.length; i++) {
		//	strAry[i] = copyAry[i];
		//} // 같은 인덱스에 같은 위치값을 넣는 것
		System.arraycopy(strAry, 0, copyAry, 0, 2);
		//메소드를 좀 더 간편하게 적기: 끌어올 배열의 이름, 자리의 값, 붙일 배열의 이름, 자리의 값, 출력할 배열(데이터)의 숫자
		for (String str : copyAry) {
			System.out.println(str);
		}
		
		

	}
}
