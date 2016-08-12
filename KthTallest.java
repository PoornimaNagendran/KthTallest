import java.util.Scanner;
public class KthTallest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int[] a=new int[50];
int temp;
System.out.println("Enter the height of 50 students");
for(int i=0;i<50;i++)
{
	a[i]=s.nextInt();
}
System.out.println("Enter rank");
int k=s.nextInt();
for(int i=0;i<50;i++)
{
	for(int j=i+i;j<50;j++)
	{
		if(a[i]<a[j])
		{
			temp=a[j];
			a[j]=a[i];
			a[i]=temp;
		}
	}
}
System.out.println("The "+k+"th tallest height is"+a[k-1]);
	}

}
