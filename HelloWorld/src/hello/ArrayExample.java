package hello;

public class ArrayExample {
   public static void main(String[] args) {
	
	   
	   int[] aAry = new int[5];
	   aAry[0] = 10;
	   aAry[1] = 20;
	   aAry[2] = 30;
	   aAry[3] = 40;
	   aAry[4] = 50;
	   
	   for (int i = 0; i<aAry.length; i++) {
		   aAry[i] = i * 10+10;
		  
	   }
	   for (int i = 0; i<aAry.length; i++) {
		   System.out.println(aAry[i]);
		   
		   sum = 0;
		   for(int i = 0; i<aAry.length; i++) {
			   sum =+ aAry[i];
		   }
System.out.println("aAry 배열의 합: " + sum);                                       
	   
	   
	   
   

