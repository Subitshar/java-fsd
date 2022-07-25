import java.util.Arrays;


public class Multiply {
	public static void main(String args[]) {
		int a1[][] = { {2, 5, -2},
					{2 ,6 ,5  },
					{1 ,2 ,3 }};

        int a2[][] = { {3, -5, 7},
        			{2 ,3 ,4 },
        			{1 ,2 ,3 }};
        int results[][]= {{0,0,0},
        				{0,0,0},
        				{0,0,0}};
  
        for (int i = 0; i <a1.length; i++) {
        	for(int j=0;j<a2.length;j++){
			results[i][j] = results[i][j]+(a1[i][j] * a2[i][j]);
        	}
        }
        
        for (int i = 0; i <a1.length; i++) {
        	for(int j=0;j<a2.length;j++){
        		System.out.print(results[i][j]+" ");
        	}
        	System.out.println();
        }
	}
}
