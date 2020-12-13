import java.util.Scanner;

public class IntegerBreak {
    public static int dp[];
    public static int solve(int n){
        int ans=0;
        if(n==0||n==1){
            return dp[n]=1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        for(int i=1;i<=n;i++){
            ans=Math.max(ans,(i)*solve(n-i));
        }
        return dp[n]=ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ans=0;
        int n=sc.nextInt();
        dp=new int[n+5];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        if(n==2){
            System.out.print(1);
        }else if(n==3){
            System.out.print(2);
        }else {
            ans=solve(n);
            System.out.print(ans);
        }
    }
}
