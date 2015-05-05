package quickSort;

import java.util.Arrays;

/**
 * 
 * @author Loulijun
 * 快速排序的思想：分区法+挖坑填数法。
 * 1、先从数列中取出一个数作为枢纽关键字，一般用第一个元素
 * 2、分区过程，将比这个枢纽关键字大的数全放在它的右边，把小于或者等于的数全放在它左边
 * 3、再对左右分区进行第二步的操作，也就是递归。知道各个区间只有一个数为止
 * 
 * 快速排序是冒泡排序的一种改进，有很多快速排序的方法还是用每次在比较后都用冒泡排序
 * 的方式交换，但是这样的效率要比只用一个枢纽关键字来控制交换的效率要大，所以下面是一种改进
 */
public class QuickSort {
	public static void main(String args[])
	{
		int array[]={49,38,65,97,76,13,27,49};
		System.out.println(Arrays.toString(array));
		quickSort(array,0,array.length-1);
		System.out.println(Arrays.toString(array));
	}
	/**
	 * 分区方法：负责每次递归执行未分区的数据，也就是每次分区后枢纽关键字左右两边的元素
	 * @param arr 要排序的数组
	 * @param low 数组中小的索引，用于向后扫描
	 * @param high 数组中大的索引，用于向前扫描
	 */
	public static void quickSort(int arr[],int low,int high)
	{
		if(low<high)
		{
			int mid = partition(arr,low,high);
			//对枢纽关键字左边的分区进行分区
			quickSort(arr,low,mid-1);
			//对枢纽关键字右边的分区进行分区
			quickSort(arr,mid+1,high);
		}
	}
	/**
	 * 挖坑填数，即具体实现分区的方法，每次的结果是将数组分为比枢纽关键字小的在左边，
	 * 比枢纽关键字大的在右边
	 * @param array 要排序的数组
	 * @param low 
	 * @param high
	 * @return 执行完分区后low的坐标值，用于下次递归的时候分区用
	 */
	public static int partition(int array[],int low,int high)
	{
		//将数组中第一个元素作为枢纽关键字，这个关键字将在本次分区过程中不变
		int pivotKey = array[low];
		int i=low,j=high;

		if(low<high)
		{
			while(i<j)
			{
				//从后向前扫描，如果array[j]>=pivotKey，则下表j向前移动
				while(i<j&&array[j]>=pivotKey)
				{
					j--;
				}
				//array[j]<pivotKey，则将array[j]挖出来填入array[i]，即刚才被pivotKey挖走的地方
				if(i<j)
				{
					array[i]=array[j];
					i++;
				}
				
				//如果array[i]<=pivotKey，则下表i向后移动
				while(i<j&&array[i]<=pivotKey)
				{
					i++;
				}
				//arry[i]>pivotKey，将array[i]挖出来填入刚才被挖的array[j]
				if(i<j)
				{
					array[j]=array[i];
					j--;
				}
			}
			//如果到最后i=j的时候，也就是扫描完整个数组，则将枢纽关键字填入剩下的那个被挖的坑array[i]
			array[i]=pivotKey;
	
		}
		//打印每次分区后的结果
		System.out.println(Arrays.toString(array));
		//将这个分区结束时的坐标i返回，用于下次执行时当做前分区的尾坐标，当做后分区的头坐标
		return i;
	}
}