package Geeks_For_Geeks;
import java.util.Scanner;
public class c {
	public static int chk(String s) {
		int pos1 = -1, pos2 = -1, pos3 = -1,min_subarray=Integer.MAX_VALUE;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='0') {
				pos1 = i;
				//System.out.println(pos1);
			}
			if(s.charAt(i)=='1') {
				pos2 = i;
				//System.out.println(pos2);
			}
			if(s.charAt(i)=='2') {
				pos3 = i;
				//System.out.println(pos3);
			}
			if(pos1==-1 || pos2==-1 || pos3==-1) {
				continue;
			}
			int max = Math.max(Math.max(pos1, pos2), pos3);
			int min = Math.min(Math.min(pos1, pos2),pos3);
			min_subarray = Math.min((max-min)+1, min_subarray);
		}
		if(pos1==-1||pos2==-1||pos3==-1) {
			return -1;
		}
		return min_subarray;		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		s = sc.next();
		System.out.println(chk(s));
		sc.close();
	}

}
