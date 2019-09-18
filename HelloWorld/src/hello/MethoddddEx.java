package hello;

public class MethoddddEx {

	public static void main(String[] args) {
		int[] ary = showArray(1, 2, 3, 4, 5);
				for (int i=0; i<ary.length; i++) {
					System.out.println(ary[i]);
				}
				for(int a:ary) {
					System.out.println(a);
				}
	}
 
	public static int [] showArray(int a, int b, int c, int d, int e) {
		int [] ary = {a,b,c,d,e};
		return ary;

			}
			
			}

