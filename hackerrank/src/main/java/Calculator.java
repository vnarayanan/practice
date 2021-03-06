import java.util.Scanner;

/**
 * Created by vidya.priyadarshini on 23/07/16.
 */
class Calculator implements AdvancedArithmetic {

     int power(int num, int exp) throws Exception {

        if(num<0 || exp <0) throw new Exception("n and p should be non-negative");
        return (int) Math.pow(num,exp);
        }

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);

            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }

    public int divisorSum(int n) {

        if(n<1 || n >1000) System.exit(0);
        int sum=0;
        for(int i=1;i<=n;i++) {
            if(n%i==0) sum = sum + i;
        }
        return sum;
    }
}
