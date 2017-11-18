
public class Arraycopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] copyFrom = {1, 2, 3, 4, 5, 6, 7};
		int[] copyTo = {10, 20, 30, 40, 50, 60, 70, 80};
		
		System.out.println("copyFrom의 원소들");
		for(int element : copyFrom)
			System.out.print(element + " ");
		System.out.println();
		
		System.out.println("copyTo의 원소들");
		for(int element2 : copyTo)
			System.out.print(element2 + " ");
		System.out.println();
		
		System.arraycopy(copyFrom,  4, copyTo,  1,  3);
		for (int i = 0; i< copyFrom.length; i++)
			System.out.print(copyFrom[i] + " ");
		System.out.println();
		
		for (int value : copyTo)
			System.out.print(value + " ");
		

	}

}
