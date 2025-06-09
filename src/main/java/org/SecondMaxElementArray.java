package org.practice;

public class SecondMaxElementArray {

	public SecondMaxElementArray() {
		// TODO Auto-generated method stub
		int[] arr = {2,5,7,13,9};
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=i;j<arr.length;j++)
        	{
        		if(arr[i]>arr[j])
        		{
        			max=arr[i];
        			arr[i]=arr[j];
        			arr[j]=max;
        		}
        	}
        }
        System.out.println(arr);
	System.out.println(arr[arr.length-2]);
}
}
