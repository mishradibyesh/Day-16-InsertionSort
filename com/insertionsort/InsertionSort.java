package com.insertionsort;

public class InsertionSort {
	public void insertionSort(String[] arr) {
		int length = arr.length ;
		for(int i = 1 ; i < length ; i++ ) {
			for(int j = i-1 ; j >= 0 ; j--) {
				if (arr[j].compareTo(arr[j+1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		InsertionSort sort = new InsertionSort();
		String[] arr = {"ab", "abc", "a", "abcde", "abcd"};

		System.out.println("Before Sorting Array : ");

		//printing all array members
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "   ");
		}
		System.out.println("\n");

		//sort array using insertion sort
		sort.insertionSort(arr);

		System.out.println("After Sorting Array : ");

		//printing all array members
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "   ");
		}

	}

}
