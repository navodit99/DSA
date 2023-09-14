package Arrays;
class Merge {
	void Merge(int a[],int beg,int mid,int end) {
		int i,j,k;
		int n1=mid - beg + 1;
		int n2=end - mid;
		
		int leftarray[]= new int[n1];
		int rightarray[]=new int[n2];
		
		for(i=0;i<n1;i++) {
			leftarray[i]= a[beg+i];
		}
		for(j=0;j<n2;j++) {
			rightarray[j]=a[mid+1+j];
		}
		i=0;
		j=0;
		k=beg;
		while(i<n1 && j<n2) {
			if(leftarray[i] <= rightarray[j]) {
				a[k]=leftarray[i];
				i++;
			} else {
				a[k]=rightarray[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			a[k]=leftarray[i];
			i++;
			k++;
		}
		while(j<n2) {
			a[k]=rightarray[j];
			j++;
			k++;
		}
		
	}
	void mergesort(int a[],int beg,int end) {
			if(beg<end) {
			int mid=beg + (end-beg)/2;
			mergesort(a,beg,mid);
			mergesort(a,mid+1,end);
			Merge(a,beg,mid,end);
		}
	}
	void printarray(int a[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] a= {5,4,3,2,1};
		int n=a.length;
		System.out.println("array before sorting: ");
		Merge m1=new Merge();
		m1.printarray(a,n);
		m1.mergesort(a,0,n-1);
		System.out.println("array after sorting: ");
		m1.printarray(a,n);
		System.out.println("");
	}
}