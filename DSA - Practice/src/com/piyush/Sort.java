package com.piyush;

public class Sort {
	
	public static void main(String[] args) {
		
		int a[] = {4,3,2,1};
		int n = a.length;
		
		for (int i =0 ;i<n;i++) {
			int mn=a[i];
			int ind =i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<mn) {
					mn=a[j];
					ind=j;
					
				}
				
			}
			int t = a[i];
			a[i]=a[ind];
			a[ind]=t;
		}
		for(int i :a) {
			System.out.println(i + " ");
		}
	}

}



// Ascending Order :-

//package com.piyush;
//
//public class Sort {
//	
//	public static void main(String[] args) {
//		
//		int a[] = {4,3,2,1};
//		int n = a.length;
//		
//		for (int i =0 ;i<n;i++) {
//			int mn=a[i];
//			int ind =i;
//			for(int j=i+1;j<n;j++) {
//				if(a[j]>mn) {
//					mn=a[j];
//					ind=j;
//					
//				}
//				
//			}
//			int t = a[i];
//			a[i]=a[ind];
//			a[ind]=t;
//		}
//		for(int i :a) {
//			System.out.println(i + " ");
//		}
//	}
//
//}




//package com.piyush;
//
//public class Sort {
//	
//	public static void main(String[] args) {
//		
//		int a[] = {4,3,2,1};
//		int n = a.length;
//		
//		for (int i =n-1 ;i>=0;i--) {
//			
//			int mx=a[i];
//			int ind =i;
//			for(int j=0;j<i;j++) {
//				if(a[j]>mx) {
//					mx=a[j];
//					ind=j;
//					
//				}
//				
//			}
//			int t = a[i];
//			a[i]=a[ind];
//			a[ind]=t;
//		}
//		for(int i :a) {
//			System.out.println(i + " ");
//		}
//	}
//
//}



// INSERTION Sort:-

//package com.piyush;
//
//public class Sort {
//	
//	public static void main(String[] args) {
//		
//		int a[] = {1,2,3,4,5,2};
//		int n = a.length;		
//		
//		for (int i = 1; i < n; i++) {
//			
//			int temp = a[i];
//			int j = i - 1;
//
//			while (j >= 0 && a[j] > temp) {
//				a[j + 1] = a[j];
//				j--;
//			}
//
//			a[j + 1] = temp;
//		}
//
//		for(int i : a) {
//			System.out.print(i + " ");
//		}
//	}
//}


