import java.util.*;
public class CountlettersOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s=sc.nextLine();
		int arr[]=new int[256];
		for(int i=0;i<256;i++)
			arr[i]=0;
		for(int i=0;i<s.length();i++)
		{
			arr[s.charAt(i)]++;
		}
		for(int i=0;i<256;i++)
		{
			if(arr[i]!=0)
				System.out.println((char)i+" "+arr[i]);
		}
	}

}
