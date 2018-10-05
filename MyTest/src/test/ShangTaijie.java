package test;

import java.util.Scanner;

public class ShangTaijie {
	public int countWays(int n)
    {
        if(n<1)//如果取值范围为-1,则直接返回-1.
        {
            return -1;
        }

        int []data=new int[n+1];

        for(int i=1;i<=n;i++) {
            if (i== 1) {
                data[1] = 0;
            }
            else if (i== 2) {
                data[2] = 1;
            }
            else if (i == 3) {
                data[3] = 2;
            }
            else {
                data[i] = (data[i - 1] + data[i - 2]) % 1000000007;
            }
        }
        return data[n];
    }

    public static void main(String []args)
    {
    	ShangTaijie test=new ShangTaijie();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        int sum=test.countWays(n);

        System.out.println(sum);

    }
}
