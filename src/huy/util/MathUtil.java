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
        //nếu người dùng đưa cà chớn, ta sẽ ném ra ngoại lệ
        if (n < 0 || n > 15) throw new IllegalArgumentException("Invalid argument: n must be >= 0 and <= 15");
        if (n == 0 || n == 1) {
            return 1;
        }
        
        //đứa nào xài else chỗ này, trừ điểm
        return n * computeFactorial(n - 1); // đệ quy nè, minh họa cho n! = n*(n-1)
    }
}
