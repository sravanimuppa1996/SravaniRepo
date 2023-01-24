package practiceset_2022;

import java.util.ArrayList;

public class InterviewQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {4,5,5,5,6,4,6,9,4};
		ArrayList<Integer> al= new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;						
					}
				}
				System.out.print("Number"+ a[i]+ "Repeated");
				System.out.println(k +"times");
				if(k==1)
				{
				System.out.println(a[i]  + "Is unique number");
				}
			}
		}
		
		
		
		

	}

}
