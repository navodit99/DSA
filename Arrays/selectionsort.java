package Arrays;

public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {64,25,12,22,11};
		int temp=0;
		int i,j;
			for(i=0;i<arr.length;i++) {
				
				for(j=i+1;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					} 
				}
			}
			for(i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
			
	}

}
