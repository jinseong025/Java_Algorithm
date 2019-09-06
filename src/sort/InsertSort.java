package sort;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,10,5,8,7,6,4,3,2,9};
		int i,j,min,temp,index = 0;
		
		for(i=0; i<9;i++) {
			j=i;
			while(arr[j]>arr[j+1]) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				j--;
			}
		}
		

		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
	
	}

}
