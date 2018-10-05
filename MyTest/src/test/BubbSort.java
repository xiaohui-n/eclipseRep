package test;
import java.util.Arrays;

public class BubbSort {
	public static void main(String[] args) {
		int a[] = { 3, 4, 2, 6, 1 };
		
		System.out.println(Arrays.toString(a));
		
		
		//选择排序  数组中最小值放在最小索引处  最小索引处的值和后面比较 
		int temp = 0;  //temp为临时最小值
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]){
					temp = a[j];  //找到临时最小值
					a[j] = a[i];  //把大的值往后放
					a[i] = temp;  //最小值放到最小索引处
				}
			}
		}
		System.out.println("选择排序结果"+Arrays.toString(a));
		
		//冒泡排序  数组中两两元素进行比较 值大的往后方  
		
		int arr[] = { 3, 4, 2, 6, 1 };
		
		int s = 0; //临时大的值
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1 - i; j++) {
				if(arr[j]>arr[j+1]){
					s = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = s; 
				}
			}
		}
		System.out.println("冒泡排序结果"+Arrays.toString(arr));
		
		
		
//		int swap = 0;
//		for (int i = 0; i < a.length; i++) {
//
//			for (int j = i; j < a.length; j++) {
//				if (a[j] < a[i]) {
//					swap = a[j];
//					a[j] = a[i];
//					a[i] = swap;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(a));
//		
//		
//		int[] arr={1,3,2,45,65,33,12};
//        System.out.println("交换之前：");
//        for(int num:arr){
//            System.out.print(num+" ");
//        }        
//        //选择排序的优化
//        for(int i = 0; i < arr.length - 1; i++) {// 做第i趟排序
//            int k = i;
//            for(int j = k + 1; j < arr.length; j++){// 选最小的记录
//                if(arr[j] < arr[k]){ 
//                    k = j; //记下目前找到的最小值所在的位置
//                }
//            }
//            //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
//            if(i != k){  //交换a[i]和a[k]
//                int temp = arr[i];
//                arr[i] = arr[k];
//                arr[k] = temp;
//            }    
//        }
//        System.out.println();
//        System.out.println("交换后：");
//        for(int num:arr){
//            System.out.print(num+" ");
//        }
		
	}
}
