/**
 * 
 */
package test;

/**
 * @author Shobha
 *
 */
public class Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1[][] = {{1,2,3},{7,5,3},{2,18,9}};
		
		
		for(int[] row : a1) {
			java.util.Arrays.sort(row);
			
			for(int x : row) {
				System.out.println(x + ": " + " ");
			}
		}

	}

}
