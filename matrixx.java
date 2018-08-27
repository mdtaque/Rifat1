package loopNarray;

public class matrixx 
{
	
	int k=0;
	int [][]matrix =new int[4][4];
	
	public void fillmatrix() {
		for (int i=0 ; i<4; i++) 
		{
			for (int j=0;j<4;j++)
			{
				matrix[i][j]=k;
			k++;	
			}
		}
	}
		public void readmatrix() {
			for (int i=0 ; i<4; i++) 
			{
				for (int j=0;j<4;j++)
				{
				System.out.println(matrix[i][j]);	 
				 	
				}
			}	
		}
	}


