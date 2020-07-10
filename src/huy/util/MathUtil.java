/*
 * Author: HuyPC
 * Project: 
 */
package huy.util;

/**
 *
 * @author Admin
 */
//đây là class chứa các hàm toán học ta tự viết, mục đích là công cụ xài chung cho mọi nơi
//Phàm cái gì mà được thiết kế để xài chung thì ta dùng kĩ thuật STATIC.
public class MathUtil {

    //hàm tính n! = 1*2*3*4....
    //Vì n! tăng rất nhanh, sẽ tràn int sớm (tối da 2 tỷ 1) nên mình xài long để an toàn hơn.
    public static long computeFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
