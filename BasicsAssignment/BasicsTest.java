public class BasicsTest{
    public static void main(String[] args){
        Basics basic = new Basics();
        int[] x = new int[7];
        for(int i = 1; i<x.length; i++){
            x[i] = i;
        }
        // basic.PrintNum();
        // basic.PrintOdd();
        // int PrintSum = basic.PrintSum();
        // System.out.println(PrintSum);
        // basic.IterateArray(x);
        // int[] y = {-3, -5, -7};
        // int FindMax = basic.FindMax(y);
        // System.out.println(FindMax);
        System.out.println(basic.OddArray());
    }
}