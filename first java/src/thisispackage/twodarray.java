package thisispackage;

public class twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[][] worldpopulation = {
				{100,300,500,900,300},
				{100,6000,4000,8766,8879,9977,8855,8888},
				{900,5556,887,444,33456,8867,99876}
		};
		System.out.println("the array "+worldpopulation+"yoo length is :"+worldpopulation.length);
		for(int i=0;i<worldpopulation.length;i++)
		{
			for(int j=0;j<worldpopulation[i].length;j++)
			{
				System.out.print(+worldpopulation[i][j]+" ");
			}
			System.out.println();
		}*/
		int[][] a = {
				{1,1,1},
				{1,1,1},
				{1,1,1}
		};
		int[][] b = {
				{2,2,2},
				{2,2,2},
				{2,2,2}
		};
		int[][] c = new int[3][3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				c[i][j]=a[i][j] + b[i][j];
			}
		}
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				System.out.print(+c[i][j]+" ");
			}
			System.out.println();
		}
		


	}

}
