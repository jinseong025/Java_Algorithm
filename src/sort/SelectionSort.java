package sort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,10,5,8,7,6,4,3,2,9};
		int i,j,min,temp,index = 0;
		
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
			}
		System.out.println();
		
		for(i=0;i<arr.length;i++) {
			min = 9999;
			for(j=i;j<arr.length;j++) {
				if(arr[j]<min) {
				min = arr[j];
				index =j;
				}
			}
			temp = arr[i];
			arr[i] = min;
			arr[index] = temp;
			
		}
		
		for(i=0;i<arr.length;i++) {
		System.out.print(arr[i]+"\t");
		}
		
	}
}

//select min value and push

