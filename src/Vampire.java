import java.util.Random;

//: control/E10_Vampire.java
/****************** Exercise 10 *********************
 * A vampire number has an even number of digits and
 * is formed by multiplying a pair of numbers containing
 * half the number of digits of the result. The digits
 * are taken from the original number in any order.
 * Pairs of trailing zeroes are not allowed. Examples
 * include:
 * 1260 = 21 * 60
 * 1827 = 21 * 87
 * 2187 = 27 * 81
 * Write a program that finds all the 4-digit vampire
 * numbers. (Suggested by Dan Forhan.)
 ****************************************************/
//package control;

public class Vampire {
  public static void main(String[] args) {
    int[] startDigit = new int[4];
    int[] productDigit = new int[4];
    for(int num1 = 10; num1 <= 99; num1++)
      for(int num2 = num1; num2 <= 99; num2++) {
        // Pete Hartley's theoretical result:
        // If x·y is a vampire number then 
        // x·y == x+y (mod 9)
        if((num1 * num2) % 9 != (num1 + num2) % 9)
          continue;
        int product = num1 * num2;
        startDigit[0] = num1 / 10;
        startDigit[1] = num1 % 10;
        startDigit[2] = num2 / 10;
        startDigit[3] = num2 % 10;
        productDigit[0] = product / 1000;
        productDigit[1] = (product % 1000) / 100;
        productDigit[2] = product % 1000 % 100 / 10;
        productDigit[3] = product % 1000 % 100 % 10;
        int count = 0;
        for(int x = 0; x < 4; x++)
          for(int y = 0; y < 4; y++) {
            if(productDigit[x] == startDigit[y]) {
              count++;
              productDigit[x] = -1;
              startDigit[y] = -2;
              if(count == 4)
                System.out.println(num1 + " * " + num2
                  + " : " + product);
            }
          }
      }
  }}
/* 
 * 
 * 
 * static void liczbaWampirza(){
		/*int [] q = new int[10];
		int [] w = new int[10];
		int [] e = new int[10];
		int [] r = new int[10];
		int p1 = 0, p2 = 0;
		for(int i = 0; i<10; i++) q[i]=i;
		for(int i = 0; i<10; i++) w[i]=i;
		for(int i = 0; i<10; i++) e[i]=i;
		for(int i = 0; i<10; i++) r[i]=i;
		

			for(int y = 10; y < 100; y++){
				for(int z = 10; z < 100; z++){
					print(p2++ + ": " + y*z);
					// y i z zrobiæ na chary
				}
			
		}
		
		
		//for(int z : r) print(z);
		
		char c = 1, d=0;
		int a = c;
	
		
		char[] tab = new char[4];
		for(int i=1000;i<908;i++){
			a=0;
			for(char g : (Integer.toString(i)).toCharArray()){
				tab[a++]=g;
			}
				System.out.print(tab);
				c=tab[0];//+tab[3];
				d=tab[3];
				a=c;
				print(" "+a);
			print(" ");
		}
		a=0;
		Random rand = new Random();
		for(;;){
			int x = rand.nextInt(99);
			int y = rand.nextInt(99);
			if(x<10||y<10) continue;
			int z = x*y;
			if(z<1000||z>9999) continue;
			a++;
			print(z);
			if(a>8) break;
		
		}
			
	}
 * 
 * 
 * 
 * 
 * 
 * 
 * Output:
 /*
15 * 93 : 1395
21 * 60 : 1260
21 * 87 : 1827
27 * 81 : 2187
30 * 51 : 1530
35 * 41 : 1435
80 * 86 : 6880*/