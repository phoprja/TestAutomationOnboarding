package coreJava;

public class Task_06_Hometask_Loops_And_Arrays {

	public static void main(String[] args) {
		
		//TASK1: Consider the leftmost and rightmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)
        int[] array1 = {1, 4, 2, 1, 4, 1, 4};
        System.out.println("Scenario1: Largest span: " + largestSpan(array1)); 
        
		//TASK2: Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
        int[] array2 = {1, 2, 3, 4, 5, 5};
        System.out.println("\nScenario2: Can split array? " + canSplitArray(array2)); 
        
		//TASK3: Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array
        int[] array3 = {1, 2, 2, 3, 4, 4};
        System.out.println("\nScenario3a: Number of clumps: " + countClumps(array3)); 
        
        int[] array4 = {1, 1, 2, 1, 1};
        System.out.println("Scenario3b: Number of clumps: " + countClumps(array4)); 
        
        int[] array5 = {1, 1, 1, 1, 1};
        System.out.println("Scenario3c: Number of clumps: " + countClumps(array5)); 
        
		//TASK4: We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.
        int[] array6 = {1, 2, 3, 8, 9, 3, 2, 1};
        System.out.println("\nScenario4: Size of largest mirror section: " + largestMirrorSection(array6)); 
    
        
		//TASK5: Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.
        int[] outer = {1, 2, 4, 6, 7, 9};
        int[] inner = {2, 4, 7};
        System.out.println("\nScenario5a: Inner appears in outer: " + innerAppearsInOuter(outer, inner)); // Output: true
        
        int[] outer2 = {1, 2, 3, 4, 6};
        int[] inner2 = {2, 5, 7};
        System.out.println("Scenario5b: Inner appears in outer: " + innerAppearsInOuter(outer2, inner2)); // Output: false
   
    }
	 
	 public static int largestSpan(int[] nums) {
	        int maxSpan = 0;
	        
	        for (int i = 0; i < nums.length; i++) {
	            for (int j = nums.length - 1; j >= i; j--) {
	                if (nums[i] == nums[j]) {
	                    int span = j - i + 1;
	                    if (span > maxSpan) {
	                        maxSpan = span;
	                    }
	                    break; 
	                }
	            }
	        }
	        return maxSpan;
	 }
	
	 
	 public static boolean canSplitArray(int[] nums) {
	        for (int i = 1; i < nums.length; i++) {
	            int leftSum = 0;
	            int rightSum = 0;
	            
	            for (int j = 0; j < i; j++) {
	                leftSum += nums[j];
	            }
	            
	            for (int k = i; k < nums.length; k++) {
	                rightSum += nums[k];
	            }
	            
	            if (leftSum == rightSum) {
	                return true;
	            }
	        }	        
	        return false;
	    }
	 
	 public static int countClumps(int[] nums) {
	        int clumps = 0;
	        boolean isClump = false;
	        
	        for (int i = 0; i < nums.length - 1; i++) {
	            if (nums[i] == nums[i + 1]) {
	                if (!isClump) {
	                    clumps++;
	                    isClump = true;
	                }
	            } else {
	                isClump = false;
	            }
	        }
	        
	        return clumps;
	    }
	  
	 public static int largestMirrorSection(int[] nums) {
	        int maxMirror = 0;
	        
	        for (int i = 0; i < nums.length; i++) {
	            for (int j = nums.length - 1; j >= 0; j--) {
	                int count = 0;
	                int k = i;
	                int l = j;
	                
	                while (k < nums.length && l >= 0 && nums[k] == nums[l]) {
	                    count++;
	                    k++;
	                    l--;
	                }
	                
	                maxMirror = Math.max(maxMirror, count);
	            }
	        }
	        
	        return maxMirror;
	    }
	 
	 public static boolean innerAppearsInOuter(int[] outer, int[] inner) {
	        int outerIndex = 0;
	        int innerIndex = 0;
	        
	        while (outerIndex < outer.length && innerIndex < inner.length) {
	            if (outer[outerIndex] == inner[innerIndex]) {
	                innerIndex++;
	            }
	            outerIndex++;
	        }
	        
	        return innerIndex == inner.length; 
	    }
	 
}
