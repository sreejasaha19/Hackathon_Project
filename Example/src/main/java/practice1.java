import java.util.Arrays;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] arr=new int[] {2,5,7,8,9,3,2,7};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int a=0;
		int b=1;
		int c=0;
		for(int i=0;i<10;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}*/
		int n=1;
		int n1=1;
		for(int i=1;i<=4;i++) {
			n=n*i;
			
		}
		System.out.println(n);
		String a="434";
		int count=0;
		String h="";
		for(int i=0;i<a.length();i++) {
			h=h+a.charAt(i);
			count++;
		}
		System.out.println(h);
		System.out.println(count);
		
		
	}

}
