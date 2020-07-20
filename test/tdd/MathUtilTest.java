/*
 * Author: HuyPC
 * Project: 
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class MathUtilTest {
    
    //đây là 1 class đặc biệt mà mỗi hàm dùng để
    //test các hàm trong class chính của dự án
    //Ví dụ: test hàm computeFactorial xem chạy đúng khogn6
    //Mỗi hàm sẽ chạy nhiều lần chạy một hoặc nhiều lệnh cF() tùy bạn, để kiểm tra xem
    //actual có khớp với expected hay không
    //khớp, ném ra màu xanh
    //không khớp, ném ra màu đỏ
    //Mỗi hàm sẽ là 1 hàm main() nếu nó mang phía trước 1 kí hiểu @
    //@Test - gọi là annotation
    
    
    @Test
    public void testSuccessfulCases() {
        //hàm này để gọi những cF() mà trả về kết quả giai thừa
        //assertEquals(120, 720);
        
        //expected: 1, actual: chờ tính toán khi chạy hàm
        assertEquals(1, huy.util.MathUtil.computeFactorial(1));
        
        
        //expected: 1, actual: chờ tính toán
        assertEquals(1, huy.util.MathUtil.computeFactorial(0));
        
        
        assertEquals(2, huy.util.MathUtil.computeFactorial(2));
        
        assertEquals(6, huy.util.MathUtil.computeFactorial(3));
        
        assertEquals(720, huy.util.MathUtil.computeFactorial(6));
    }
    
    
    @Test(expected = IllegalArgumentException.class)
    public void testFailedCases() {
        //hàm này để test những tình huống cà chớn
        //Người dùng đưa 5!, tính thế éo nào được
        //Hàm cF() phải ném về ngoại lệ, 1 tình huống bất thường, 1 Exception
        //Khốn nạn, Exception không phải là value để assert
        //ta phải dùng 1 chiêu khác
        huy.util.MathUtil.computeFactorial(-5); //không xài assertEquals
        
        //nếu đưa -5 vào tham số thì coi đây là cà chớn, đập vào mặt người đưa con só này vào
        //bằng cách ném ra ngoại lệ IllegalArgumentException
    }
}
//chỉ cần 1 thằng đỏ thì bắn ra màu đỏ
//điều này có nghĩa là hàm chạy gần đúng với tất cả trường hợp nhưng chỉ có 1 tình huống sai, coi như hàm sai
//Màu xanh -> mọi trường hợp đều đúng. -> hàm Đúng