import java.lang.reflect.Array;
import java.util.*;
public class Main {
	
	/*
	
	Record the time for the following search:
	Linear Search:
	1: 200
	100: 3600
	1,000: 2200
	10,000: 26400
	100,000: 337300
	1,000,000: 1544200
	1,000,001: 1576300
	Binary Search:
	1: 6000
	100: 3100
	1,000:6000
	10,000: 6100
	100,000: 5700
	1,000,000: 3400
	1,000,001: 3300
	Write a couple sentences about what you observed:
	
	The linear search was very quick in the lower numbers but as the number
	increased the time it took was much longer which makes sense as it goes 
	through each element in order. The binary search took longer in lower elements 
	but was more consistent in its search time. This consistency comes from the fact
	that it starts by searching in the middle and removing half of the elements from
	its search eventually narrowing it down to one number. 
	*/

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		//Generate an array with values 0-1000000
		int[] array = new int[1000001];
		
			for ( int i = 0;i<array.length;i++) {
				array[i] = i;
			}
			System.out.println();
		
		//Runs and times the each search
		int startTime = (int) System.nanoTime();
		int result = linearSearch(array, n);
		int endTime = (int) System.nanoTime();
		
		int startTime1 = (int) System.nanoTime();
		int result1 = binarySearch(array,n);
		int endTime1 = (int) System.nanoTime();
		
		int diff = endTime - startTime;
		int diff1 = endTime1 - startTime1;
		
		System.out.println(result+ ": " + diff);
		System.out.println(result1+ ": " + diff1);
		
			}

public static int linearSearch (int a[], int search) {
	for (int i = 0; i < a.length; ++i) {
		if (i == (search))return search;
	    
	}
	return -1;
	
}
public static int binarySearch (int a[], int search) {
	int left = 0;
	int right = a.length-1;
	while (left <= right) {
		
		int mid = (left+right)/2;
		
		if (a[mid] == search) return mid;
		
	
		else if (search > a[mid]) {
			left=a[mid]+1;
		}
		else if (search < a[mid]) {
		right = a[mid]-1;
	}
	}

	return -1;
}
}

