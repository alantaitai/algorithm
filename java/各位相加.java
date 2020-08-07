/**
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
 * <p>
 * 输入: 38
 * 输出: 2
 * 解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
 * <p>
 * 进阶:
 * 你可以不使用循环或者递归，且在 O(1) 时间复杂度内解决这个问题吗？
 *
 * @author ：
 * @date ：Created in 2020-08-07 14:04
 * @modified By：
 */
public class 各位相加 {

    private static  final int MAX_SIGLE_NUMBER = 10;

        public static void main(String[] args) {
            System.out.println(addDigits(38));

    }

    public static int addDigits(int num) {
        int total = 0;
        while (num>MAX_SIGLE_NUMBER){
            total += num% MAX_SIGLE_NUMBER;
            num/=10;
            total += addDigits(num);
            //我是最新的啊啊 github你怎么不行   aaa
        }

        return total;

    }
}
