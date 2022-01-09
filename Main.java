
public class Main {

	public static void insertionSort(int[] list) {
		for(int i=1;i<list.length;i++) {
			int temp=list[i];
			int j=i-1;
			while(j>=0&&list[j]>temp) {
				list[j+1]=list[j];
				j--;
			}
			list[j+1]=temp;
		}
		
	}

	public static void main(String[] args) {
		int[] x = {22,27,16,2,18,6 };
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");

		}
		insertionSort(x);

		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");

		}

	}

}
