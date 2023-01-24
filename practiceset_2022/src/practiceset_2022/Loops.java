package practiceset_2022;

public class Loops {

	public static void main(String[] args) {
		
		/*  loop iterates 4 times -- 		1
		 * 									1 2 
		 * 									1 2 3 
		 * 									1 2 3 4
		 * 1 2 3 4
		 * 5 6 7
		 * 8 9
		 * 10   
		 */
		int k=1;
		for(int i=0; i<4;i++)
		{
			// loop will iterate 4 times
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(k);
				System.out.print("\t ");
				k++;
			}
			 System.out.println("");
		} 
		
		
		
		int L=1;
		for(int i=1; i<=4;i++)
		{
			// loop will iterate 4 times
			for(int j=1;j<=i;j++)
			{
				System.out.print(L);
				System.out.print("\t ");
				k++;
			}
			 System.out.println("");
		}
	

		
	
		for(int i=1; i<=4;i++)
		{
			// loop will iterate 4 times
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(j);
				
				System.out.print("\t ");
			}
			System.out.println(" ");
		}
		int z=3;
		for(int i=0; i<=3;i++)
		{
			// loop will iterate 4 times
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(z);
				z=z+3;
				
				System.out.print("\t ");
			}
			System.out.println(" ");
		}


}
}
