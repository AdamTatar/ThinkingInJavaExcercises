package pakietDef;

import java.util.*;

public class BinaryGap {

	public static int solution(int n) {
		Integer x = new Integer(n);
		String s = x.toBinaryString(n);
		do{
			if(s.endsWith("0")){s=s.substring(0, s.length()-1);};
		}while(s.endsWith("0"));
		String[] t = new String[32];
		t = s.split("1");
		int maks = 0;
		for (String st : t) {
			if (st.length() > maks)
				maks = st.length();
		}
		return maks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		solution(51712);
//		
		solution(4);
//		solution(2);
		solution(8);
		solution(15);
//		solution(4567899);
		solution(67865900);
//		solution(2147483647);

		solution(6);
//		solution(0);
		
		//sprawdzić parzystość, jak zero na końcu to usunąć ostatniego stringa z tablicy3
		
	}

}

// A binary gap within a positive integer N is any maximal sequence of
// consecutive zeros that is surrounded by ones at both ends in
// the binary representation of N.
//
// For example, number 9 has binary representation 1001 and contains a binary
// gap of length 2.
// The number 529 has binary representation 1000010001 and contains two binary
// gaps: one of length 4 and one of length 3.
// The number 20 has binary representation 10100 and contains one binary gap of
// length 1.
// The number 15 has binary representation 1111 and has no binary gaps.
//
// Write a function:
//
// class Solution { public int solution(int N); }
//
// that, given a positive integer N, returns the length of its longest binary
// gap. The function should return 0 if N doesn't
// contain a binary gap.
//
// For example, given N = 1041 the function should return 5, because N has
// binary representation 10000010001 and so its
// longest binary gap is of length 5.
//
// Assume that:
//
// N 11 [1..2,147,483,647].
//
// Complexity:
//
// expected worst-case time complexity is O(log(N));
// expected worst-case space complexity is O(1).
//
