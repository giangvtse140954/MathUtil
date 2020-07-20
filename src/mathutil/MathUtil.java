/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil;
import static giang.util.MathUtil.computeFactorial;
/**
 *
 * @author MY HP
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // 5! hi vọng máy sẽ in ra 12-
        // thực tế nó ra bao nhiêu thì phải chạy mới biết
        // thực tế kết quả trà về lúc chạy app gọi là ACTUAL
        System.out.println("5! = " + computeFactorial(5));
        
        // actual: 120, expected: 120 -> đúng rồi
        // actual: 1000, expected: 120 -> toang hàm chạy sai, viết sai
        
        // expected: 1 if cF(0), chạy hàm cD(0) hi vọng nhận về 1
        // nếu không về 1, tức là actual khác expected, hàm viết code sai
        System.out.println("0! = " + computeFactorial(0));
        
        System.out.println("1! = " + computeFactorial(1));
        // chạy, F6, nhìn kết quả, luận đúng sai bằng mắt trên từng hàm sout()
        System.out.println("-5! = " + computeFactorial(-5));
        // nên nhớ tao kỳ vọng m ném về ngoại lệ
        // do đưa vào dữ liệu cà chớn
        // -5 tính thế mẹ nào được, do ! chỉ với với dương 0, 1, 2,...
        
        // do ta chơi trò sout() nên sai đúng nó cứ in ra, ta phải luận kết quả, ta phải
        // luận đúng sai bằng mắt
        // -5! = 1, phải nhìn kq in khi chạy -> luận đúng sai
        // HỢP LÝ NHƯNG NHÌN BẰNG MẮT, SO SÁNH TRONG ĐẦU, DỄ BỊ SAI SÓT
        
        // giang hồ độ ra bộ thư viện, giúp ta test các hàm dùng màu sắc
        // xanh -> code chạy đúng kỳ vọng
        // đỏ -> code chạy sai kỳ vọng
        // viết thêm đoạn code tự so sánh giùm giữa expected và actual để
        // ném ra màu, mình chỉ cần nhìn màu, ko cần tự so sánh và kết luận
        // kỹ thuật này gọi là TĐ kết hợp với UnitTesting xài các thư viện
        // phụ trợ JUnit, NUnit, TestNG, PHPUnit, CPPUnit, xUnit, MSTest,...
        
    }
    
}
