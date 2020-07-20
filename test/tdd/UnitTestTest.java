/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

// netbeans 10 trở đi xóa đi 2 cái import ở dưới
// sau đó add .jar vào thư mục program files và 
// chọn netbeans -> chọn platform -> module -> ext -> chọn jUnit
import giang.util.MathUtil.*;
import static giang.util.MathUtil.computeFactorial;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MY HP
 */
public class UnitTestTest {

    public UnitTestTest() {

        // đây là class truyền thống dùng để test code chính của mình ở bên 
        // MathUtil
        // nhưng ta không xài sout() mà ta xài màu sắc
        // class này chưa rất nhiều hàm main()
        // muốn có hàm bất kỳ trong này thành main() bận chỉ việc xài annotation
        // @Test, JVM sẽ tự động hiểu hàm này là main() và Shift + F6 từ só
        // nếu có nhiều main() tức là nhiều @Test trong này, các main() sẽ
        // chạy tuần tự theo mặc định từ trên xuống dưới
    }
    
    // hi vong khi ham nay thi nem ngoai le
    @Test(expected = IllegalArgumentException.class)
    public void testFailedCases() {
        computeFactorial(-5);
        // hàm này dùng để test các tình huống cà chớn đến từ người dùng
        // ví dụ người dùng mún tính -5! thì tính thế mẹ nào được
        // khi đó trong thiết kế của hàm cF() ta phải dự liệu tình huống cà
        // chớn này, tức là người dùng đưa data cà chớn vào thì mình
        // ném ra cái ngoại lệ, không thèm xử lý
//         cF(-5) đặp vào mặt cái ngoại lệ
        // và ngoại lệ là 1 thứ bất thường, ko như dự tính, không phải là 1 loại
        // value có thể so sánh, tức là không thể assertEquals(1 cái ngoại lệ)
        // vì assert() trong tiếng anh nghĩa là so sánh 2 thứ gì đó
        // tức là phải có value đẻ so, mà ngoại lệ Exception thì ko phải là value
        // ta phải dùng chiêu
    }
    
    // dù code bạn có đỏ hay xanh miễn ko bị lỗi cú pháo khi gõ, lỗi import
    // thì CLEAN & BUILD luôn ra được FILE .JAR .WAR
    // lí do là thằng clean &build nó chỉ kiểm tra code ko sai cú pháp
    // nó ko care code có sai logic xử lý hay ko
    
    // MÌNH CHƠI LỚN: 
    // nếu code còn đang màu đỏ, camams clean & build để đảm bảo ràng code phải chạy
    // đúng cho các tình huống sử dụng
    // tức là đúng về mặt xử lý thì cho ra file jar
    // tức là đèn xanh thì thông thường
    // đỏ, vịn lại, không cho ra .jar .war
    // nhớ 2 con số
    // netbeans 8X, 1005
    // netbeans 10X trở lên, 1204

    // hàm main() này dùng để các tình huống hàm cF() nhận đúng tham số
    // và mày phải chạy đúng
    @Test
    public void testSuccessfulCases() {
//        assertEquals(120, 720);
        // hi vọng 5! trả về 120, không như thế màu đỏ nha bạn
        assertEquals(120, computeFactorial(5));
        // hi vọng trả về 720 là của 6!, không như thế đỏ nha bạn
        assertEquals(720, computeFactorial(6));
        // đỏ thì chỉ cần 1 thằng đỏ trong cả đám xanh
        // hàm ý: mày xanh gần hết, còn vài case màu đỏ
        
    }
}
