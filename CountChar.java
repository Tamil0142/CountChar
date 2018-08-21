import java.util.*;
public class wifi{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String s1[]=s.split(" ");
		int sum=0;
		for(int i=0;i<s1.length;i++){
			sum+=s1[i].length();
		}
		System.out.println(sum);
	}
}
