package LeetcodeQue;
import java.util.*;
public class AverageSalaryExcludingtheMinimumandMaximumSalary {
    //first approach brutforce TC- (nlogn + n-2)

    public double average(int[] salary) {
        int n = salary.length;
        double ans = 0;
        Arrays.sort(salary);
        double sumOFSalary = 0;
        for(int i = 1; i<n-1 ; i++){
            sumOFSalary += salary[i];
        }
        System.out.print(sumOFSalary);
        int p = n - 2;
        ans = sumOFSalary/p ;
        return ans ;
    }

    //optimized approach Tc- O(n);

    public static double average2(int[] salary) {
        double min = Double.MAX_VALUE, max = Double.MIN_VALUE, avg = 0.0, sum = 0.0;
        for (int i = 0; i < salary.length; i++) {
            min = Math.min(salary[i], min);
            max = Math.max(salary[i], max);
            sum += salary[i];
        }

        avg = sum - min - max;
        return avg / (salary.length - 2);
    }
}
