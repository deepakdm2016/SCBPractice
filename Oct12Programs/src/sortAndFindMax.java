import java.util.Scanner;

public class sortAndFindMax {

	public static void main(String[] args) {
		int a[]={4,3,20,1,-9};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("min is "+a[0]);
		System.out.println("max is "+a[a.length-1]);

		
}

}