/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giang.util;

/**
 *
 * @author MY HP
 */
// đây là class chứa các hàm tính toán, toán học, dùng chung, làm tiện ích
// cho các nơi khác sử dụng. Phàm cái gì mà mang tính chắc xài chung
// ta dùng kĩ thuật STATIC
public class MathUtil {

    // hàm tính n! = 1.2.3...n
    // vì giá trị giai thừa tăng cực nhanh, nên sẽ tràn vùng int rất sớm
    // do int chỉ tối đa 2 tỷ 1, nên ta xài long thì mới chứa đc n lớn
    // nhưng cũng chỉ cỡ 15! thoai
    public static long computeFactorial(int n) {
        if (n < 0 || n > 15) {
            throw new IllegalArgumentException("Invalid argument. n must be >= 0 "
                    + "and <= 15");
        }

        if (n == 0 || n == 1) {
            return 1;
        }
        return n * computeFactorial(n - 1);
//        long result = 1;
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//        return result;
    }

}
