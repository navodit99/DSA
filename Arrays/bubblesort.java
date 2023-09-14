package Arrays;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6,3,0,5};
		boolean swapped = false;
		for(int i=0;i<arr.length-1;i++) {
			swapped=false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				swapped = true;
			}
		}
		
		if(swapped == false) {
			break;
		}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
