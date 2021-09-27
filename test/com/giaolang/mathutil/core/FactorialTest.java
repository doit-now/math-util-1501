/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.giaolang.mathutil.core;

import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author giao.lang
 */
public class FactorialTest {
    
     //check xem có xh ngoại lệ hay ko khi đưa data cà chớn!!!
    @Test(expected = IllegalArgumentException.class)
    public void checkFactorialGivenWrongArgumentThrowsException() {
        //ta ko dùng hàm assertEquals(2 value so sánh)
        //ngoại lệ chỉ có thể thấy nó xh hay ko???
        MathUtil.getFactorial(-5);
    }
    
    
    @Test
    public void checkFactorialGivenRightArgumentReturnsWell() {
        
        long expected = 120;
        long actual = MathUtil.getFactorial(5);        
        Assert.assertEquals(expected, actual);
        
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        Assert.assertEquals(1, MathUtil.getFactorial(0));        
    }
    
   
    
    
}

//QUY ƯỚC XANH ĐỎ:
//1. XANH, TẤT CẢ TÌNH HUỐNG SO SÁNH XÀI HÀM PHẢI CÙNG XANH
//2. ĐỎ, CHỈ CẦN 1 TÌNH HUỐNG XÀI HÀM BỊ ĐỎ, COI NHƯ CẢ HÀM ĐỎ
//ĐỎ:
//HOẶC BẠN TÍNH TOÁN TRONG THUẬT TOÁN/HÀM SAI 
//HOẶC BẠN KÌ VỌNG SAI
