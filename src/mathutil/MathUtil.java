/*
 * Author: HuyPC
 * Project: 
 */
package mathutil;
import static huy.util.MathUtil.computeFactorial;
/**
 *
 * @author Admin
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("5! = " + computeFactorial(5));
        //toi muon biet xem 5! chay co dung khong
        //vậy tui in kết quả xử lí của hàm ra (actual value)
        //tui so sánh nó có bằng 120 mà tui đã tính trước không (expected value)
        //nếu hàm có 1 giá trị trả về (actual - giả sử 120)
        //và khớp với cái tui cần phải thế (expected - giả sử mình cần hàm trả về 120)
        //actual khớp với expected, hàm chạy như mong đợi
        //Hàm chạy đúng testing chẳng qua là chạy app, chạy hàm, coi kết quả trả về có
        //đúng như mong đợi hay không - actual và expected là như nhau
        //nếu không khớp, code có bug, hoặc mình kì vọng sai
        
        //expected 720 thì tao mới chịu
        System.out.println("6! = " + computeFactorial(6));
        
        //expected 1 mới chịu nha
        System.out.println("1! = " + computeFactorial(1));
        
        //expected 1 mới chịu nha
        System.out.println("0! = " + computeFactorial(0));
        
        //cách test kiểu này phải 
        //> chuẩn bị data đầu vào
        //> gọi hàm với data đầu vào
        //> tính trước kết quả trả về (expected)
        //> so sánh kết quả trả về từ hàm (actual) với expected
        //> Tự đưa ra kết luận => luận hàm bằng mắt
        
        
        //expected: Exception a nhèn
        System.out.println("-5! = " + computeFactorial(-5));
        
        //Kĩ thuật này dùng mắt để đối chiếu kết quả, NHƯNG không hiệu quả
        //Vì máy có thể đối chiếu kq luôn mà, máy so được expected và actual mà
        //Giang hồ đưa ra 1 bộ thư viện, 1 framework giúp mình
        //Tự động so sánh 2 kết quả expected và actual
        //framework này sẽ tự so sánh và đưa ra màu sắc để hàm ý rằng
        //hàm mà chạy đúng: màu xanh
        //hàm chạy sai, không như kì vọng: màu đỏ.
        //áp dụng chó loạt data đầu vào
    }
    
}
