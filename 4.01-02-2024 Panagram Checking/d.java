package Geeks_For_Geeks;
import java.util.Scanner;
public class d {
	public static boolean checkPangram  (String s) {
        // your code here
        s = s.toLowerCase();
        if(s.length()<26){
            return false;
        }
        else{
            for(char l='a';l<='z';l++){
                if(s.indexOf(l)<0){
                    return false;
                }
            }
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Please enter the string ");
		str = sc.nextLine();
		System.out.println("From main: = "+str);
		System.out.println(checkPangram(str));
		sc.close();
	}

}
