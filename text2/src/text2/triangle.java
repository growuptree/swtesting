package text2;

public class triangle {
	public static int text1(int a,int b, int c) {
		
		int array[];
		array= new int[3];
		array[0]= a;
		array[1]= b ;
		array[2]= c;
		
		int temp;
		for(int i = 0 ; i < 3 ; i++)
		{
			for(int j = 0 ; j < 2 ; j++)
			{
				if(array[j]>array[j+1])
				{
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		
		if(array[0]+array[1]>array[2])
		{
			
			if(array[0]==array[1] && array[0]==array[2])
			
				return 3;
			if(array[0]==array[1]||array[1]==array[2])
				
				return 2;
				
			if(array[0]*array[0]+array[1]*array[1]==array[2]*array[2])
				
				return 4;
			return 1;
		}
		
		return 0;
		
		
	}
}
