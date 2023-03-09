package lab9March;

public class Question1 {

		public static void main(String[] args) {//main method
			//array declaration and initialization
			int arr1[]= {2,4,8};
			int arr2[]= {2,3,4,8,10,16};
			int arr3[]= {4,8,14,40};
			int x=0,y=0,z=0;
			System.out.println("common elements are:");
			while(x<arr1.length&&y<arr2.length&&z<arr3.length) {//loop to find common element
			if (arr1[x]==arr2[y] && arr2[y]==arr3[z]){//if the condition is true so print common element
			System.out.print(arr1[x]+" ");
			x++;
			y++;
			z++;
			}
			else if (arr1[x]<arr2[y])//to increment the value of x
			x++;
			else if (arr2[y]<arr3[z])//to increment the value of y
			y++;
			else//to increment the value of z
			z++;
			}

	}

}
