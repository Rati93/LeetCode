package org.practice;

import java.util.Arrays;

public class MedianOfTwoSortedArray {
	public static void main(String[] args)
	{
	int[] nums1 = {1,2};
	int[] nums2= {3,4};
	 int totalLength = nums1.length + nums2.length;
     double median=0;
    int[] newArr = new int[totalLength];
    int k=0;
    for(int i=0;i<nums1.length;i++)
    {
       newArr[k++] = nums1[i];
    } 
    for(int i=0;i<nums2.length;i++)
    {
     newArr[k++] = nums2[i];
    }
    Arrays.sort(newArr);
    
  if(totalLength%2 !=0)
    {
     median = newArr[totalLength/2];
    }
    else
    {
     median = (newArr[(totalLength/2)-1]+newArr[totalLength/2])/2.0;
    }

    //return median;
}
}
