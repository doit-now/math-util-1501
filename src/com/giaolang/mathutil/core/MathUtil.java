/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.giaolang.mathutil.core;

/**
 *
 * @author giao.lang
 */
public class MathUtil {

    //viết hàm tính n! = 1.2.3.4.5...n
    //0! = 1! = 1
    //21! tràn kiểu long
    //<0 ! ko tính đc, ko có giai thừa cho số âm
    public static long getFactorial(int n) {
      
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0..20");
        
        if (n == 0 || n == 1)
            return 1;
        
        long product = 1; //tích dồn
        
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return product;  
    }
    
    public int add(int a, int b) {
        return a + b;
    }
    
}
//TDD - Test Driven Development
//Test First Development 
//Khi viết code ta phải lưu ý ngay viết test cases/tình huống test 
//app/hàm phải đc đề cập ngay
//test ngay những gì ta sẽ viết ra, test trước khi ta viết hoàn 
//thiện code!!!

