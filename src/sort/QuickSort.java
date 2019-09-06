package sort;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,7,8,1,5,9,6,10,2,4};
		int num = arr.length;
		
		quickSort(arr,0,num-1);
		

		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+"\t");
		}
	}
	
	static void quickSort(int arr[], int start, int end) {
		
		if(start>=end) {
			return;
		}
		
		int key = start;
		int i = start +1;
		int j = end;
		int temp;
		
		while(i <= j) {		//�������� ���� �ݺ�
			while(arr[i] <= arr[key] && i<= end) {	//Ű ������ ū���� ���� �� ���� �ݺ�
				i++;
			}
			while(arr[j] > start && j>= arr[key]) { //Ű ������ ���� ���� ���� �� ���� �ݺ�
				j--;
			}
			if(i>j) {
				temp = arr[j];
				arr[j] = arr[key];
				arr[key] = temp;
			}else {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		quickSort(arr, start, j-1);
		quickSort(arr,j+1,end);
		
	}

}
