
public class Smile 
{
	static int[][] f = new int [5][5];
	f[1][1] = 0;
	f[2][2] = 4;
	f[1][3] = 0;
	f[3][0] = 1;
	f[4][1] = 1;
	f[4][2] = 1;
	f[4][3] = 1;
	f[3][4] = 1;
	
	public static void main (String[] args)
	{
		print2DArr(f);
	}
	public static void print2DArr(int[][]arr)
	{
		for (int i=0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
