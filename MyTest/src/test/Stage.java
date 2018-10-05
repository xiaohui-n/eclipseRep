package test;

/**
 * TX面试题
 * <p>
 * create by SJP
 * 2018/1/1
 */
public class Stage {
    private static final int floor = 13; // 50层阶梯

    public static void main(String[] args) {
//        int count = 0; // 计数方法
//        int one = 0; // 爬一层的步数
//        count = stepByOne(one, count); // 开始递归
//        System.out.println("总的方法种数：" + count);
    	System.out.println(JumpFloor(13));
    	System.out.println(JumpFloor_dg(10));
    	System.out.println(new Solution().JumpFloor(13));
    }

    public static int stepByOne(int one, int count) {
        if (one > floor) { // 当one是50的时候仍需在递归一次
            return count;
        } else {
            int fnum = 0; // 初始当前计数总楼层
            fnum = one;// 根据走一步的层数，计算当前总楼层，
            fnum = stepByTwo(fnum); // 开始递归走2层的步数
            if (fnum == floor) { // 如果结果数字等于50层则递归结果符合
                count++; // 方法总数++
                System.out.println("爬一层的步数:" + one + " 爬2层的步数" + (floor - one) / 2);
            }
            one++;
            return stepByOne(one, count);
        }
    }

    public static int stepByTwo(int fnum) { // 爬一步数字 当前楼层
        if (fnum >= floor) {
            return fnum;
        } else {
            fnum = fnum + 2; //每次加上一个2 ，即爬两层
            return stepByTwo(fnum);
        }
    }
    public static long JumpFloor(long target) {
        
        if(target==1)
            return 1;
        if(target==2)
            return 2;
         
        long a = 2;
        long b = 1;
        long sum = 0;
        for(long i=3;i<=target;i++){
            sum = a + b;
            b = a;
            a = sum;
        }
        return sum;
    }
    

    public static long JumpFloor_dg(long target) {
     
        if(target==1)
            return 1;
        if(target==2)
            return 2;
         
        return JumpFloor(target -1 ) + JumpFloor(target - 2);
    }
    
}
class Solution {
	public int JumpFloor(int target) {
		// 青蛙跳台阶,一次可以跳上1级台阶,也可以跳上2级台阶
		if (target == 1) {
			return 1;
		}
		if (target == 2) {
			return 2;
		}
		// 一个n级台阶,第一次跳有两种选择,
		// 一是第一次跳1级,那么跳法数目等于后面剩下的n-1级台阶的跳法数目
		// 二是第一次跳2级,那么跳法数目等于后面剩下的n-2级台阶的跳法数目
		// 一个n级台阶总的跳法数目为f(n-1) + f(n-2),相当于斐波那契数列
		int first = 1;
		int last = 2;
		int sum = 0;
		for (int i = 3; i <= target; i++) {
			sum = first + last;
			// 将上次的last作为下一次的first
			first = last;
			// 将上次的结果作为last
			last = sum;
		}
		return sum;
	}
}
