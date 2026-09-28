//package com.phatpn.mathutil.core;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//
//public class MathUtilTest {
//
//    @Test
//    public void testGetFactorialGivenRightArgumentReturnsWell() {
//        int n = 0;
//        long expected = 1; // kỳ vọng 0! = 1
//        long actual = MathUtil.getFactorial(n);
//        // so sánh expected vs. actual
//        assertEquals(expected, actual); // hàm giúp so sánh 2 giá trị có giống nhau không
//        assertEquals(1, MathUtil.getFactorial(1));   // muốn 1! == 1
//        assertEquals(2, MathUtil.getFactorial(2));
//        assertEquals(6, MathUtil.getFactorial(3));
//        assertEquals(24, MathUtil.getFactorial(4));
//        assertEquals(120, MathUtil.getFactorial(5));
//        assertEquals(720, MathUtil.getFactorial(6));
//    }
//
//    @Test
//    public void testGetFactorialGivenWrongArgumentThrowException() {
//        Exception exception = assertThrows(
//                IllegalArgumentException.class,
//                () -> MathUtil.getFactorial(-5)
//        );
//
//        assertEquals("n must be between 0 .. 20", exception.getMessage());
//    }
//}
package com.phatpn.mathutil.core;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class MathUtilTest {

    // Test theo cách truyền dữ liệu tự động từ file CSV
    @ParameterizedTest
    @CsvFileSource(resources = "/data/factorial_test_data.csv", numLinesToSkip = 0)
    public void testGetFactorialGivenRightArgumentReturnsWell_Csv(int n, long expected) {
        long actual = MathUtil.getFactorial(n);
        assertEquals(expected, actual);
    }

    // Test trường hợp ném ngoại lệ khi truyền tham số sai
    @Test
    public void testGetFactorialGivenWrongArgumentThrowException() {
        // 1. Test số âm (-5) và kiểm tra cả câu thông báo lỗi
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> MathUtil.getFactorial(-5)
        );
        assertEquals("n must be between 0 .. 20", exception.getMessage());

        // 2. Test số vượt quá 20 để phủ nốt nhánh điều kiện (n > 20)
        assertThrows(
                IllegalArgumentException.class, 
                () -> MathUtil.getFactorial(21)
        );
    }
}