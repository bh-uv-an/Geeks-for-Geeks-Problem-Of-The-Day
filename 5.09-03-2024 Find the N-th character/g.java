package Geeks_For_Geeks;
import java.util.Scanner;
public class g {
	public static char nthCaharacter(int r,int n,String s) {
		String sb="";
		
		while(r!=0) {
			sb = "";
			for(int i=0;i<=n;i++) {
				if(s.charAt(i)=='1') {
					sb+=("10");
				}
				if(s.charAt(i)=='0') {
					sb+=("01");
				}
			}
			s = sb.toString();
			System.out.println(s);
			r--;
		}
		System.out.println(sb);
		//return 0;
		return sb.charAt(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,n;
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the reciprocals ");
		r = sc.nextInt();
		System.out.println("Enter the index ");
		n = sc.nextInt();
		System.out.println("Enter the string ");
		s = sc.next();
		System.out.println(nthCaharacter(r,n,s));
		sc.close();
	}

}
