package Geeks_For_Geeks;
import java.util.Scanner;
public class a {
	public static boolean sdp(int arr[],int n,int k) {
		int pairfound;
        if((n%2)!=0){
            return false;
        }
        for(int i=0;i<n;i++){
            pairfound = 0;
            if(arr[i]!=0){
                for(int j=i+1;j<n;j++){
                    if(arr[j]!=0){
                        if((arr[i]+arr[j])%k==0){
                            arr[i] = 0;
                            arr[j] = 0;
                            pairfound = 1;
                            break;
                        }
                    }
                }
                if(pairfound==0){
                    return false;
                }
            }
        }
        return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for K ");
		int k = sc.nextInt();
		System.out.println("Enter the array size ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("ENter the array elements ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(sdp(arr,n,k));
		sc.close();
	}

}
